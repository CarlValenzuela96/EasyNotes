/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easynotesv1.pkg2;

/**
 *
 * @author carlos
 */
public class EasyNotesV12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        pp.setVisible(true);
    }
    
}
