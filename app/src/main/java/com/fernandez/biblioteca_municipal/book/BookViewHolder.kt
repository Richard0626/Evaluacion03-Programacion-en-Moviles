package com.fernandez.biblioteca_municipal.book

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fernandez.biblioteca_municipal.R
import com.fernandez.biblioteca_municipal.model.Biblioteca

class BookViewHolder(inflater: LayoutInflater,parent:ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_book,parent,false)){
    private var textTitle: TextView? = null
    private var textAuthor: TextView?=null
    private var textCategory: TextView? = null
    private var textEditorial: TextView? = null
    private var textResume: TextView? = null

    init {
        textTitle = itemView.findViewById(R.id.textTitle)
        textAuthor = itemView.findViewById(R.id.textAuthor)
        textCategory = itemView.findViewById(R.id.textCategory)
        textEditorial = itemView.findViewById(R.id.textEditorial)
        textResume = itemView.findViewById(R.id.textResume)

    }

    fun bind(biblioteca: Biblioteca){
        textTitle?.text     = biblioteca.title
        textAuthor?.text    = "Autor  "+ biblioteca.author
        textCategory?.text  = "Categoria "+ biblioteca.category
        textEditorial?.text = "Editorial "+ biblioteca.editorial
        textResume?.text    = biblioteca.resume
    }
}