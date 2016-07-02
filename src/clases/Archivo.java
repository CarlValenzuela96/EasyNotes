package clases;

import java.io.*;

public class Archivo {

    private Ramo ramo;

    public void crearArchivoMixto(String nombre, String tipo, String cantNT, String cantNP, String pondTeo, String pondPract) throws IOException {

        File f = new File("Ramos//" + nombre + ".txt");
        FileWriter fw;
        BufferedWriter bw;

        if (f.exists()) {

            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write(nombre + "%" + tipo + "%" + cantNT + "%" + cantNP + "%" + pondTeo + "%" + pondPract);

        } else {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            bw.write(nombre + "%" + tipo + "%" + cantNT + "%" + cantNP + "%" + pondTeo + "%" + pondPract);

        }
        bw.close();
        fw.close();

//        throw new UnsupportedOperationException();
    }

    public void agregarNotasMixto(String nombre) throws IOException {
        File f = new File("Ramos//" + nombre + ".txt");
        FileWriter fw;
        BufferedWriter bw;

        if (f.exists()) {

            fw = new FileWriter(f,true);
            bw = new BufferedWriter(fw); 
           
            bw.newLine();
             bw.write("1");
              bw.newLine();
             bw.write("2");
       
        bw.close();
        fw.close();
        }
    }

    public void crearArchivoSimple(String nombre, String tipo, String cantN) throws IOException {

        File f = new File("Ramos//" + nombre + ".txt");
        FileWriter fw;
        BufferedWriter bw;

        if (f.exists()) {

            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write(nombre + "%" + tipo + "%" + cantN);

        } else {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            bw.write(nombre + "%" + tipo + "%" + cantN);

        }
        bw.close();
        fw.close();

//        throw new UnsupportedOperationException();
    }

    public void editarArchivo() {

        throw new UnsupportedOperationException();
    }

    public void leerArchivo() {

        throw new UnsupportedOperationException();
    }

    public void eliminarArchivo(String nomArchivo) {
        File f = new File("Ramos//" + nomArchivo + ".txt");
        if (f.exists()) {
            f.delete();
        }
    }

}