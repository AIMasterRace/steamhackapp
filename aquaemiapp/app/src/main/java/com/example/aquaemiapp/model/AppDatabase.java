package com.example.aquaemiapp.model;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {storedLocation.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract storedLocationDao storedLocationDao();
}