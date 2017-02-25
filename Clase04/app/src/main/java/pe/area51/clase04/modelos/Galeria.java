package pe.area51.clase04.modelos;

/**
 * Created by alumno on 24/02/17.
 */

public class Galeria {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    private String nombre;
    private String rutaImagen;
}
