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

    public double calcPromedioSimple(double[] notas, double[] pond) {
        double cont = 0;
        for (int i = 0; i < notas.length; i++) {
            cont = cont + (notas[i] * (pond[i] / 100));
        }
        double prom = cont;
        return prom;
    }
    
    public double calcNotaFaltante(double[]notas,double[]pond){
        double cont=0; 
        int tam=notas.length;
        for (int i = 0; i < tam-1; i++) {
            cont = cont + (notas[i] * (pond[i] / 100));
        }
        double nf=(4-cont)/(pond[tam-1]/100);
        
        return nf;
    }
    
    public void asignarArchivo(Archivo archivo){
        this.archivo = archivo;
    }

      public double calcNotaPExamen(double[]notas,double[]pond){
        double cont=0; 
        int tam=notas.length;
        for (int i = 0; i < tam-1; i++) {
            cont = cont + (notas[i] * (pond[i] / 100));
        }
        double nf=(3.6-cont)/(pond[tam-1]/100);
        
        return nf;
    }
      
        public void asignarArchivo(Archivo archivo){
        this.archivo = archivo;
    }
    public void crearArchivoSimple(String nombre, String tipo, String cantN) throws IOException {

        archivo.crearArchivoSimple(nombre, tipo, cantN);
    }

    public void crearArchivoMixto(String nombre, String tipo, String cantNT, String cantNP, String pondTeo, String pondPract) throws IOException {

        archivo.crearArchivoMixto(nombre, tipo, cantNT, cantNP, pondTeo, pondPract);
    }
}
