package com.example.mvvnexample.viewmodel;

import android.app.Application;

import com.example.mvvnexample.models.Note;
import com.example.mvvnexample.repo.NoteRepo;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class NoteViewModel extends AndroidViewModel {
    private NoteRepo noteRepo;
    private LiveData<List<Note>> notes;

    public NoteViewModel(@NonNull Application application) {
        super(application);
        noteRepo = new NoteRepo(application);
        notes = noteRepo.getAll();
    }

    public void insert(Note note){
        noteRepo.insert(note);
    }

    public void update(Note note){
        noteRepo.update(note);
    }

    public void delete(Note note){
        noteRepo.delete(note);
    }

    public void deleteAll(){
        noteRepo.deleteAll();
    }

    public LiveData<List<Note>> getAll(){
        return notes;
    }
}
