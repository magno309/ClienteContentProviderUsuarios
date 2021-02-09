package com.melecio.clientecontentproviderusuarios;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cursor cursor = getContentResolver().query(MiProveedorContenidoContract.Usuarios.CONTENT_URI, null, null, null, null);

        while(cursor.moveToNext()){
            Log.d("MiCP", cursor.getInt(0) + " - " + cursor.getString(2));
        }
    }
}