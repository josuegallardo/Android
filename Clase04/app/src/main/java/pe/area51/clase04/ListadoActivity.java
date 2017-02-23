package pe.area51.clase04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import pe.area51.clase04.adapters.AutoAdapter;

public class ListadoActivity extends AppCompatActivity {
    private ListView lvLista;
    private AutoAdapter autoAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);
    lvLista=(ListView)findViewById(R.id.lvLista);

    }

    @Override
    protected void onResume() {
        super.onResume();
        autoAdapter = new AutoAdapter(ListadoActivity.this, MainActivity.listaAutos);
        lvLista.setAdapter(autoAdapter);
    }
}
