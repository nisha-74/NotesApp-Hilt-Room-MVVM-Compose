package com.example.note_hilt_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.note_hilt_app.screen.Header
import com.example.note_hilt_app.screen.NoteScreen
import com.example.note_hilt_app.ui.theme.NoteHiltAppTheme
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NoteHiltAppTheme {
                Column() {
                    Header()
                    NoteScreen()
                }


            }
        }
    }
}

