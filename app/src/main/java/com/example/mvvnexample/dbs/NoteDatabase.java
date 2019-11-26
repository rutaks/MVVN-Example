package com.example.mvvnexample.dbs;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;

public abstract class NoteDatabase extends RoomDatabase {
    private static NoteDatabase instance;

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
