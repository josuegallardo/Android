package pe.area51.clase04;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import pe.area51.clase04.modelos.Auto;

public class MainActivity extends AppCompatActivity {
    private Spinner spMarca, spAnio;
    private EditText etModelo;
    private Button btRegistrar, btTodos;
    static final ArrayList<Auto> listaAutos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spMarca = (Spinner) findViewById(R.id.spMarca);
        spAnio = (Spinner) findViewById(R.id.spAnio);
        etModelo = (EditText) findViewById(R.id.etModelo);
        btRegistrar = (Button) findViewById(R.id.btRegistrar);
        btTodos = (Button) findViewById(R.id.btTodos);
    }

    @Override
    protected void onResume() {
        super.onResume();
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 1990; i <= 2017; i++) {
            lista.add(String.valueOf(i));
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_spinner_dropdown_item,
                lista);
        spAnio.setAdapter(arrayAdapter);
        btRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoMarca = spMarca.getSelectedItem().toString(),
                        textoModelo = etModelo.getText().toString(),
                        textoAnio = spAnio.getSelectedItem().toString();
                if (textoModelo.trim().length() == 0) {
                    etModelo.setError("Llena");
                    return;
                }
                Auto auto = new Auto();
                auto.setId(listaAutos.size() + 1);
                auto.setAnio(textoAnio);
                auto.setMarca(textoMarca);
                auto.setModelo(textoModelo);
                listaAutos.add(auto);
                Toast.makeText(MainActivity.this, "Se registro correctamente.", Toast.LENGTH_SHORT).show();
            }
        });
        btTodos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        MainActivity.this, ListadoActivity.class);
                startActivity(intent);
                //finish();
            }
        });
    }
}
