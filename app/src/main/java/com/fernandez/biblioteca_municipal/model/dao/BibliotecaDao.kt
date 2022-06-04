package com.fernandez.biblioteca_municipal.model.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.fernandez.biblioteca_municipal.model.Biblioteca

@Dao
interface BibliotecaDao {
    @Insert
    fun insert(biblioteca: Biblioteca)

    @Update
    fun update(biblioteca: Biblioteca)

    @Delete
    fun delete(biblioteca: Biblioteca)

    @Query("SELECT * FROM book_table ")
    fun getListBook(): LiveData<List<Biblioteca>>

    @Query("update book_table set title_book=:title,author_book=:author, category_book=:category, editorial_book=:editorial where book_id=:id")
    fun update(title: String, author: String, category: String, editorial: String, id: Int)

}