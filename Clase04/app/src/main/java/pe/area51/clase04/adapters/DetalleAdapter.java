package pe.area51.clase04.adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import pe.area51.clase04.DatosActivity;
import pe.area51.clase04.fragments.DetalleFragment;

/**
 * Created by alumno on 27/02/17.
 */

public class DetalleAdapter extends FragmentStatePagerAdapter{
    public DetalleAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        DetalleFragment detalleFragment = new DetalleFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("posicion",position);
        detalleFragment.setArguments(bundle);
        return detalleFragment;
    }

    @Override
    public int getCount() {
        return DatosActivity.listaGaleria.size();
    }
}
