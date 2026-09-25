package com.example.note_hilt_app.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

/**
 * This interface contains the methods to interact with the database,
 * defining how your app will read/ write
 * data to the Note table you created earlier
 */
@Dao
interface NoteDao {

    @Insert
    suspend fun insertNote(note: Note)

    @Query("SELECT * FROM notes_table  ORDER BY timeStamp DESC ")
    fun getAllNotes(): Flow<List<Note>>

}