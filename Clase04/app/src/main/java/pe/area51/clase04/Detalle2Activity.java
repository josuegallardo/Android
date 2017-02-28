package pe.area51.clase04;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pe.area51.clase04.adapters.DetalleAdapter;

public class Detalle2Activity extends AppCompatActivity {
    private ViewPager viewPager;
    private DetalleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle2);
        viewPager=(ViewPager)findViewById(R.id.viewPager);
    }

    @Override
    protected void onResume() {
        super.onResume();
        adapter = new DetalleAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        if (getIntent() != null){
            int posicion = getIntent().getIntExtra("posicion", -1);
            if (posicion > -1){
                viewPager.setCurrentItem(posicion);
            }
        }
    }
}
