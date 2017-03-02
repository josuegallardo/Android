package com.example.mac.gruponfake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class UbigeoActivity extends AppCompatActivity {
    private Spinner departamento, provincia;
    private EditText provinciaSeleccionada;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubigeo);
        departamento = (Spinner) findViewById(R.id.spDepartamentos);
        provincia = (Spinner) findViewById(R.id.spProvincia);
        provinciaSeleccionada = (EditText) findViewById(R.id.etProSelec);
    }

    @Override
    protected void onResume() {
        super.onResume();
        departamento.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int listaSeleccion =0;
                if (position == 0)

                {
                    listaSeleccion = R.array.depLima;
                }else{
                    listaSeleccion = R.array.depIca;
                }
                ArrayAdapter arrayAdapter= new ArrayAdapter(UbigeoActivity.this,
                        android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(listaSeleccion));
                provincia.setAdapter(arrayAdapter);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
