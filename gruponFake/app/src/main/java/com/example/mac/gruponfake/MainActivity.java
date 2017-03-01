package com.example.mac.gruponfake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mac.gruponfake.modelos.Hotel;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    private EditText nombre, ciudad, precio ;
    private Button registrar, listar;
    static final ArrayList<Hotel> listaHoteles = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = (EditText) findViewById(R.id.etNombre);
        ciudad = (EditText) findViewById(R.id.etCiudad);
        precio = (EditText) findViewById(R.id.etPrecio);
        registrar = (Button) findViewById(R.id.btRegistrar);
        listar = (Button) findViewById(R.id.btListar);
    }

    @Override
    protected void onResume() {
        super.onResume();

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textNombre = nombre.getText().toString(),
                        textCiudad = ciudad.getText().toString(),
                        textPrecio = precio.getText().toString();
        Hotel hotel = new Hotel();
        hotel.setId(listaHoteles.size() + 1);
        hotel.setNombre(textNombre);
        hotel.setCiudad(textCiudad);
        hotel.setPrecio(textPrecio);
                listaHoteles.add(hotel);
                Toast.makeText(MainActivity.this, "Good", Toast.LENGTH_SHORT).show();

            }
        });
        listar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        MainActivity.this, ListadoActivity.class);
                startActivity(intent);
            }
        });
    }

}
