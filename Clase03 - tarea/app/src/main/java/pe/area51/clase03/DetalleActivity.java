package pe.area51.clase03;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
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
        String ruc = getIntent().getStringExtra("ruc");
        String razonSocial = getIntent().getStringExtra("razon_social");
        String estado = getIntent().getStringExtra("estado");
        String notificacion = getIntent().getStringExtra("notificacion");
        tvResultado.setText(
                Html.fromHtml(
                                "<p><font color=\"#08088A\">RUC: </font>"+ ruc + "</p>" +
                                "<p><font color=\"#08088A\">Razon Social: </font>" + razonSocial + "</p>" +
                                "<p><font color=\"#08088A\">Estado: </font>" + estado +  "</p>" +
                                "<p><font color=\"#08088A\">Recibe Notificaciones: </font>" + notificacion + "</p>"
                )
                );


    }
}
