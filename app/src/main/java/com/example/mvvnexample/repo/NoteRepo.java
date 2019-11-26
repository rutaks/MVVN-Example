package com.example.mvvnexample.repo;

import android.app.Application;

import com.example.mvvnexample.dao.NoteDao;
import com.example.mvvnexample.dbs.NoteDatabase;
import com.example.mvvnexample.models.Note;

import java.util.List;

import androidx.lifecycle.LiveData;

public class NoteRepo {
    private NoteDao noteDao;
    private LiveData<List<Note>> notes;

    public NoteRepo(Application application) {
        NoteDatabase db = NoteDatabase.getInstance(application);
        noteDao = db.noteDao();
        notes = noteDao.getAll();
    }

    public void insert(Note note){

    }

    public void update(Note note){

    }
    public void delete(Note note){

    }

    public void deleteAll(){

    }

    public LiveData<List<Note>> getAll(){
        return notes;
    }
}
