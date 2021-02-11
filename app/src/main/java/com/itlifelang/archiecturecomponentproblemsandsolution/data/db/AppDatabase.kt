package com.itlifelang.archiecturecomponentproblemsandsolution.data.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [PersonEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getPersonDao(): PersonDao
}
