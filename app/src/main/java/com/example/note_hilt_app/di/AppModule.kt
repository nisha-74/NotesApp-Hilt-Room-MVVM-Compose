package com.example.note_hilt_app.di

import android.content.Context
import com.example.note_hilt_app.room.NoteDB
import com.example.note_hilt_app.room.NoteDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * a Hilt module is a class where you define how to
 * build and provide the dependencies(objects like Room
 *   Dao , repositories , retrofit , etc ...)
 *   @Module : to register it as a Hilt component provide
 *   functions inside are annotated with @Provides to tell
 *   Hilt how to create instances
 */

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(@ApplicationContext context: Context): NoteDB {
        return NoteDB.getDataBaseInstance(context)
    }

    @Provides
    @Singleton
    fun provideNoteDao(noteDB: NoteDB): NoteDao {
        return  noteDB.noteDao()

    }
}