package com.example.roominvalidschemaaboutviews

import androidx.room.DatabaseView

/*as long as the value parameter is not totally identical with
* the create view sql stored in table sqlite_master,
* invalid schema error is threw*/
@DatabaseView(
    viewName = "vw_course_with_math_type", value = "SELECT *\n" +
            "FROM course\n" +
            "WHERE type = 'math'"
)
data class CourseView(
    val id: Int,
    val name: String,
    val type: String,
)
