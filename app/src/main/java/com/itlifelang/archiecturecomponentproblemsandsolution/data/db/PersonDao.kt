package com.itlifelang.archiecturecomponentproblemsandsolution.data.db

import androidx.room.Dao
import androidx.room.Query
import io.reactivex.Flowable

@Dao
interface PersonDao : BaseDao<PersonEntity> {

    @Query("SELECT * FROM person")
    fun getPersons(): Flowable<List<PersonEntity>>
}
