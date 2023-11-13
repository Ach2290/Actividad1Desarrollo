package com.example.actividad1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mostrarAlertDialog(View view) {
        // Crea un objeto AlertDialog.Builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        EditText nuevacontraseña = new EditText(this);
        nuevacontraseña.setInputType(InputType.TYPE_CLASS_TEXT);
        nuevacontraseña.setHint("nuevomail@example.com");

        builder.setView(nuevacontraseña);
        // Configura el título y el mensaje
        builder.setTitle("NUEVA CONTRASEÑA");
        builder.setMessage("INGRESA EL MAIL REGISTRADO");

      builder.setPositiveButton("CONFIRMAR", new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface dialog, int which) {
              Toast.makeText(MainActivity.this, "Correo enviado", Toast.LENGTH_SHORT).show();
          }
      });

        // Crea y muestra el cuadro de diálogo
        builder.create().show();
    }
}