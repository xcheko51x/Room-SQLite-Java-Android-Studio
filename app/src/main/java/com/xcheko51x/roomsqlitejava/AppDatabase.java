package com.xcheko51x.roomsqlitejava;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(
        entities = {Usuario.class},
        version = 1
)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DaoUsuario daoUsuario();
}
