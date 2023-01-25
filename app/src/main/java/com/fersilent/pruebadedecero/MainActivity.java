package com.fersilent.pruebadedecero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //Referenciando los componentes graficos
    EditText etNombre;
    TextView tvNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referenciando a los elemntos de mi vista activity_main.xml
        etNombre = findViewById(R.id.etNombre);
        tvNombre = findViewById(R.id.tvNombre);
    }


    //Creando un evento que ejecutara mi boton btnIngresar
    public void onClick(View v){

        //Mediante un switch ejecutaremos la funcionalidad del boton btnIngresar
        switch (v.getId()){
            case R.id.btnIngresar:

                //Capturando el valor de mi EditText etNombre y almacenandolo en un String
                String nombre = etNombre.getText().toString();

                //Asignando el string nombre a mi TextView tvNombre
                tvNombre.setText("Bienvenido: "+nombre);

                //Mostrando por mensaje el nombre ingresado
                Toast.makeText(this, "El nombre es: "+nombre, Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
