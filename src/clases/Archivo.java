package clases;

import java.io.*;

public class Archivo {

    private Ramo ramo;
//crea archivo para ramo mixto
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
    
//crea archivo para ramo simple
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
    
    //guarda notas y ponderaciones en el archivo del ramo creado con anterioridad
      public void guardarNotas(String nombre, double[] notas, double[] pond) throws IOException{
        File f = new File("Ramos//" + nombre + ".txt");
        FileWriter fw = new FileWriter(f,true);
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.newLine();
        for (double nota : notas) {
            bw.write(Double.toString(nota)+"%");
        }
        bw.newLine();
        for (double p : pond) {
            bw.write(Double.toString(p)+"%");
        }
        bw.close();
        fw.close();
    }
//lee un archivo y lo transforma en matriz para extraer los datos
    public String[][] leerArchivoRamo(String nombre) throws IOException {
        File f = new File("Ramos//" + nombre + ".txt");
        String[][] datos = new String[5][8];
        if (f.exists()) {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            int i = 0;
            while ((linea = br.readLine()) != null) {
                datos[i++] = linea.split("%");
            }
            br.close();
            fr.close();
        }

        return datos;
    }
//elimina un archivo a eleccion
    public void eliminarArchivo(String nomArchivo) {
        File f = new File("Ramos//" + nomArchivo + ".txt");
        if (f.exists()) {
            f.delete();
        }
    }

}
