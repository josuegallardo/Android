package pe.area51.clase04.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import pe.area51.clase04.R;
import pe.area51.clase04.modelos.Auto;

/**
 * Created by alumno on 22/02/17.
 */

public class AutoAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Auto> lista;

    public AutoAdapter(Context context, ArrayList<Auto> lista) {
        this.context = context;
        this.lista = lista;
    }
    //Metodo que sabe cuantos elemntos tiene la lista
    @Override
    public int getCount() {
        return lista.size();
    }
    //Obtiene un elemento de la lsta segun la posicion
    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }
    //Obtiene el identificador unico de cada elemento de la lista
    @Override
    public long getItemId(int position) {
        return lista.get(position).getId();
    }
    //Realiza el diseño y vincularlo con los datos a mostrar
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(context).inflate(R.layout.item_auto_left, viewGroup, false);

        TextView marca= (TextView)view.findViewById(R.id.tvMarca);
        TextView modelo= (TextView)view.findViewById(R.id.tvModelo);
        TextView anio = (TextView)view.findViewById(R.id.tvAnio);
        Auto auto = (Auto) getItem(position);
        marca.setText(auto.getMarca());
        modelo.setText(auto.getModelo());
        anio.setText(auto.getAnio());

        return view;
    }
}
