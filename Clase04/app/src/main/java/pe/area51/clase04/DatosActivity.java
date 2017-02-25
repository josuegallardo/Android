package pe.area51.clase04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

import pe.area51.clase04.adapters.GaleriaAdapter;
import pe.area51.clase04.modelos.Auto;
import pe.area51.clase04.modelos.Galeria;

public class DatosActivity extends AppCompatActivity {
private TextView tvDatos;
    private ArrayList<Galeria> listaGaleria;
    private GridView gvDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        tvDatos=(TextView) findViewById(R.id.tvDatos);
        gvDatos=(GridView) findViewById(R.id.gvDatos);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (getIntent() != null) {
        int posicion = getIntent().getIntExtra("position", -1);
            if (posicion > -1){
                Auto auto = MainActivity.listaAutos.get(posicion);
                tvDatos.setText(auto.getModelo() + " - " + auto.getMarca() + " - " + auto.getAnio());
                }
            }
        listaGaleria = new ArrayList<>();
        Galeria galeria = new Galeria();
        galeria.setNombre("Nombre 1");
        galeria.setRutaImagen("http://biotrendies.com/wp-content/uploads/2015/07/carne-pollo.jpg");
        listaGaleria.add(galeria);
        Galeria galeria1 = new Galeria();
        galeria1.setNombre("Nombre 2");
        galeria1.setRutaImagen("https://static.pexels.com/photos/2740/nature-animal-fur-dangerous.jpg");
        listaGaleria.add(galeria1);
        Galeria galeria2 = new Galeria();
        galeria2.setNombre("Nombre 3");
        galeria2.setRutaImagen("https://static.pexels.com/photos/45164/mare-animal-nature-ride-45164.jpeg");
        listaGaleria.add(galeria2);

        Galeria galeria3 = new Galeria();
        galeria3.setNombre("Nombre 3");
        galeria3.setRutaImagen("http://media.salon.com/2008/08/star_wars_the_clone_wars.jpg");
        listaGaleria.add(galeria3);
        Galeria galeria4 = new Galeria();
        galeria4.setNombre("Nombre 3");
        galeria4.setRutaImagen("http://2.bp.blogspot.com/-9B62xcpgvZw/T4hhlVQIFJI/AAAAAAAABrA/MEJB1sSAMdM/s1600/Characters+Needed+In+The+Clone+Wars+line+2.png");
        listaGaleria.add(galeria4);
        Galeria galeria5 = new Galeria();
        galeria5.setNombre("Nombre 3");
        galeria5.setRutaImagen("http://s3.amazonaws.com/uploads.kidzworld.com/article/32733/clone3.jpg?1252973527");
        listaGaleria.add(galeria5);


        GaleriaAdapter galeriaAdapter = new GaleriaAdapter(DatosActivity.this, listaGaleria);
        gvDatos.setAdapter(galeriaAdapter);


        }

}
