package com.example.mac.gruponfake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.mac.gruponfake.adapter.HotelAdapter;

public class ListadoActivity extends AppCompatActivity {
    private ListView lvLista;
    private HotelAdapter hotelAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);
        lvLista = (ListView) findViewById(R.id.lvLista);
    }

    @Override
    protected void onResume() {
        super.onResume();
        hotelAdapter = new HotelAdapter(ListadoActivity.this, MainActivity.listaHoteles);
        lvLista.setAdapter(hotelAdapter);
        lvLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListadoActivity.this, UbigeoActivity.class);
                        startActivity(intent);
            }
        });
    }
}
