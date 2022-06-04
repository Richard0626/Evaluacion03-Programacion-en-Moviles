package com.fernandez.biblioteca_municipal.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "book_table")
class Biblioteca (

    @ColumnInfo(name= "title_book")
    val title:String,

    @ColumnInfo(name = "author_book")
    val author:String,

    @ColumnInfo(name = "category_book")
    val category:String,

    @ColumnInfo(name = "editorial_book")
    val editorial:String,

    @ColumnInfo(name = "resume_book")
    val resume :String){

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "book_id")
    var bookID: Int = 0
    }
