/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easynotesv1.pkg2;

import clases.*;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author carlos
 */
public class EasyNotesV12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Inicio i = new Inicio();
        i.setVisible(true);
        try {
        i.L1.setVisible(true);
        i.jLabel1.setText("Cargando Interfaz...");
        Thread.sleep (1000);
        i.L2.setVisible(true);
        i.jLabel1.setText("Cargando Contenido...");
        Thread.sleep (1000);
        i.L3.setVisible(true);
        i.jLabel1.setText("Importando Archivos...");
        Thread.sleep (500);
        } catch (Exception e) {
        
        }
        i.dispose();
        
        PaginaPrincipal pp= new PaginaPrincipal();
        File dir = new File("Ramos");
        if (!dir.exists()) {
            dir.mkdir();
        }
        for (File ramo : dir.listFiles()) {
            Archivo carga = new Archivo();
            String[][] l = carga.leerArchivoRamo(ramo.getName().replace(".txt",""));
            Ramo leer;
            if(l[0][1].equals("Teórico")||l[0][1].equals("Práctico")){
                Simple s = new Simple();
                s.setNotas(Byte.parseByte(l[0][2]));
                leer = s;
            }else{
                Mixto m = new Mixto();
                m.setCantNT(Byte.parseByte(l[0][2]));
                m.setCantNP(Byte.parseByte(l[0][3]));
                m.setPond_parct(Double.parseDouble(l[0][4]));
                m.setPond_teo(Double.parseDouble(l[0][5]));
                leer = m;
            }
            leer.setNombre(l[0][0]);
            leer.setTipo(l[0][1]);
            leer.asignarArchivo(carga);
            pp.ramoNuevo(leer);
        }
        
        pp.setVisible(true);
    
    }
    
}
