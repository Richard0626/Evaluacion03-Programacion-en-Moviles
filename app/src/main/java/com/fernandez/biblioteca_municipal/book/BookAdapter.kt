package com.fernandez.biblioteca_municipal.book

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fernandez.biblioteca_municipal.model.Biblioteca

class BookAdapter: RecyclerView.Adapter<BookViewHolder>() {


    private var bookList = emptyList<Biblioteca>()


    fun setBook(bibliotecas: List<Biblioteca>){
        this.bookList=bibliotecas
        this.notifyDataSetChanged()
    }

    override fun getItemCount(): Int = bookList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return BookViewHolder(inflater,parent)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book : Biblioteca = bookList[position]
        holder.bind(book)
    }


}