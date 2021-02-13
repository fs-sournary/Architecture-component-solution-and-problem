package com.itlifelang.archiecturecomponentproblemsandsolution.data.db

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import io.reactivex.Completable

/**
 * The base class for Room Dao classes
 */
interface BaseDao<T> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(item: T): Completable

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(items: List<T>): Completable

    @Delete
    fun delete(item: T): Completable
}
