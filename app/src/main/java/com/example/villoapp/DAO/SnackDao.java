package com.example.villoapp.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.villoapp.Model.Snack;

import java.util.List;

@Dao
public interface SnackDao {
    @Insert
    void insert(Snack snack);

    @Delete
    void delete(Snack snack);

    @Update
    void update(Snack snack);

    @Query("SELECT * FROM snack_table")
    List<Snack> getAllSnacks();

    @Query("SELECT * FROM snack_table WHERE id = :snackId")
    Snack getSnackById(int snackId);

    @Query("DELETE FROM snack_table")
    void deleteAllSnacks();
}
