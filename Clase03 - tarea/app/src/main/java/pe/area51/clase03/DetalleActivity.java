package pe.area51.clase03;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by alumno on 20/02/17.
 */

public class DetalleActivity extends AppCompatActivity{
    private TextView tvResultado;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiry_detalle);
        tvResultado = (TextView) findViewById(R.id.tvTexto);
        if (getIntent() != null){
            if (getIntent().hasExtra("ruc")) {
                String ruc = getIntent().getStringExtra("ruc");
                tvResultado.setText(ruc);
            }



        }

    }
}
