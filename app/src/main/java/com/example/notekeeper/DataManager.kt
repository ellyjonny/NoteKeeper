package com.example.notekeeper

object DataManager {
    val courses = HashMap<String,CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeNotes()
        initializeCourses()
    }

   private fun initializeCourses(){

      var course = CourseInfo( "android_intents", "Android Programming with Intents")
       courses.set(course.courseId, course)

       course = CourseInfo( "java_lang", "Android Programming with Java")
       courses.set(course.courseId, course)

       course = CourseInfo("android_async", "Android with Intents Synchronization")
       courses.set(course.courseId, course)

        course = CourseInfo( "android_kotlin", "Android Programming with Kotlin")
       courses.set(course.courseId, course)
   }

    private  fun initializeNotes(){

    }
}