package com.example.roominvalidschemaaboutviews

import androidx.room.Dao
import androidx.room.Query

@Dao
interface CourseDao {
    @Query("select * from course")
    suspend fun courseList(): List<CourseEntity>
}