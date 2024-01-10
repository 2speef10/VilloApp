package com.example.villoapp.Model;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.villoapp.DAO.SnackDao;
import com.example.villoapp.DAO.UserDao;
import com.example.villoapp.Model.User;

@Database(version = 1, entities = {User.class, Snack.class}) // Voeg Snack toe als entiteit
public abstract class DatabaseHelper extends RoomDatabase {

    private static DatabaseHelper INSTANCE;

    public static synchronized DatabaseHelper getInstance(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            DatabaseHelper.class, "VilloApp.sqlite")
                    .build();
        }
        return INSTANCE;
    }

    // Voeg de methode toe om de SnackDao te retourneren
    public abstract SnackDao getSnackDao();
    public abstract UserDao getUserDao();
}
