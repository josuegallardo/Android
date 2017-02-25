package pe.area51.clase04.aplicacion;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by alumno on 24/02/17.
 */

public class Clase05App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(getApplicationContext());
    }
}
