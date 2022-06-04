package com.fernandez.biblioteca_municipal.book

import android.app.Application
import androidx.lifecycle.LiveData
import com.fernandez.biblioteca_municipal.database.TecsupRoomDatabase
import com.fernandez.biblioteca_municipal.model.Biblioteca
import com.fernandez.biblioteca_municipal.model.dao.BibliotecaDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class BookRepository(application: Application) {
    private val bibliotecaDao: BibliotecaDao? = TecsupRoomDatabase.getInstance(application)?.bibliotecaDao()

    //live data : clase contenedora de datos observables
    fun getBooks(): LiveData<List<Biblioteca>>{
        return bibliotecaDao?.getListBook()!!

    }
    private suspend fun proccessInsertBook(book: Biblioteca){
        withContext(Dispatchers.Default){
            bibliotecaDao?.insert(book)
        }
    }
    suspend fun insertBookWithCoroutines(book: Biblioteca){
        proccessInsertBook(book)
    }


}