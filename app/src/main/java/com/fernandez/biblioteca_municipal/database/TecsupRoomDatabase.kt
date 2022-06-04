package com.fernandez.biblioteca_municipal.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.fernandez.biblioteca_municipal.model.Biblioteca
import com.fernandez.biblioteca_municipal.model.dao.BibliotecaDao

@Database(entities = [Biblioteca::class], version = 1)
abstract class TecsupRoomDatabase: RoomDatabase() {

    abstract fun bibliotecaDao():BibliotecaDao

    companion object {

        private const val DATABASE_NAME = "tecsup_database"

        @Volatile
        private var INSTANCE: TecsupRoomDatabase? = null

        fun getInstance(context: Context): TecsupRoomDatabase? {
            INSTANCE?: synchronized(this) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    TecsupRoomDatabase::class.java,
                    DATABASE_NAME
                ).build()
            }
            return INSTANCE
        }

    }
}