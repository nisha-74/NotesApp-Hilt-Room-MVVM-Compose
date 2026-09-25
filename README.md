# 📝 Notes App — Hilt + Room + MVVM + Jetpack Compose

A modern **Notes App** built using **Kotlin, Jetpack Compose, MVVM architecture, Hilt Dependency Injection, Room Database, and StateFlow**.

The app demonstrates how to build a clean and maintainable Android application with local database storage and reactive UI updates.

## 🚀 Tech Stack

* **Kotlin**
* **Jetpack Compose**
* **MVVM Architecture**
* **Hilt** — Dependency Injection
* **Room Database** — Local Data Storage
* **StateFlow** — Reactive UI State
* **ViewModel**
* **Coroutines**
* **Repository Pattern**
* **Material 3**

## ✨ Features

* ➕ Add new notes
* 📋 Display saved notes
* ✏️ Update notes
* 🗑️ Delete notes
* 💾 Store notes locally using Room Database
* 🔄 Reactive UI updates using StateFlow
* 💉 Dependency injection using Hilt
* 🏗️ MVVM architecture
* 🎨 Modern UI using Jetpack Compose

## 🏗️ Architecture

```text
        Jetpack Compose UI
                ↓
           ViewModel
                ↓
           Repository
                ↓
          Room Database
                ↓
              DAO
```

The application follows the **MVVM architecture** with a Repository layer to separate data access from the UI.

## 📂 Project Structure

```text
com.example.notesapp
│
├── data
│   ├── dao
│   │   └── NoteDao.kt
│   │
│   ├── database
│   │   └── NoteDatabase.kt
│   │
│   ├── entity
│   │   └── Note.kt
│   │
│   └── repository
│       └── NoteRepository.kt
│
├── di
│   └── DatabaseModule.kt
│
├── presentation
│   ├── screen
│   │   └── NotesScreen.kt
│   │
│   └── viewmodel
│       └── NoteViewModel.kt
│
└── MainActivity.kt
```

## 🗄️ Room Database

Room is used as the local persistence library.

The data flow is:

```text
Compose UI
    ↓
ViewModel
    ↓
Repository
    ↓
DAO
    ↓
Room Database
```

The `NoteDao` handles database operations such as:

* Insert
* Update
* Delete
* Fetch notes

## 🔄 StateFlow

`StateFlow` is used to expose the current notes state from the ViewModel.

When the database changes, the state is updated and Jetpack Compose automatically recomposes the UI.

```text
Room Database
      ↓
     DAO
      ↓
 Repository
      ↓
  ViewModel
      ↓
 StateFlow
      ↓
 Compose UI
```

## 💉 Hilt Dependency Injection

Hilt is used to provide dependencies such as:

* Room Database
* DAO
* Repository
* ViewModel dependencies

This makes the application easier to maintain and test.

## 📸 Screenshots

### Notes App

<p align="center">
  <img src="screenshots/ui.png" alt="Notes App Screenshot" width="300">
</p>

## 📁 Screenshot Folder

```text
NotesApp-Hilt-Room-MVVM-Compose/
│
├── screenshots/
│   └── notes_screen.png
│
├── app/
├── build.gradle.kts
└── README.md
```

## 🛠️ How to Run

1. Clone the repository:

```bash
git clone https://github.com/nisha-74/NotesApp-Hilt-Room-MVVM-Compose.git
```

2. Open the project in Android Studio.

3. Sync the Gradle files.

4. Run the application on an Android emulator or physical device.

## 🎯 Learning Objectives

This project demonstrates practical implementation of:

* Jetpack Compose
* MVVM
* Hilt Dependency Injection
* Room Database
* DAO
* Repository Pattern
* ViewModel
* StateFlow
* Kotlin Coroutines
* Reactive UI development

## 👩‍💻 Author

**Nisha Kumari**

Android Developer | Kotlin | Jetpack Compose | MVVM
