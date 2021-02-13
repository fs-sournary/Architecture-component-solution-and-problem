package com.itlifelang.archiecturecomponentproblemsandsolution.repository.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.itlifelang.archiecturecomponentproblemsandsolution.data.api.Api
import com.itlifelang.archiecturecomponentproblemsandsolution.data.db.PersonDao
import com.itlifelang.archiecturecomponentproblemsandsolution.di.IoScheduler
import com.itlifelang.archiecturecomponentproblemsandsolution.di.MainScheduler
import com.itlifelang.archiecturecomponentproblemsandsolution.mapper.mapToEntity
import com.itlifelang.archiecturecomponentproblemsandsolution.mapper.mapToPerson
import com.itlifelang.archiecturecomponentproblemsandsolution.model.Person
import com.itlifelang.archiecturecomponentproblemsandsolution.result.Result
import io.reactivex.Scheduler
import io.reactivex.disposables.CompositeDisposable

class DefaultHomeRepository(
    private val api: Api,
    private val personDao: PersonDao,
    @MainScheduler private val mainScheduler: Scheduler,
    @IoScheduler private val ioScheduler: Scheduler
) : HomeRepository {

    private val compositeDisposable = CompositeDisposable()

    override fun getPersons(): LiveData<Result<List<Person>>> {
        val result = MutableLiveData<Result<List<Person>>>()
        result.value = Result.Loading
        val disposable = api.getPersonList()
            .subscribeOn(ioScheduler)
            .observeOn(mainScheduler)
            .subscribe(
                { persons ->
                    result.value = Result.Success(persons)
                },
                { throwable ->
                    result.value = Result.Error(Exception(throwable))
                }
            )
        compositeDisposable.add(disposable)
        return result
    }

    override fun getLocalPersons(): LiveData<Result<List<Person>>> {
        val result = MutableLiveData<Result<List<Person>>>()
        val disposable = personDao.getPersons()
            .subscribeOn(ioScheduler)
            .observeOn(mainScheduler)
            .subscribe(
                { personEntities ->
                    val persons = personEntities.map { it.mapToPerson() }
                    result.value = Result.Success(persons)
                },
                { throwable ->
                    result.value = Result.Error(Exception(throwable))
                }
            )
        compositeDisposable.add(disposable)
        return result
    }

    override fun savePersonToDb(person: Person) {
        val disposable = personDao.insert(person.mapToEntity()).subscribeOn(ioScheduler).subscribe()
        compositeDisposable.add(disposable)
    }

    override fun deletePersonFromDb(person: Person) {
        val disposable = personDao.delete(person.mapToEntity()).subscribeOn(ioScheduler).subscribe()
        compositeDisposable.add(disposable)
    }

    override fun clear() {
        compositeDisposable.clear()
    }
}
