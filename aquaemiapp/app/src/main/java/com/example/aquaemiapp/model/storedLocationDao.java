package com.example.aquaemiapp.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface storedLocationDao {
    @Query("SELECT * FROM storedLocations")
    List<storedLocation> getAll();

    @Query("SELECT * FROM storedLocations WHERE uid IN (:storedLocationIds)")
    List<storedLocation> loadAllByIds(int[] storedLocationIds);

    @Query("SELECT * FROM storedLocations WHERE name LIKE :name")
    storedLocation findByName(String name);

    @Query("SELEC")

    @Insert
    void insertAll(storedLocation... storedLocations);

    @Delete
    void delete(storedLocation storedLocation);
}