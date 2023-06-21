package com.example.myapplicationusuarioui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        TextView Informacion =(TextView) findViewById(R.id.Informacion);
        Bundle bundle =this.getIntent().getExtras();
        Informacion.setText("HOLA! "+bundle.getString("GENERO") + "\n" + "SU NOMBRE ES=" + "  " + bundle.getString("NOMBRE" )+ "\n"
        + "SU  DE CEDULA ES EL SIGUIENTE= " + " "+ bundle.getString("CEDULA")+ "\n"
        + "SU FECHA DE NACIMIENTO ES= " + " "+ bundle.getString("Fnaci") + "\n"
        + "CIUDAD DONDE SE ENCUENTRA= "+ " "+ bundle.getString("CIUDAD")+ "\n"
        + "SU CORREO ES= "+ " "+ bundle.getString("CORREO")+ "\n"
        + "SU NUMERO DE TELEFONO ES= "+ " "+ bundle.getString("TELEFONO"));
    }
}