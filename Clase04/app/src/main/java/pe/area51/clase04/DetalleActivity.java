package pe.area51.clase04;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

public class DetalleActivity extends AppCompatActivity {
    private SimpleDraweeView sdvImage;
    private TextView tvTexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        sdvImage=(SimpleDraweeView)findViewById(R.id.sdvImage);
        tvTexto=(TextView)findViewById(R.id.tvTexto);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (getIntent() != null){
            String rutaImagen = getIntent().getStringExtra("rutaImagen");
            String nombre = getIntent().getStringExtra("nombreImagen");

            tvTexto.setText(nombre);
            sdvImage.setImageURI(Uri.parse(rutaImagen));

        }

    }
}
