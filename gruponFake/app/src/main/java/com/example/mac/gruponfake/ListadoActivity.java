package com.example.mac.gruponfake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    }
}
