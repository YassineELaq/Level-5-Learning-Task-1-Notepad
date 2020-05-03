package com.example.level5learningtask1notepad.vm

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.level5learningtask1notepad.repo.NoteRepository

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {

    private val noteRepository = NoteRepository(application.applicationContext)

    var note = noteRepository.getNotepad()

}