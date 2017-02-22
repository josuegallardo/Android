package pe.area51.clase03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText razonSocial, ruc;
    private RadioButton activo, inactivo;
    private CheckBox notificaciones;
    private Button verificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        razonSocial = (EditText) findViewById(R.id.etRazonSocial);
        ruc = (EditText) findViewById(R.id.etRUC);
        activo = (RadioButton) findViewById(R.id.rbActivo);
        inactivo = (RadioButton) findViewById(R.id.rbInactivo);
        notificaciones = (CheckBox) findViewById(R.id.cbNotificaciones);
        verificar = (Button) findViewById(R.id.btnVerificar);
    }
    @Override
    protected void onResume(){
        super.onResume();
        verificar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String rUC=ruc.getText().toString(),
                        rAzonSocial=razonSocial.getText().toString(),
                        estado =(
                                activo.isChecked()?
                                        activo.getText().toString() : inactivo.getText().toString()
                                );
                boolean recibeNotificaciones = notificaciones.isChecked();
                if (rUC.trim().length()==0){
                    ruc.setError("Igrese un RUC");
                    Toast.makeText(MainActivity.this, "Bestia", Toast.LENGTH_SHORT).show();
                    return;
                }else {ruc.setError(null);}
                if (rAzonSocial.trim().length()==0){
                    razonSocial.setError("Ingrese Razon Social");
                    Toast.makeText(MainActivity.this, "Bestia", Toast.LENGTH_SHORT).show();
                }else {razonSocial.setError(null);}

                Toast.makeText(MainActivity.this, "Todo bien", Toast.LENGTH_SHORT).show();
                //Enviar datos al DetalleActivity
                Intent intent=new Intent(MainActivity.this, DetalleActivity.class);
                        intent.putExtra("ruc", rUC);
                        intent.putExtra("razon_social", rAzonSocial);
                        intent.putExtra("estado", estado);
                        intent.putExtra("notificacion", recibeNotificaciones); //Boolean
                startActivity(intent);
            }
        });
    }
}
