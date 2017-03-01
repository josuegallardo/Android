package com.example.mac.gruponfake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mac.gruponfake.modelos.Hotel;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {
    static final ArrayList<Hotel> listaHoteles = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaHoteles =
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
