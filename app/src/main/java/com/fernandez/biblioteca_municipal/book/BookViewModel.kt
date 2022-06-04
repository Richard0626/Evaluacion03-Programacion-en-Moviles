package com.fernandez.biblioteca_municipal.book

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.fernandez.biblioteca_municipal.model.Biblioteca
import kotlinx.coroutines.launch

class BookViewModel(application: Application):AndroidViewModel(application) {
    private val repository= BookRepository(application)

    //Listado
    val books = repository.getBooks()

    //Registros
    fun saveBook(biblioteca: Biblioteca){
        viewModelScope.launch {
            repository.insertBookWithCoroutines(biblioteca)
        }
    }


}