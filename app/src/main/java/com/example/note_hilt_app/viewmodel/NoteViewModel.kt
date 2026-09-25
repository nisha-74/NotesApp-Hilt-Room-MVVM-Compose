package com.example.note_hilt_app.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.note_hilt_app.repo.NoteRepository
import com.example.note_hilt_app.room.Note
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel : Hold App/Ui Logic  and data Fetches , hold & exposes data from repo
 * works well with jetpack compose , Flow ...
 * Manages coroutines using viewModelScope
 */

@HiltViewModel
class NoteViewModel @Inject constructor(
    private  val repository: NoteRepository
): ViewModel() {
    val allNotes: Flow<List<Note>> = repository.allNotesInDB
    fun insertNote(note: Note)=  viewModelScope.launch {
      repository.insertNote(note)
    }

}
