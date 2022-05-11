package com.xcheko51x.roomsqlitejava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tvUsuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvUsuarios = findViewById(R.id.tvUsuarios);

        List<Usuario> listaUsuarios;

        AppDatabase appDatabase = Room.databaseBuilder(
                getApplicationContext(),
                AppDatabase.class,
                "dbPruebas"
        ).allowMainThreadQueries().build();

        //appDatabase.daoUsuario().insertarUsuario(new Usuario("xcheko51x", "Sergio Peralta", "12345@pruebas.es"));
        //appDatabase.daoUsuario().insertarUsuario(new Usuario("Laura Perez", "laurap", "laura12345@local.com"));
        //appDatabase.daoUsuario().insertarUsuario(new Usuario("Pedro Leal", "pedrol", "pedro232@local.com"));

        //listaUsuarios = appDatabase.daoUsuario().obtenerUsuarios();
        /*String texto = "";
        for(int i = 0 ; i < listaUsuarios.size() ; i++ ) {
            texto = texto + "Usuario "+i+" = "+listaUsuarios.get(i).usuario+", "+listaUsuarios.get(i).nombre+", "+listaUsuarios.get(i).correo+"\n";
        }
        tvUsuarios.setText(texto);*/

        //Usuario user = appDatabase.daoUsuario().obtenerUsuario("xcheko51x");
        //tvUsuarios.setText(user.usuario+", "+user.nombre+", "+user.correo);

        //appDatabase.daoUsuario().actualizarUsuario("xcheko51x", "Sergio Peralta", "12345@local.com");

        appDatabase.daoUsuario().borrarUsuario("xcheko51x");

        listaUsuarios = appDatabase.daoUsuario().obtenerUsuarios();
        String texto = "";
        for(int i = 0 ; i < listaUsuarios.size() ; i++ ) {
            texto = texto + "Usuario "+i+" = "+listaUsuarios.get(i).usuario+", "+listaUsuarios.get(i).nombre+", "+listaUsuarios.get(i).correo+"\n";
        }

        tvUsuarios.setText(texto);
    }
}