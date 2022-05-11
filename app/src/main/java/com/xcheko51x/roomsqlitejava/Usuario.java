package com.xcheko51x.roomsqlitejava;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Usuario {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "usuario")
    public String usuario;
    @ColumnInfo(name = "nombre")
    public String nombre;
    @ColumnInfo(name = "correo")
    public String correo;

    public Usuario(@NonNull String usuario, String nombre, String correo) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.correo = correo;
    }

}
