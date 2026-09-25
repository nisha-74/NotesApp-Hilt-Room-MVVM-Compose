package com.example.note_hilt_app.repo

import com.example.note_hilt_app.room.Note
import com.example.note_hilt_app.room.NoteDao
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


/**
 * Abstracts the data source( Room , Network , ...)
 * Expose clean methods to the viweModel/UI
 * Makes it easy to mock/fake the data  during testing
 * Decouples your app layers
 */
class NoteRepository @Inject constructor(private  val noteDao: NoteDao) {

    suspend fun  insertNote(note: Note){
        noteDao.insertNote(note)
    }
    val allNotesInDB:  Flow<List<Note>> = noteDao.getAllNotes()
}