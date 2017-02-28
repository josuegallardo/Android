package pe.area51.clase04.fragments;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import pe.area51.clase04.DatosActivity;
import pe.area51.clase04.R;
import pe.area51.clase04.modelos.Galeria;

/**
 * Created by alumno on 27/02/17.
 */

public class DetalleFragment extends Fragment{
    private SimpleDraweeView sdvImagen;
    private TextView tvTexto;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root =LayoutInflater.from(getActivity()).inflate(R.layout.fragment_detalle,container, false);
        sdvImagen =(SimpleDraweeView)root.findViewById(R.id.sdvImage);
        tvTexto=(TextView)root.findViewById(R.id.tvTexto);

        if (getArguments() != null) {
            if (getArguments().containsKey("posicion")){
                int posicion = getArguments().getInt("posicion");
                Galeria galeria = DatosActivity.listaGaleria.get(posicion);

                tvTexto.setText(galeria.getNombre());
                sdvImagen.setImageURI(Uri.parse(galeria.getRutaImagen()));
            }

        }
        return root;
    }
}
