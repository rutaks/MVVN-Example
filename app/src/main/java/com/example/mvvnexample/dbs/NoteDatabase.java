package com.example.mvvnexample.dbs;

import android.content.Context;

import com.example.mvvnexample.dao.NoteDao;
import com.example.mvvnexample.models.Note;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Note.class}, version = 1)
public abstract class NoteDatabase extends RoomDatabase {
    private static NoteDatabase instance;
    public abstract NoteDao noteDao();

    public static synchronized NoteDatabase getInstance(Context context){
        if (instance == null) {
           instance = Room.databaseBuilder(context.getApplicationContext(),
                   NoteDatabase.class,
                   "note_database")
                   .fallbackToDestructiveMigration()
                   .build();
        }
        return instance;
    }
}
