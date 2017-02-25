package pe.area51.clase04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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
        lvLista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListadoActivity.this, MainActivity.listaAutos.get(i).getModelo(), Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ListadoActivity.this,DatosActivity.class);
                //Asi se pasa uno por uno
                intent.putExtra("modelo", MainActivity.listaAutos.get(i).getModelo());
                //Asi se manda la posicion para jalar el dato que se desee
                intent.putExtra("position", i);
                startActivity(intent);
            }
        });
    }
}
