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

    //utilizando como parametro el arreglo de notas y el arreglo ponderaciones ya sea teorico o practico
//calcula el promedio de la parte teorica o parte practica
    public double calcPromedioSimple(double[] notas, double[] pond) {
        double cont = 0;
        for (int i = 0; i < notas.length; i++) {
            cont = cont + (notas[i] * (pond[i] / 100));
        }
        double prom = cont;
        return prom;
    }

    //utilizando como parametro el arreglo de notas y el arreglo ponderaciones ya sea teorico o practico
// y recorre los arreglos hasta la penultima posicion ya que la ultima nota es la incognita que necesitamos calcular
    //calcula nota faltante en la ultima prueba para pasar con un 4
    public double calcNotaFaltante(double[] notas, double[] pond) {
        double cont = 0;
        int tam = notas.length;
        for (int i = 0; i < tam - 1; i++) {
            cont = cont + (notas[i] * (pond[i] / 100));
        }
        double nf = (4 - cont) / (pond[tam - 1] / 100);

        return nf;
    }

//utilizando como parametro el arreglo de notas y el arreglo ponderaciones ya sea teorico o practico
// y recorre los arreglos hasta la penultima posicion ya que la ultima nota es la incognita que necesitamos calcular
//calcula nota necesaria para rendir examen    
    public double calcNotaPExamen(double[] notas, double[] pond) {
        double cont = 0;
        int tam = notas.length;
        for (int i = 0; i < tam - 1; i++) {
            cont = cont + (notas[i] * (pond[i] / 100));
        }
        double nf = (3.6 - cont) / (pond[tam - 1] / 100);

        return nf;
    }

    
    public void asignarArchivo(Archivo archivo) {
        this.archivo = archivo;
    }

    //pasa parametros a la clase archivo para crear un archivo de simple
    public void crearArchivoSimple(String nombre, String tipo, String cantN) throws IOException {

        archivo.crearArchivoSimple(nombre, tipo, cantN);
    }

    //pasa parametros a la clase archivo para crear un archivo de mixto
    public void crearArchivoMixto(String nombre, String tipo, String cantNT, String cantNP, String pondTeo, String pondPract) throws IOException {

        archivo.crearArchivoMixto(nombre, tipo, cantNT, cantNP, pondTeo, pondPract);
    }
}
