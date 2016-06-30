package clases;

import java.io.*;


public class Archivo {

    private Ramo ramo;
    
    
    public void crearArchivo(String nombre) throws IOException {
       
        File f = new File("Ramos//"+nombre + ".txt");
        FileWriter fw;
        BufferedWriter bw;

        if (!f.exists()) {

            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write(nombre);

        } else {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            bw.write(nombre);

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

}
