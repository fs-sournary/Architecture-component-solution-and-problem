package com.itlifelang.archiecturecomponentproblemsandsolution.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface PersonDao : BaseDao<PersonEntity> {

    @Query("SELECT * FROM person")
    fun getPersons(): LiveData<List<PersonEntity>>
}
