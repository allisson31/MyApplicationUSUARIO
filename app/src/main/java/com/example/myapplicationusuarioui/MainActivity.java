package com.example.myapplicationusuarioui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Enviar(View view) {
        EditText cedula = findViewById(R.id.editextCedula);
        EditText nombre= findViewById(R.id.editTextNombre);
        EditText fnaci = findViewById(R.id.editTextFNacimineto);
        EditText ciudad= findViewById(R.id.editTextCiudad);
        RadioButton genero = findViewById(R.id.rbMujer);
        EditText correo= findViewById(R.id.editTextEmail);
        EditText telef= findViewById(R.id.editTextPhone);
        String Cedula;
        String Nombre;
        String Fnaci;
        String Ciudad;
        String Genero;
        String Correo;
        String Telef;
        Genero=genero.isChecked()?"ESTIMADA" : "ESTIMADO";
        Cedula=cedula.getText().toString();
        Nombre=nombre.getText().toString();
        Fnaci=fnaci.getText().toString();
        Ciudad=ciudad.getText().toString();
        Correo=correo.getText().toString();
        Telef=telef.getText().toString();
        Intent intent= new Intent(MainActivity.this,MainActivity2.class);

        Bundle b = new Bundle();
        b.putString("CEDULA" ,Cedula);
        b.putString("NOMBRE", Nombre);
        b.putString("FNACI" , Fnaci);
        b.putString("CIUDAD", Ciudad);
        b.putString("GENERO", Genero);
        b.putString("CORREO" , Correo);
        b.putString("TELEF", Telef);
        intent.putExtras(b);
        startActivity(intent);

    }
    public void Limpiar (View view){

        Intent intent= new Intent(MainActivity.this,MainActivity.class);
        startActivity(intent);


    }



    }
