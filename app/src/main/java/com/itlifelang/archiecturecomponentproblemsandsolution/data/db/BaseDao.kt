package com.itlifelang.archiecturecomponentproblemsandsolution.data.db

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy

/**
 * The base class for Room Dao classes
 */
interface BaseDao<T> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(item: T)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(items: List<T>)

    @Delete
    fun delete(item: T)
}
