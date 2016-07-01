package clases;

import java.io.IOException;

public class Ramo {

    private String nombre;
    private String tipo;
    private Archivo archivo;

    public Ramo() {
        this.archivo = new Archivo();
    }

    public Ramo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

     public void crearArchivoSimple(String nombre,String tipo,String cantN ) throws IOException {

        archivo.crearArchivoSimple(nombre,tipo,cantN);
    }
    public void crearArchivoMixto(String nombre,String tipo,String cantNT, String cantNP,String pondTeo, String pondPract) throws IOException {

        archivo.crearArchivoMixto(nombre,tipo,cantNT,cantNP,pondTeo,pondPract);
    }
}
