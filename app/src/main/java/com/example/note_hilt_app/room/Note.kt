package com.example.note_hilt_app.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_table")
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id:Int =0,
    val title:String ,
    val content:String ,
    val timeStamp: Long)
