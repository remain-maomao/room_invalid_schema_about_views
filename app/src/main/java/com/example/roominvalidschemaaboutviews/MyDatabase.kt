package com.example.roominvalidschemaaboutviews

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [CourseEntity::class],
    views = [CourseView::class],
    version = 1,
    exportSchema = true
)
abstract class MyDatabase : RoomDatabase() {
    abstract fun courseDao(): CourseDao

    companion object {
        @Volatile
        private var Instance: MyDatabase? = null

        fun getDatabase(context: Context): MyDatabase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, MyDatabase::class.java, "test")
                    .createFromAsset("database/testview.db")
                    .fallbackToDestructiveMigration()
                    .build()
                    .also { Instance = it }
            }
        }
    }
}