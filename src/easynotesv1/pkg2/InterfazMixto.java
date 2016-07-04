/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easynotesv1.pkg2;

import clases.*;
import java.awt.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class InterfazMixto extends javax.swing.JFrame {

    /**
     * Creates new form TPseparado
     */
    int x, y;

    double[] notasT;
    double[] pondT;
    double[] notasP;
    double[] pondP;
    double prom_Teo;
    double prom_Pract;

    boolean arregloT = false;
    boolean arregloP = false;
    private static final ImageIcon icon = new ImageIcon(InterfazMixto.class.getResource("/recursos/iconoo.png"));

    public InterfazMixto() {
        initComponents();
        setLocationRelativeTo(null);
        promGral.setVisible(true);
        jLabel17.setVisible(true);
        jButton5.setVisible(true);
        this.setIconImage(icon.getImage());
    }

    public void ingresarRamo(Mixto s) throws IOException {
        nombreAsign.setText(s.getNombre());
        tipoAprob.setText(s.getTipo());
        pondTeo.setText(String.valueOf(s.getPond_teo()));
        pondPract.setText(String.valueOf(s.getPond_parct()));
        jLabel15.setText(Integer.toString(s.getCantNT()));
        jLabel16.setText(Integer.toString(s.getCantNP()));
        String[][] data = new Archivo().leerArchivoRamo(s.getNombre());

        if (s.getTipo().equals("TEORICO - PRACTICO por Separado")) {
            promGral.setVisible(false);
            jLabel17.setVisible(false);
            jButton5.setVisible(false);
        }
        if (s.getTipo().equals("TEORICO - PRACTICO en Conjunto")) {
            promGral.setVisible(true);
            jLabel17.setVisible(true);
            jButton5.setVisible(true);
        }
        switch (s.getCantNP()) {
            case 1:
                np2.setVisible(false);
                pp2.setVisible(false);
            case 2:
                np3.setVisible(false);
                pp3.setVisible(false);
            case 3:
                np4.setVisible(false);
                pp4.setVisible(false);
            case 4:
                np5.setVisible(false);
                pp5.setVisible(false);
            case 5:
                np6.setVisible(false);
                pp6.setVisible(false);
            case 6:
                np7.setVisible(false);
                pp7.setVisible(false);
            case 7:
                np8.setVisible(false);
                pp8.setVisible(false);
            case 8:
                break;
        }
        switch (s.getCantNT()) {
            case 1:
                nt2.setVisible(false);
                pt2.setVisible(false);

            case 2:
                nt3.setVisible(false);
                pt3.setVisible(false);
            case 3:
                nt4.setVisible(false);
                pt4.setVisible(false);
            case 4:
                nt5.setVisible(false);
                pt5.setVisible(false);
            case 5:
                nt6.setVisible(false);
                pt6.setVisible(false);
            case 6:
                nt7.setVisible(false);
                pt7.setVisible(false);
            case 7:
                nt8.setVisible(false);
                pt8.setVisible(false);
            case 8:
                break;
        }
        switch (s.getCantNT()) {
            case 8:
                nt8.setText(data[1][7]);
                pt8.setText(data[2][7]);
            case 7:
                nt7.setText(data[1][6]);
                pt7.setText(data[2][6]);
            case 6:
                nt6.setText(data[1][5]);
                pt6.setText(data[2][5]);
            case 5:
                nt5.setText(data[1][4]);
                pt5.setText(data[2][4]);
            case 4:
                nt4.setText(data[1][3]);
                pt4.setText(data[2][3]);
            case 3:
                nt3.setText(data[1][2]);
                pt3.setText(data[2][2]);
            case 2:
                nt2.setText(data[1][1]);
                pt2.setText(data[2][1]);
            case 1:
                nt1.setText(data[1][0]);
                pt1.setText(data[2][0]);
                break;
        }
        switch (s.getCantNP()) {
            case 8:
                np8.setText(data[3][7]);
                pp8.setText(data[4][7]);
            case 7:
                np7.setText(data[3][6]);
                pp7.setText(data[4][6]);
            case 6:
                np6.setText(data[3][5]);
                pp6.setText(data[4][5]);
            case 5:
                np5.setText(data[3][4]);
                pp5.setText(data[4][4]);
            case 4:
                np4.setText(data[3][3]);
                pp4.setText(data[4][3]);
            case 3:
                np3.setText(data[3][2]);
                pp3.setText(data[4][2]);
            case 2:
                np2.setText(data[3][1]);
                pp2.setText(data[4][1]);
            case 1:
                np1.setText(data[3][0]);
                pp1.setText(data[4][0]);
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        pagPrincipal = new javax.swing.JButton();
        jcMousePanel3 = new jcMousePanel.jcMousePanel();
        jLabel1 = new javax.swing.JLabel();
        nombreAsign = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pondTeo = new javax.swing.JLabel();
        pondPract = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nt1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nt2 = new javax.swing.JTextField();
        nt3 = new javax.swing.JTextField();
        nt4 = new javax.swing.JTextField();
        nt5 = new javax.swing.JTextField();
        nt6 = new javax.swing.JTextField();
        nt7 = new javax.swing.JTextField();
        nt8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pt1 = new javax.swing.JTextField();
        pt2 = new javax.swing.JTextField();
        pt3 = new javax.swing.JTextField();
        pt4 = new javax.swing.JTextField();
        pt5 = new javax.swing.JTextField();
        pt6 = new javax.swing.JTextField();
        pt7 = new javax.swing.JTextField();
        pt8 = new javax.swing.JTextField();
        pp2 = new javax.swing.JTextField();
        pp1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        np8 = new javax.swing.JTextField();
        np4 = new javax.swing.JTextField();
        np6 = new javax.swing.JTextField();
        np7 = new javax.swing.JTextField();
        np5 = new javax.swing.JTextField();
        np3 = new javax.swing.JTextField();
        np1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        np2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        pp3 = new javax.swing.JTextField();
        pp4 = new javax.swing.JTextField();
        pp5 = new javax.swing.JTextField();
        pp6 = new javax.swing.JTextField();
        pp7 = new javax.swing.JTextField();
        pp8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        promT = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        promP = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jcMousePanel4 = new jcMousePanel.jcMousePanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        promGral = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        botonCerrar = new javax.swing.JButton();
        botonMin = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        tipoAprob = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jcMousePanel1.setForeground(new java.awt.Color(61, 138, 247));
        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/FondoVentanaDeg.png"))); // NOI18N
        jcMousePanel1.setVisibleLogo(false);

        pagPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bPR.png"))); // NOI18N
        pagPrincipal.setBorder(null);
        pagPrincipal.setBorderPainted(false);
        pagPrincipal.setContentAreaFilled(false);
        pagPrincipal.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bPRP.png"))); // NOI18N
        pagPrincipal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bPRP.png"))); // NOI18N
        pagPrincipal.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bPRP.png"))); // NOI18N
        pagPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagPrincipalActionPerformed(evt);
            }
        });

        jcMousePanel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/line.png"))); // NOI18N
        jcMousePanel3.setVisibleLogo(false);

        javax.swing.GroupLayout jcMousePanel3Layout = new javax.swing.GroupLayout(jcMousePanel3);
        jcMousePanel3.setLayout(jcMousePanel3Layout);
        jcMousePanel3Layout.setHorizontalGroup(
            jcMousePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 215, Short.MAX_VALUE)
        );
        jcMousePanel3Layout.setVerticalGroup(
            jcMousePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(61, 138, 247));
        jLabel1.setText("Tipo Aprobacion:");

        nombreAsign.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombreAsign.setForeground(new java.awt.Color(61, 138, 247));
        nombreAsign.setText("nombreAsign");

        jLabel2.setForeground(new java.awt.Color(61, 138, 247));
        jLabel2.setText("Ponderacion Teorico:");

        jLabel3.setForeground(new java.awt.Color(61, 138, 247));
        jLabel3.setText("Ponderacion Practico:");

        pondTeo.setForeground(new java.awt.Color(61, 138, 247));
        pondTeo.setText("pondTeo");

        pondPract.setForeground(new java.awt.Color(61, 138, 247));
        pondPract.setText("pondPract");

        jLabel4.setForeground(new java.awt.Color(61, 138, 247));
        jLabel4.setText("%");

        jLabel5.setForeground(new java.awt.Color(61, 138, 247));
        jLabel5.setText("%");

        jLabel6.setForeground(new java.awt.Color(61, 138, 247));
        jLabel6.setText("NOTAS");

        nt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nt1ActionPerformed(evt);
            }
        });
        nt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nt1KeyTyped(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(61, 138, 247));
        jLabel7.setText("TEORICO - cantidad de evaluaciones :");

        nt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nt2ActionPerformed(evt);
            }
        });
        nt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nt2KeyTyped(evt);
            }
        });

        nt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nt3ActionPerformed(evt);
            }
        });
        nt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nt3KeyTyped(evt);
            }
        });

        nt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nt4ActionPerformed(evt);
            }
        });
        nt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nt4KeyTyped(evt);
            }
        });

        nt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nt5ActionPerformed(evt);
            }
        });
        nt5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nt5KeyTyped(evt);
            }
        });

        nt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nt6ActionPerformed(evt);
            }
        });
        nt6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nt6KeyTyped(evt);
            }
        });

        nt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nt7ActionPerformed(evt);
            }
        });
        nt7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nt7KeyTyped(evt);
            }
        });

        nt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nt8ActionPerformed(evt);
            }
        });
        nt8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nt8KeyTyped(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(61, 138, 247));
        jLabel8.setText("POND.");

        pt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt1ActionPerformed(evt);
            }
        });

        pt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt2ActionPerformed(evt);
            }
        });

        pt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt3ActionPerformed(evt);
            }
        });

        pt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt4ActionPerformed(evt);
            }
        });

        pt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt5ActionPerformed(evt);
            }
        });

        pt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt6ActionPerformed(evt);
            }
        });

        pt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt7ActionPerformed(evt);
            }
        });

        pt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt8ActionPerformed(evt);
            }
        });

        pp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pp2ActionPerformed(evt);
            }
        });

        pp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pp1ActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(61, 138, 247));
        jLabel9.setText("POND.");

        np8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                np8ActionPerformed(evt);
            }
        });
        np8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                np8KeyTyped(evt);
            }
        });

        np4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                np4ActionPerformed(evt);
            }
        });
        np4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                np4KeyTyped(evt);
            }
        });

        np6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                np6ActionPerformed(evt);
            }
        });
        np6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                np6KeyTyped(evt);
            }
        });

        np7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                np7ActionPerformed(evt);
            }
        });
        np7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                np7KeyTyped(evt);
            }
        });

        np5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                np5ActionPerformed(evt);
            }
        });
        np5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                np5KeyTyped(evt);
            }
        });

        np3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                np3ActionPerformed(evt);
            }
        });
        np3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                np3KeyTyped(evt);
            }
        });

        np1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                np1ActionPerformed(evt);
            }
        });
        np1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                np1KeyTyped(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(61, 138, 247));
        jLabel10.setText("NOTAS");

        np2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                np2ActionPerformed(evt);
            }
        });
        np2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                np2KeyTyped(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(61, 138, 247));
        jLabel11.setText("PRACTICO - cantidad de evaluaciones :");

        pp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pp3ActionPerformed(evt);
            }
        });

        pp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pp4ActionPerformed(evt);
            }
        });

        pp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pp5ActionPerformed(evt);
            }
        });

        pp6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pp6ActionPerformed(evt);
            }
        });

        pp7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pp7ActionPerformed(evt);
            }
        });

        pp8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pp8ActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(61, 138, 247));
        jLabel12.setText("PROMEDIO");

        promT.setEditable(false);
        promT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promTActionPerformed(evt);
            }
        });
        promT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                promTKeyTyped(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(61, 138, 247));
        jLabel13.setText("PROMEDIO");

        promP.setEditable(false);
        promP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promPActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(61, 138, 247));
        jLabel14.setText("NOTA: ingresar las calificaciones y ponderaciones en los recuadros");

        jcMousePanel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/LogoEasyNotes.png"))); // NOI18N
        jcMousePanel4.setVisibleLogo(false);

        javax.swing.GroupLayout jcMousePanel4Layout = new javax.swing.GroupLayout(jcMousePanel4);
        jcMousePanel4.setLayout(jcMousePanel4Layout);
        jcMousePanel4Layout.setHorizontalGroup(
            jcMousePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        jcMousePanel4Layout.setVerticalGroup(
            jcMousePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        jLabel15.setForeground(new java.awt.Color(61, 138, 247));
        jLabel15.setText("cantEvT");

        jLabel16.setForeground(new java.awt.Color(61, 138, 247));
        jLabel16.setText("cantEvP");

        jLabel17.setForeground(new java.awt.Color(61, 138, 247));
        jLabel17.setText("PROMEDIO GENERAL");

        promGral.setEditable(false);
        promGral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promGralActionPerformed(evt);
            }
        });

        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bguardar.png"))); // NOI18N
        guardar.setBorder(null);
        guardar.setBorderPainted(false);
        guardar.setContentAreaFilled(false);
        guardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bguardarP.png"))); // NOI18N
        guardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bguardarP.png"))); // NOI18N
        guardar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bguardarP.png"))); // NOI18N
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guardarMouseExited(evt);
            }
        });
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salir.png"))); // NOI18N
        botonCerrar.setBorder(null);
        botonCerrar.setBorderPainted(false);
        botonCerrar.setContentAreaFilled(false);
        botonCerrar.setPreferredSize(new java.awt.Dimension(44, 19));
        botonCerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salirP.png"))); // NOI18N
        botonCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salirM.png"))); // NOI18N
        botonCerrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salirM.png"))); // NOI18N
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });

        botonMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/mini.png"))); // NOI18N
        botonMin.setBorder(null);
        botonMin.setBorderPainted(false);
        botonMin.setContentAreaFilled(false);
        botonMin.setPreferredSize(new java.awt.Dimension(22, 19));
        botonMin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/miniP.png"))); // NOI18N
        botonMin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/miniM.png"))); // NOI18N
        botonMin.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/miniM.png"))); // NOI18N
        botonMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMinActionPerformed(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(0, 102, 204));
        jLabel18.setText("     EasyNotes 2016");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel18MousePressed(evt);
            }
        });
        jLabel18.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel18MouseDragged(evt);
            }
        });

        tipoAprob.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoAprob.setForeground(new java.awt.Color(61, 138, 247));
        tipoAprob.setText("jLabel19");

        jButton1.setForeground(new java.awt.Color(0, 102, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bextra.png"))); // NOI18N
        jButton1.setText("Prom. Teorico");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bextraP.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bextraP.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bextraP.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(0, 102, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bextra.png"))); // NOI18N
        jButton2.setText("Calc. Teorico");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bextraP.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bextraP.png"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bextraP.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(0, 102, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bextra.png"))); // NOI18N
        jButton3.setText("Calc. Practico");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bextraP.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bextraP.png"))); // NOI18N
        jButton3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bextraP.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel19.setText(".");

        jButton4.setForeground(new java.awt.Color(0, 102, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bextra.png"))); // NOI18N
        jButton4.setText("Prom. Practico");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bextraP.png"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bextraP.png"))); // NOI18N
        jButton4.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bextraP.png"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setForeground(new java.awt.Color(0, 102, 204));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bextra.png"))); // NOI18N
        jButton5.setText("Prom.Gral");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bextraP.png"))); // NOI18N
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bextraP.png"))); // NOI18N
        jButton5.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bextraP.png"))); // NOI18N
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel20.setText(".");

        jLabel21.setText(".");

        jLabel22.setText(".");

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pagPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcMousePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(nombreAsign)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcMousePanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipoAprob)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14))
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel15))
                                            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                                .addComponent(nt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(nt2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(nt3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(nt4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(nt5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(nt6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(nt7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(nt8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                                .addComponent(pt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(pt2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(pt3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(pt4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(pt5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(pt6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(pt7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(pt8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(promT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel21)))
                                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                                        .addComponent(np1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(np2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(np3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(np4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(np5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(np6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(np7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(np8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                                        .addComponent(pp1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(pp2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(pp3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(pp4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(pp5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(pp6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(pp7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(pp8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel13)
                                                    .addComponent(promP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel20)))
                                            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel16)))))
                                .addGap(59, 59, 59)
                                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(promGral, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel22)))
                            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton3)
                                    .addComponent(jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5)))))
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pondTeo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(77, 77, 77)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pondPract)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(botonCerrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonMin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jcMousePanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(pagPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(nombreAsign, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcMousePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tipoAprob))))
                .addGap(18, 18, 18)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pondTeo)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(pondPract)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel15))
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nt1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(nt2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nt3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nt4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nt5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nt6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nt7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nt8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(pt1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pt2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pt3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pt4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pt5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pt6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pt7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pt8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21))
                                .addGap(27, 27, 27)
                                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel16)))
                            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(promT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(promGral, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(np1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(np2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(np3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(np4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(np5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(np6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(np7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(np8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(pp1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pp2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pp3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pp4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pp5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pp6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pp7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pp8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)))
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(promP, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton5)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addGap(4, 4, 4)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nt1ActionPerformed

    private void nt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nt2ActionPerformed

    private void nt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nt3ActionPerformed

    private void nt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nt4ActionPerformed

    private void nt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nt5ActionPerformed

    private void nt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nt6ActionPerformed

    private void nt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nt7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nt7ActionPerformed

    private void nt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nt8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nt8ActionPerformed

    private void pt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pt1ActionPerformed

    private void pt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pt2ActionPerformed

    private void pt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pt3ActionPerformed

    private void pt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pt4ActionPerformed

    private void pt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pt5ActionPerformed

    private void pt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pt6ActionPerformed

    private void pt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pt7ActionPerformed

    private void pt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pt8ActionPerformed

    private void pp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pp2ActionPerformed

    private void pp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pp1ActionPerformed

    private void np8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_np8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_np8ActionPerformed

    private void np4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_np4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_np4ActionPerformed

    private void np6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_np6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_np6ActionPerformed

    private void np7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_np7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_np7ActionPerformed

    private void np5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_np5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_np5ActionPerformed

    private void np3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_np3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_np3ActionPerformed

    private void np1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_np1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_np1ActionPerformed

    private void np2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_np2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_np2ActionPerformed

    private void pp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pp3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pp3ActionPerformed

    private void pp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pp4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pp4ActionPerformed

    private void pp5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pp5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pp5ActionPerformed

    private void pp6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pp6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pp6ActionPerformed

    private void pp7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pp7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pp7ActionPerformed

    private void pp8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pp8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pp8ActionPerformed

    private void promTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_promTActionPerformed

    private void promPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_promPActionPerformed

    private void promGralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promGralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_promGralActionPerformed

    private void pagPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagPrincipalActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null,
                "Los Datos no guardado se eliminarán.\n ¿Desea ir al Menú igualmente?", "Volver Menu Principal", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.OK_OPTION == resp) {
            this.dispose();
            PaginaPrincipal pp = new PaginaPrincipal();
            pp.setTitle("EasyNotes");
            pp.setVisible(true);
        }
    }//GEN-LAST:event_pagPrincipalActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null,
                "Los Datos no guardado se eliminarán.\n ¿Desea salir igualmente?", "Confirmar salida", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.OK_OPTION == resp) {
            System.exit(0);
        }
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void botonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMinActionPerformed
        // TODO add your handling code here:
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_botonMinActionPerformed

    private void jLabel18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel18MousePressed

    private void jLabel18MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseDragged
        // TODO add your handling code here:
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_jLabel18MouseDragged

    private void nt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nt1KeyTyped
        // TODO add your handling code here:
        validacionNota(nt1.getText(), evt);
    }//GEN-LAST:event_nt1KeyTyped

    private void nt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nt2KeyTyped
        // TODO add your handling code here:
        validacionNota(nt2.getText(), evt);
    }//GEN-LAST:event_nt2KeyTyped

    private void nt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nt3KeyTyped
        // TODO add your handling code here:
        validacionNota(nt3.getText(), evt);
    }//GEN-LAST:event_nt3KeyTyped

    private void nt4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nt4KeyTyped
        // TODO add your handling code here:
        validacionNota(nt4.getText(), evt);
    }//GEN-LAST:event_nt4KeyTyped

    private void nt5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nt5KeyTyped
        // TODO add your handling code here:
        validacionNota(nt5.getText(), evt);
    }//GEN-LAST:event_nt5KeyTyped

    private void nt6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nt6KeyTyped
        // TODO add your handling code here:
        validacionNota(nt6.getText(), evt);
    }//GEN-LAST:event_nt6KeyTyped

    private void nt7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nt7KeyTyped
        // TODO add your handling code here:
        validacionNota(nt7.getText(), evt);
    }//GEN-LAST:event_nt7KeyTyped

    private void nt8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nt8KeyTyped
        // TODO add your handling code here:
        validacionNota(nt8.getText(), evt);
    }//GEN-LAST:event_nt8KeyTyped

    private void np1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_np1KeyTyped
        // TODO add your handling code here:
        validacionNota(np1.getText(), evt);
    }//GEN-LAST:event_np1KeyTyped

    private void np2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_np2KeyTyped
        // TODO add your handling code here:
        validacionNota(np2.getText(), evt);
    }//GEN-LAST:event_np2KeyTyped

    private void np3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_np3KeyTyped
        // TODO add your handling code here:
        validacionNota(np3.getText(), evt);
    }//GEN-LAST:event_np3KeyTyped

    private void np4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_np4KeyTyped
        // TODO add your handling code here:
        validacionNota(np4.getText(), evt);
    }//GEN-LAST:event_np4KeyTyped

    private void np5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_np5KeyTyped
        // TODO add your handling code here:
        validacionNota(np5.getText(), evt);
    }//GEN-LAST:event_np5KeyTyped

    private void np6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_np6KeyTyped
        // TODO add your handling code here:
        validacionNota(np6.getText(), evt);
    }//GEN-LAST:event_np6KeyTyped

    private void np7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_np7KeyTyped
        // TODO add your handling code here:
        validacionNota(np7.getText(), evt);
    }//GEN-LAST:event_np7KeyTyped

    private void np8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_np8KeyTyped
        // TODO add your handling code here:
        validacionNota(np8.getText(), evt);
    }//GEN-LAST:event_np8KeyTyped

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
        if (arregloT && arregloP) {
            try {
                // TODO add your handling code here:
                this.guardar();
            } catch (IOException ex) {
                Logger.getLogger(InterfazMixto.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Datos Guardados Exitosamente",
                    "NOTAS GUARDADAS", JOptionPane.WARNING_MESSAGE);
        } else if (!arregloT && !arregloP) {
            JOptionPane.showMessageDialog(null, "Error al guardar, calcula los promedios y vuelve a intentarlo",
                    "NOTAS GUARDADAS", JOptionPane.WARNING_MESSAGE);
        } else if (arregloT && !arregloP) {
            JOptionPane.showMessageDialog(null, "Error al guardar, calcula el promedio practico y vuelve a intentarlo",
                    "NOTAS GUARDADAS", JOptionPane.WARNING_MESSAGE);
        } else if (!arregloT && arregloP) {
            JOptionPane.showMessageDialog(null, "Error al guardar, calcula el promedio teorico y vuelve a intentarlo",
                    "NOTAS GUARDADAS", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        crearArregloTeorico(evt);
        this.arregloT = true;
    }//GEN-LAST:event_jButton1ActionPerformed
    void crearArregloTeorico(java.awt.event.ActionEvent evt) {
        if (jButton1 == evt.getSource()) {
            this.prom_Teo = 0;
        }
        switch (Integer.parseInt(jLabel15.getText())) {
            case 1:
                if (!nt1.getText().equals("") && !pt1.getText().equals("") && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.') {
                    this.notasT = new double[1];
                    notasT[0] = Double.parseDouble(nt1.getText());
                    this.pondT = new double[1];
                    pondT[0] = Double.parseDouble(pt1.getText());
                    if (jButton1 == evt.getSource()) {
                        this.prom_Teo = calcularPromTeorico();
                    } else if (jButton2 == evt.getSource()) {
                        calcularNotaFaltante(pondT, notasT);
                    }
                } else {
                    mensajeError();
                }
                break;
            case 2:

                if (jButton1 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.') {
                        this.notasT = new double[2];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());

                        this.pondT = new double[2];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        this.prom_Teo = calcularPromTeorico();

                    } else {
                        mensajeError();
                    }
                } else if (jButton2 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !pt2.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.') {
                        this.notasT = new double[2];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = 1;

                        this.pondT = new double[2];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());

                        calcularNotaFaltante(pondT, notasT);
                    } else {
                        mensajeError();
                    }
                }

                break;
            case 3:
                if (jButton1 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && !nt3.getText().equals("") && !pt3.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.'
                            && nt3.getText().charAt(0) != '.' && pt3.getText().charAt(0) != '.') {
                        this.notasT = new double[3];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());
                        notasT[2] = Double.parseDouble(nt3.getText());

                        this.pondT = new double[3];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        pondT[2] = Double.parseDouble(pt3.getText());
                        this.prom_Teo = calcularPromTeorico();

                    } else {
                        mensajeError();
                    }
                } else if (jButton2 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && !pt3.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.'
                            && pt3.getText().charAt(0) != '.') {
                        this.notasT = new double[3];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());
                        notasT[2] = 1;

                        this.pondT = new double[3];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        pondT[2] = Double.parseDouble(pt3.getText());
                        calcularNotaFaltante(pondT, notasT);
                    } else {
                        mensajeError();
                    }
                }

                break;
            case 4:

                if (jButton1 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && !nt3.getText().equals("") && !pt3.getText().equals("") && !nt4.getText().equals("") && !pt4.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.'
                            && nt3.getText().charAt(0) != '.' && pt3.getText().charAt(0) != '.' && nt4.getText().charAt(0) != '.' && pt4.getText().charAt(0) != '.') {
                        this.notasT = new double[4];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());
                        notasT[2] = Double.parseDouble(nt3.getText());
                        notasT[3] = Double.parseDouble(nt4.getText());
                        this.pondT = new double[4];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        pondT[2] = Double.parseDouble(pt3.getText());
                        pondT[3] = Double.parseDouble(pt4.getText());
                        this.prom_Teo = calcularPromTeorico();
                    } else {
                        mensajeError();
                    }
                } else if (jButton2 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && !nt3.getText().equals("") && !pt3.getText().equals("") && !pt4.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.'
                            && nt3.getText().charAt(0) != '.' && pt3.getText().charAt(0) != '.' && pt4.getText().charAt(0) != '.') {
                        this.notasT = new double[4];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());
                        notasT[2] = Double.parseDouble(nt3.getText());
                        notasT[3] = 1;
                        this.pondT = new double[4];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        pondT[2] = Double.parseDouble(pt3.getText());
                        pondT[3] = Double.parseDouble(pt4.getText());
                        calcularNotaFaltante(pondT, notasT);
                    } else {
                        mensajeError();
                    }
                }

                break;

            case 5:
                if (jButton1 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && !nt3.getText().equals("") && !pt3.getText().equals("") && !nt4.getText().equals("") && !pt4.getText().equals("")
                            && !nt5.getText().equals("") && !pt5.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.'
                            && nt3.getText().charAt(0) != '.' && pt3.getText().charAt(0) != '.' && nt4.getText().charAt(0) != '.' && pt4.getText().charAt(0) != '.'
                            && nt5.getText().charAt(0) != '.' && pt5.getText().charAt(0) != '.') {
                        this.notasT = new double[5];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());
                        notasT[2] = Double.parseDouble(nt3.getText());
                        notasT[3] = Double.parseDouble(nt4.getText());
                        notasT[4] = Double.parseDouble(nt5.getText());

                        this.pondT = new double[5];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        pondT[2] = Double.parseDouble(pt3.getText());
                        pondT[3] = Double.parseDouble(pt4.getText());
                        pondT[4] = Double.parseDouble(pt5.getText());
                        this.prom_Teo = calcularPromTeorico();
                    } else {
                        mensajeError();
                    }
                } else if (jButton2 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && !nt3.getText().equals("") && !pt3.getText().equals("") && !nt4.getText().equals("") && !pt4.getText().equals("")
                            && !pt5.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.'
                            && nt3.getText().charAt(0) != '.' && pt3.getText().charAt(0) != '.' && nt4.getText().charAt(0) != '.' && pt4.getText().charAt(0) != '.'
                            && pt5.getText().charAt(0) != '.') {
                        this.notasT = new double[5];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());
                        notasT[2] = Double.parseDouble(nt3.getText());
                        notasT[3] = Double.parseDouble(nt4.getText());
                        notasT[4] = 1;

                        this.pondT = new double[5];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        pondT[2] = Double.parseDouble(pt3.getText());
                        pondT[3] = Double.parseDouble(pt4.getText());
                        pondT[4] = Double.parseDouble(pt5.getText());
                        calcularNotaFaltante(pondT, notasT);
                    } else {
                        mensajeError();
                    }
                }

                break;
            case 6:
                if (jButton1 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && !nt3.getText().equals("") && !pt3.getText().equals("") && !nt4.getText().equals("") && !pt4.getText().equals("")
                            && !nt5.getText().equals("") && !pt5.getText().equals("") && !nt6.getText().equals("") && !pt6.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.'
                            && nt3.getText().charAt(0) != '.' && pt3.getText().charAt(0) != '.' && nt4.getText().charAt(0) != '.' && pt4.getText().charAt(0) != '.'
                            && nt5.getText().charAt(0) != '.' && pt5.getText().charAt(0) != '.' && nt6.getText().charAt(0) != '.' && pt6.getText().charAt(0) != '.') {
                        this.notasT = new double[6];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());
                        notasT[2] = Double.parseDouble(nt3.getText());
                        notasT[3] = Double.parseDouble(nt4.getText());
                        notasT[4] = Double.parseDouble(nt5.getText());
                        notasT[5] = Double.parseDouble(nt6.getText());
                        this.pondT = new double[6];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        pondT[2] = Double.parseDouble(pt3.getText());
                        pondT[3] = Double.parseDouble(pt4.getText());
                        pondT[4] = Double.parseDouble(pt5.getText());
                        pondT[5] = Double.parseDouble(pt6.getText());
                        this.prom_Teo = calcularPromTeorico();
                    } else {
                        mensajeError();
                    }
                } else if (jButton2 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && !nt3.getText().equals("") && !pt3.getText().equals("") && !nt4.getText().equals("") && !pt4.getText().equals("")
                            && !nt5.getText().equals("") && !pt5.getText().equals("") && !pt6.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.'
                            && nt3.getText().charAt(0) != '.' && pt3.getText().charAt(0) != '.' && nt4.getText().charAt(0) != '.' && pt4.getText().charAt(0) != '.'
                            && nt5.getText().charAt(0) != '.' && pt5.getText().charAt(0) != '.' && pt6.getText().charAt(0) != '.') {
                        this.notasT = new double[6];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());
                        notasT[2] = Double.parseDouble(nt3.getText());
                        notasT[3] = Double.parseDouble(nt4.getText());
                        notasT[4] = Double.parseDouble(nt5.getText());
                        notasT[5] = 1;
                        this.pondT = new double[6];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        pondT[2] = Double.parseDouble(pt3.getText());
                        pondT[3] = Double.parseDouble(pt4.getText());
                        pondT[4] = Double.parseDouble(pt5.getText());
                        pondT[5] = Double.parseDouble(pt6.getText());
                        calcularNotaFaltante(pondT, notasT);
                    } else {
                        mensajeError();
                    }
                }
                break;

            case 7:
                if (jButton1 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && !nt3.getText().equals("") && !pt3.getText().equals("") && !nt4.getText().equals("") && !pt4.getText().equals("")
                            && !nt5.getText().equals("") && !pt5.getText().equals("") && !nt6.getText().equals("") && !pt6.getText().equals("")
                            && !nt7.getText().equals("") && !pt7.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.'
                            && nt3.getText().charAt(0) != '.' && pt3.getText().charAt(0) != '.' && nt4.getText().charAt(0) != '.' && pt4.getText().charAt(0) != '.'
                            && nt5.getText().charAt(0) != '.' && pt5.getText().charAt(0) != '.' && nt6.getText().charAt(0) != '.' && pt6.getText().charAt(0) != '.'
                            && nt7.getText().charAt(0) != '.' && pt7.getText().charAt(0) != '.') {
                        this.notasT = new double[7];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());
                        notasT[2] = Double.parseDouble(nt3.getText());
                        notasT[3] = Double.parseDouble(nt4.getText());
                        notasT[4] = Double.parseDouble(nt5.getText());
                        notasT[5] = Double.parseDouble(nt6.getText());
                        notasT[6] = Double.parseDouble(nt7.getText());

                        this.pondT = new double[7];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        pondT[2] = Double.parseDouble(pt3.getText());
                        pondT[3] = Double.parseDouble(pt4.getText());
                        pondT[4] = Double.parseDouble(pt5.getText());
                        pondT[5] = Double.parseDouble(pt6.getText());
                        pondT[6] = Double.parseDouble(pt7.getText());
                        this.prom_Teo = calcularPromTeorico();
                    } else {
                        mensajeError();
                    }
                } else if (jButton2 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && !nt3.getText().equals("") && !pt3.getText().equals("") && !nt4.getText().equals("") && !pt4.getText().equals("")
                            && !nt5.getText().equals("") && !pt5.getText().equals("") && !nt6.getText().equals("") && !pt6.getText().equals("")
                            && !pt7.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.'
                            && nt3.getText().charAt(0) != '.' && pt3.getText().charAt(0) != '.' && nt4.getText().charAt(0) != '.' && pt4.getText().charAt(0) != '.'
                            && nt5.getText().charAt(0) != '.' && pt5.getText().charAt(0) != '.' && nt6.getText().charAt(0) != '.' && pt6.getText().charAt(0) != '.'
                            && pt7.getText().charAt(0) != '.') {
                        this.notasT = new double[7];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());
                        notasT[2] = Double.parseDouble(nt3.getText());
                        notasT[3] = Double.parseDouble(nt4.getText());
                        notasT[4] = Double.parseDouble(nt5.getText());
                        notasT[5] = Double.parseDouble(nt6.getText());
                        notasT[6] = 1;

                        this.pondT = new double[7];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        pondT[2] = Double.parseDouble(pt3.getText());
                        pondT[3] = Double.parseDouble(pt4.getText());
                        pondT[4] = Double.parseDouble(pt5.getText());
                        pondT[5] = Double.parseDouble(pt6.getText());
                        pondT[6] = Double.parseDouble(pt7.getText());
                        calcularNotaFaltante(pondT, notasT);
                    } else {
                        mensajeError();
                    }
                }
                break;
            case 8:
                if (jButton1 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && !nt3.getText().equals("") && !pt3.getText().equals("") && !nt4.getText().equals("") && !pt4.getText().equals("")
                            && !nt5.getText().equals("") && !pt5.getText().equals("") && !nt6.getText().equals("") && !pt6.getText().equals("")
                            && !nt7.getText().equals("") && !pt7.getText().equals("") && !nt8.getText().equals("") && !pt8.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.'
                            && nt3.getText().charAt(0) != '.' && pt3.getText().charAt(0) != '.' && nt4.getText().charAt(0) != '.' && pt4.getText().charAt(0) != '.'
                            && nt5.getText().charAt(0) != '.' && pt5.getText().charAt(0) != '.' && nt6.getText().charAt(0) != '.' && pt6.getText().charAt(0) != '.'
                            && nt7.getText().charAt(0) != '.' && pt7.getText().charAt(0) != '.' && nt8.getText().charAt(0) != '.' && pt8.getText().charAt(0) != '.') {
                        this.notasT = new double[8];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());
                        notasT[2] = Double.parseDouble(nt3.getText());
                        notasT[3] = Double.parseDouble(nt4.getText());
                        notasT[4] = Double.parseDouble(nt5.getText());
                        notasT[5] = Double.parseDouble(nt6.getText());
                        notasT[6] = Double.parseDouble(nt7.getText());
                        notasT[7] = Double.parseDouble(nt8.getText());

                        this.pondT = new double[8];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        pondT[2] = Double.parseDouble(pt3.getText());
                        pondT[3] = Double.parseDouble(pt4.getText());
                        pondT[4] = Double.parseDouble(pt5.getText());
                        pondT[5] = Double.parseDouble(pt6.getText());
                        pondT[6] = Double.parseDouble(pt7.getText());
                        pondT[7] = Double.parseDouble(pt8.getText());
                        this.prom_Teo = calcularPromTeorico();
                    } else {
                        mensajeError();
                    }
                } else if (jButton2 == evt.getSource()) {
                    if (!nt1.getText().equals("") && !pt1.getText().equals("") && !nt2.getText().equals("") && !pt2.getText().equals("")
                            && !nt3.getText().equals("") && !pt3.getText().equals("") && !nt4.getText().equals("") && !pt4.getText().equals("")
                            && !nt5.getText().equals("") && !pt5.getText().equals("") && !nt6.getText().equals("") && !pt6.getText().equals("")
                            && !nt7.getText().equals("") && !pt7.getText().equals("") && !pt8.getText().equals("")
                            && nt1.getText().charAt(0) != '.' && pt1.getText().charAt(0) != '.' && nt2.getText().charAt(0) != '.' && pt2.getText().charAt(0) != '.'
                            && nt3.getText().charAt(0) != '.' && pt3.getText().charAt(0) != '.' && nt4.getText().charAt(0) != '.' && pt4.getText().charAt(0) != '.'
                            && nt5.getText().charAt(0) != '.' && pt5.getText().charAt(0) != '.' && nt6.getText().charAt(0) != '.' && pt6.getText().charAt(0) != '.'
                            && nt7.getText().charAt(0) != '.' && pt7.getText().charAt(0) != '.' && pt8.getText().charAt(0) != '.') {
                        this.notasT = new double[8];
                        notasT[0] = Double.parseDouble(nt1.getText());
                        notasT[1] = Double.parseDouble(nt2.getText());
                        notasT[2] = Double.parseDouble(nt3.getText());
                        notasT[3] = Double.parseDouble(nt4.getText());
                        notasT[4] = Double.parseDouble(nt5.getText());
                        notasT[5] = Double.parseDouble(nt6.getText());
                        notasT[6] = Double.parseDouble(nt7.getText());
                        notasT[7] = 1;

                        this.pondT = new double[8];
                        pondT[0] = Double.parseDouble(pt1.getText());
                        pondT[1] = Double.parseDouble(pt2.getText());
                        pondT[2] = Double.parseDouble(pt3.getText());
                        pondT[3] = Double.parseDouble(pt4.getText());
                        pondT[4] = Double.parseDouble(pt5.getText());
                        pondT[5] = Double.parseDouble(pt6.getText());
                        pondT[6] = Double.parseDouble(pt7.getText());
                        pondT[7] = Double.parseDouble(pt8.getText());
                        calcularNotaFaltante(pondT, notasT);
                    } else {
                        mensajeError();
                    }
                }
                break;
        }
    }

    void crearArregloPractico(java.awt.event.ActionEvent evt) {
        if (jButton4 == evt.getSource()) {
            this.prom_Pract = 0;
        }
        switch (Integer.parseInt(jLabel16.getText())) {
            case 1:
                if (!np1.getText().equals("") && !pp1.getText().equals("") && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.') {
                    this.notasP = new double[1];
                    notasP[0] = Double.parseDouble(np1.getText());
                    this.pondP = new double[1];
                    pondP[0] = Double.parseDouble(pp1.getText());
                    if (jButton4 == evt.getSource()) {
                        this.prom_Pract = calcularPromPractico();
                    } else if (jButton3 == evt.getSource()) {
                        calcularNotaFaltante(pondP, notasP);
                    }
                } else {
                    mensajeError();
                }
                break;
            case 2:

                if (jButton4 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.') {
                        this.notasP = new double[2];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        this.pondP = new double[2];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());

                        this.prom_Pract = calcularPromPractico();

                    } else {
                        mensajeError();
                    }
                } else if (jButton3 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !pp2.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.') {
                        this.notasP = new double[2];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = 1;
                        this.pondP = new double[2];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        calcularNotaFaltante(pondP, notasP);
                    } else {
                        mensajeError();
                    }
                }

                break;
            case 3:
                if (jButton4 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && !np3.getText().equals("") && !pp3.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.'
                            && np3.getText().charAt(0) != '.' && pp3.getText().charAt(0) != '.') {
                        this.notasP = new double[3];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        notasP[2] = Double.parseDouble(np3.getText());
                        this.pondP = new double[3];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        pondP[2] = Double.parseDouble(pp3.getText());
                        this.prom_Pract = calcularPromPractico();
                    } else {
                        mensajeError();
                    }
                } else if (jButton3 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && !pp3.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.'
                            && pp3.getText().charAt(0) != '.') {
                        this.notasP = new double[3];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        notasP[2] = 1;
                        this.pondP = new double[3];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        pondP[2] = Double.parseDouble(pp3.getText());
                        calcularNotaFaltante(pondP, notasP);
                    } else {
                        mensajeError();
                    }
                }

                break;
            case 4:

                if (jButton4 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && !np3.getText().equals("") && !pp3.getText().equals("") && !np4.getText().equals("") && !pp4.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.'
                            && np3.getText().charAt(0) != '.' && pp3.getText().charAt(0) != '.' && np4.getText().charAt(0) != '.' && pp4.getText().charAt(0) != '.') {
                        this.notasP = new double[4];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        notasP[2] = Double.parseDouble(np3.getText());
                        notasP[3] = Double.parseDouble(np4.getText());
                        this.pondP = new double[4];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        pondP[2] = Double.parseDouble(pp3.getText());
                        pondP[3] = Double.parseDouble(pp4.getText());
                        this.prom_Pract = calcularPromPractico();
                    } else {
                        mensajeError();
                    }
                } else if (jButton3 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && !np3.getText().equals("") && !pp3.getText().equals("") && !pp4.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.'
                            && np3.getText().charAt(0) != '.' && pp3.getText().charAt(0) != '.' && pp4.getText().charAt(0) != '.') {
                        this.notasP = new double[4];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        notasP[2] = Double.parseDouble(np3.getText());
                        notasP[3] = 1;
                        this.pondP = new double[4];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        pondP[2] = Double.parseDouble(pp3.getText());
                        pondP[3] = Double.parseDouble(pp4.getText());
                        calcularNotaFaltante(pondP, notasP);
                    } else {
                        mensajeError();
                    }
                }

                break;

            case 5:
                if (jButton4 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && !np3.getText().equals("") && !pp3.getText().equals("") && !np4.getText().equals("") && !pp4.getText().equals("")
                            && !np5.getText().equals("") && !pp5.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.'
                            && np3.getText().charAt(0) != '.' && pp3.getText().charAt(0) != '.' && np4.getText().charAt(0) != '.' && pp4.getText().charAt(0) != '.'
                            && np5.getText().charAt(0) != '.' && pp5.getText().charAt(0) != '.') {
                        this.notasP = new double[5];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        notasP[2] = Double.parseDouble(np3.getText());
                        notasP[3] = Double.parseDouble(np4.getText());
                        notasP[4] = Double.parseDouble(np5.getText());
                        this.pondP = new double[5];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        pondP[2] = Double.parseDouble(pp3.getText());
                        pondP[3] = Double.parseDouble(pp4.getText());
                        pondP[4] = Double.parseDouble(pp5.getText());
                        this.prom_Pract = calcularPromPractico();
                    } else {
                        mensajeError();
                    }
                } else if (jButton3 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && !np3.getText().equals("") && !pp3.getText().equals("") && !np4.getText().equals("") && !pp4.getText().equals("")
                            && !pp5.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.'
                            && np3.getText().charAt(0) != '.' && pp3.getText().charAt(0) != '.' && np4.getText().charAt(0) != '.' && pp4.getText().charAt(0) != '.'
                            && pp5.getText().charAt(0) != '.') {
                        this.notasP = new double[5];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        notasP[2] = Double.parseDouble(np3.getText());
                        notasP[3] = Double.parseDouble(np4.getText());
                        notasP[4] = 1;
                        this.pondP = new double[5];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        pondP[2] = Double.parseDouble(pp3.getText());
                        pondP[3] = Double.parseDouble(pp4.getText());
                        pondP[4] = Double.parseDouble(pp5.getText());
                        calcularNotaFaltante(pondP, notasP);
                    } else {
                        mensajeError();
                    }
                }

                break;
            case 6:
                if (jButton4 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && !np3.getText().equals("") && !pp3.getText().equals("") && !np4.getText().equals("") && !pp4.getText().equals("")
                            && !np5.getText().equals("") && !pp5.getText().equals("") && !np6.getText().equals("") && !pp6.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.'
                            && np3.getText().charAt(0) != '.' && pp3.getText().charAt(0) != '.' && np4.getText().charAt(0) != '.' && pp4.getText().charAt(0) != '.'
                            && np5.getText().charAt(0) != '.' && pp5.getText().charAt(0) != '.' && np6.getText().charAt(0) != '.' && pp6.getText().charAt(0) != '.') {
                        this.notasP = new double[6];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        notasP[2] = Double.parseDouble(np3.getText());
                        notasP[3] = Double.parseDouble(np4.getText());
                        notasP[4] = Double.parseDouble(np5.getText());
                        notasP[5] = Double.parseDouble(np6.getText());
                        this.pondP = new double[6];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        pondP[2] = Double.parseDouble(pp3.getText());
                        pondP[3] = Double.parseDouble(pp4.getText());
                        pondP[4] = Double.parseDouble(pp5.getText());
                        pondP[5] = Double.parseDouble(pp6.getText());
                        this.prom_Pract = calcularPromPractico();
                    } else {
                        mensajeError();
                    }
                } else if (jButton3 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && !np3.getText().equals("") && !pp3.getText().equals("") && !np4.getText().equals("") && !pp4.getText().equals("")
                            && !np5.getText().equals("") && !pp5.getText().equals("") && !pp6.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.'
                            && np3.getText().charAt(0) != '.' && pp3.getText().charAt(0) != '.' && np4.getText().charAt(0) != '.' && pp4.getText().charAt(0) != '.'
                            && np5.getText().charAt(0) != '.' && pp5.getText().charAt(0) != '.' && pp6.getText().charAt(0) != '.') {
                        this.notasP = new double[6];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        notasP[2] = Double.parseDouble(np3.getText());
                        notasP[3] = Double.parseDouble(np4.getText());
                        notasP[4] = Double.parseDouble(np5.getText());
                        notasP[5] = 1;
                        this.pondP = new double[6];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        pondP[2] = Double.parseDouble(pp3.getText());
                        pondP[3] = Double.parseDouble(pp4.getText());
                        pondP[4] = Double.parseDouble(pp5.getText());
                        pondP[5] = Double.parseDouble(pp6.getText());
                        calcularNotaFaltante(pondP, notasP);
                    } else {
                        mensajeError();
                    }
                }
                break;

            case 7:
                if (jButton4 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && !np3.getText().equals("") && !pp3.getText().equals("") && !np4.getText().equals("") && !pp4.getText().equals("")
                            && !np5.getText().equals("") && !pp5.getText().equals("") && !np6.getText().equals("") && !pp6.getText().equals("")
                            && !np7.getText().equals("") && !pp7.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.'
                            && np3.getText().charAt(0) != '.' && pp3.getText().charAt(0) != '.' && np4.getText().charAt(0) != '.' && pp4.getText().charAt(0) != '.'
                            && np5.getText().charAt(0) != '.' && pp5.getText().charAt(0) != '.' && np6.getText().charAt(0) != '.' && pp6.getText().charAt(0) != '.'
                            && np7.getText().charAt(0) != '.' && pp7.getText().charAt(0) != '.') {
                        this.notasP = new double[7];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        notasP[2] = Double.parseDouble(np3.getText());
                        notasP[3] = Double.parseDouble(np4.getText());
                        notasP[4] = Double.parseDouble(np5.getText());
                        notasP[5] = Double.parseDouble(np6.getText());
                        notasP[6] = Double.parseDouble(np7.getText());
                        this.pondP = new double[7];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        pondP[2] = Double.parseDouble(pp3.getText());
                        pondP[3] = Double.parseDouble(pp4.getText());
                        pondP[4] = Double.parseDouble(pp5.getText());
                        pondP[5] = Double.parseDouble(pp6.getText());
                        pondP[6] = Double.parseDouble(pp7.getText());
                        this.prom_Pract = calcularPromPractico();
                    } else {
                        mensajeError();
                    }
                } else if (jButton3 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && !np3.getText().equals("") && !pp3.getText().equals("") && !np4.getText().equals("") && !pp4.getText().equals("")
                            && !np5.getText().equals("") && !pp5.getText().equals("") && !np6.getText().equals("") && !pp6.getText().equals("")
                            && !pp7.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.'
                            && np3.getText().charAt(0) != '.' && pp3.getText().charAt(0) != '.' && np4.getText().charAt(0) != '.' && pp4.getText().charAt(0) != '.'
                            && np5.getText().charAt(0) != '.' && pp5.getText().charAt(0) != '.' && np6.getText().charAt(0) != '.' && pp6.getText().charAt(0) != '.'
                            && pp7.getText().charAt(0) != '.') {
                        this.notasP = new double[7];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        notasP[2] = Double.parseDouble(np3.getText());
                        notasP[3] = Double.parseDouble(np4.getText());
                        notasP[4] = Double.parseDouble(np5.getText());
                        notasP[5] = Double.parseDouble(np6.getText());
                        notasP[6] = 1;
                        this.pondP = new double[7];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        pondP[2] = Double.parseDouble(pp3.getText());
                        pondP[3] = Double.parseDouble(pp4.getText());
                        pondP[4] = Double.parseDouble(pp5.getText());
                        pondP[5] = Double.parseDouble(pp6.getText());
                        pondP[6] = Double.parseDouble(pp7.getText());
                        calcularNotaFaltante(pondP, notasP);
                    } else {
                        mensajeError();
                    }
                }
                break;
            case 8:
                if (jButton4 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && !np3.getText().equals("") && !pp3.getText().equals("") && !np4.getText().equals("") && !pp4.getText().equals("")
                            && !np5.getText().equals("") && !pp5.getText().equals("") && !np6.getText().equals("") && !pp6.getText().equals("")
                            && !np7.getText().equals("") && !pp7.getText().equals("") && !np8.getText().equals("") && !pp8.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.'
                            && np3.getText().charAt(0) != '.' && pp3.getText().charAt(0) != '.' && np4.getText().charAt(0) != '.' && pp4.getText().charAt(0) != '.'
                            && np5.getText().charAt(0) != '.' && pp5.getText().charAt(0) != '.' && np6.getText().charAt(0) != '.' && pp6.getText().charAt(0) != '.'
                            && np7.getText().charAt(0) != '.' && pp7.getText().charAt(0) != '.' && np8.getText().charAt(0) != '.' && pp8.getText().charAt(0) != '.') {
                        this.notasP = new double[8];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        notasP[2] = Double.parseDouble(np3.getText());
                        notasP[3] = Double.parseDouble(np4.getText());
                        notasP[4] = Double.parseDouble(np5.getText());
                        notasP[5] = Double.parseDouble(np6.getText());
                        notasP[6] = Double.parseDouble(np7.getText());
                        notasP[7] = Double.parseDouble(np8.getText());

                        this.pondP = new double[8];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        pondP[2] = Double.parseDouble(pp3.getText());
                        pondP[3] = Double.parseDouble(pp4.getText());
                        pondP[4] = Double.parseDouble(pp5.getText());
                        pondP[5] = Double.parseDouble(pp6.getText());
                        pondP[6] = Double.parseDouble(pp7.getText());
                        pondP[7] = Double.parseDouble(pp8.getText());
                        this.prom_Pract = calcularPromPractico();
                    } else {
                        mensajeError();
                    }
                } else if (jButton3 == evt.getSource()) {
                    if (!np1.getText().equals("") && !pp1.getText().equals("") && !np2.getText().equals("") && !pp2.getText().equals("")
                            && !np3.getText().equals("") && !pp3.getText().equals("") && !np4.getText().equals("") && !pp4.getText().equals("")
                            && !np5.getText().equals("") && !pp5.getText().equals("") && !np6.getText().equals("") && !pp6.getText().equals("")
                            && !np7.getText().equals("") && !pp7.getText().equals("") && !pp8.getText().equals("")
                            && np1.getText().charAt(0) != '.' && pp1.getText().charAt(0) != '.' && np2.getText().charAt(0) != '.' && pp2.getText().charAt(0) != '.'
                            && np3.getText().charAt(0) != '.' && pp3.getText().charAt(0) != '.' && np4.getText().charAt(0) != '.' && pp4.getText().charAt(0) != '.'
                            && np5.getText().charAt(0) != '.' && pp5.getText().charAt(0) != '.' && np6.getText().charAt(0) != '.' && pp6.getText().charAt(0) != '.'
                            && np7.getText().charAt(0) != '.' && pp7.getText().charAt(0) != '.' && pp8.getText().charAt(0) != '.') {
                        this.notasP = new double[8];
                        notasP[0] = Double.parseDouble(np1.getText());
                        notasP[1] = Double.parseDouble(np2.getText());
                        notasP[2] = Double.parseDouble(np3.getText());
                        notasP[3] = Double.parseDouble(np4.getText());
                        notasP[4] = Double.parseDouble(np5.getText());
                        notasP[5] = Double.parseDouble(np6.getText());
                        notasP[6] = Double.parseDouble(np7.getText());
                        notasP[7] = 1;

                        this.pondP = new double[8];
                        pondP[0] = Double.parseDouble(pp1.getText());
                        pondP[1] = Double.parseDouble(pp2.getText());
                        pondP[2] = Double.parseDouble(pp3.getText());
                        pondP[3] = Double.parseDouble(pp4.getText());
                        pondP[4] = Double.parseDouble(pp5.getText());
                        pondP[5] = Double.parseDouble(pp6.getText());
                        pondP[6] = Double.parseDouble(pp7.getText());
                        pondP[7] = Double.parseDouble(pp8.getText());
                        calcularNotaFaltante(pondP, notasP);
                    } else {
                        mensajeError();
                    }
                }
                break;
        }
    }

    private void guardar() throws IOException {
        Archivo ar = new Archivo();
        ar.eliminarArchivo(nombreAsign.getText());
        ar.crearArchivoMixto(nombreAsign.getText(), tipoAprob.getText(),
                jLabel15.getText(), jLabel16.getText(), pondTeo.getText(),
                pondPract.getText());
        ar.guardarArchivo(nombreAsign.getText(), notasT, pondT);
        ar.guardarArchivo(nombreAsign.getText(), notasP, pondP);
    }

    double calcularPromTeorico() {
        Mixto s = new Mixto();
        double a = 0;
        if (sumPond(this.pondT) == 100 && validarNota(this.notasT) == true) {
            a = truncarNum(s.calcPromedioSimple(this.notasT, this.pondT));

            if (a >= 4) {
                promT.setForeground(Color.black);
                promT.setText(String.valueOf(a));
                jLabel21.setForeground(Color.yellow);
                jLabel21.setText("APROBRADO!!");
            }
            if (a < 4) {
                promT.setForeground(Color.red);
                promT.setText(String.valueOf(a));
                jLabel21.setForeground(Color.red);
                jLabel21.setText("REPROBADO!!");
            }
        } else if (sumPond(this.pondT) != 100) {
            JOptionPane.showMessageDialog(null, "Ponderacion Teorica no suma 100",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        } else if (validarNota(this.notasT) == false) {
            JOptionPane.showMessageDialog(null, "ingresar nota menor a 7 y/o mayor a 0",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return a;
    }

    double calcularPromPractico() {
        Simple s = new Simple();
        double a = 0;
        if (sumPond(this.pondP) == 100 && validarNota(this.notasP) == true) {
            a = truncarNum(s.calcPromedioSimple(this.notasP, this.pondP));

            if (a >= 4) {
                promP.setForeground(Color.black);
                promP.setText(String.valueOf(a));
                jLabel20.setForeground(Color.yellow);
                jLabel20.setText("APROBRADO!!");
            }
            if (a < 4) {
                promP.setForeground(Color.red);
                promP.setText(String.valueOf(a));
                jLabel20.setForeground(Color.red);
                jLabel20.setText("REPROBADO!!");
            }
        } else if (sumPond(this.pondP) != 100) {
            JOptionPane.showMessageDialog(null, "Ponderacion no suma 100",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        } else if (validarNota(this.notasP) == false) {
            JOptionPane.showMessageDialog(null, "ingresar nota menor a 7 y/o mayor a 0",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return a;
    }

    void promGral() {

        Mixto m = new Mixto();
        if (this.prom_Teo != 0 && this.prom_Pract != 0) {

            double c = truncarNum(m.calcPromedioTotal(this.prom_Teo, this.prom_Pract, Double.parseDouble(pondTeo.getText()), Double.parseDouble(pondPract.getText())));
            if (c >= 4) {
                promGral.setForeground(Color.black);
                promGral.setText(String.valueOf(c));
                jLabel22.setForeground(Color.yellow);
                jLabel22.setText("APROBRADO!!");
            } else if (c < 4) {
                promGral.setForeground(Color.red);
                promGral.setText(String.valueOf(c));
                jLabel22.setForeground(Color.red);
                jLabel22.setText("REPROBADO!!");

            }
        } else {
            mensajeError();
        }
    }

    void calcularNotaFaltante(double[] pond, double[] notas) {

        Simple s = new Simple();
        if (sumPond(pond) == 100 && validarNota(notas) == true && notas.length >= 2) {
            notas[notas.length - 1] = 0;
            double a = truncarNum(s.calcNotaFaltante(notas, pond));
            double b = truncarNum(s.calcNotaPExamen(notas, pond));

            if ((a <= 7 && b <= 7) && (a > 1 && b > 1)) {
                JOptionPane.showMessageDialog(null, "Para aprobar la asignatura con un 4 necesitas un : |" + String.valueOf(a)
                        + "|, En la última evaluacion\n y \n Para poder rendir examen necesitas un: |" + String.valueOf(b) + "|, En la última evaluacion",
                        "NOTA FALTANTE", JOptionPane.WARNING_MESSAGE);
            } else if (a > 7 && b <= 7) {
                JOptionPane.showMessageDialog(null, "No puedes Aprobar este Ramo, solo puedes ir a Examen\n y \n Para poder rendir examen necesitas un: |" + String.valueOf(b) + "|, En la última evaluacion",
                        "NOTA FALTANTE", JOptionPane.WARNING_MESSAGE);
            } else if (a > 7 && b > 7) {
                JOptionPane.showMessageDialog(null, "Notas insuficientes para aprobar o para rendir examen, ",
                        "NOTA FALTANTE", JOptionPane.WARNING_MESSAGE);
            } else if (a <= 1 && b <= 1) {
                JOptionPane.showMessageDialog(null, "con la nota minima (1.0) En la última evaluacion pasas es ramo",
                        "NOTA FALTANTE", JOptionPane.WARNING_MESSAGE);
            } else if (a > 1 && b <= 1) {
                JOptionPane.showMessageDialog(null, "Para aprobar la asignatura con un 4 necesitas un : |" + String.valueOf(a)
                        + "|, En la última evaluacion\n y \n con la nota minima (1.0) En la última evaluacion pudes dar examen",
                        "NOTA FALTANTE", JOptionPane.WARNING_MESSAGE);
            }
        } else if (sumPond(pond) != 100) {
            JOptionPane.showMessageDialog(null, "Ponderacion no suma 100",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        } else if (validarNota(notas) == false) {
            JOptionPane.showMessageDialog(null, "ingresar nota menor a 7 y/o mayor a 0",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        } else if (notas.length < 2) {
            JOptionPane.showMessageDialog(null, "Cantidad de notas debe se superior a 1",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }

    }

    void mensajeError() {
        JOptionPane.showMessageDialog(null, "Por favor llene todos los recuadros",
                "ERROR", JOptionPane.WARNING_MESSAGE);
    }

    double sumPond(double pond[]) {
        double cont = 0;
        for (int i = 0; i < pond.length; i++) {
            cont = cont + pond[i];
        }
        return cont;
    }

    boolean validarNota(double notas[]) {
        boolean pasa = true;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > 7 || notas[i] <= 0) {
                pasa = false;
            }
        }
        return pasa;
    }
    private void promTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_promTKeyTyped
        // TODO add your handling code here:
        validacionNota(promT.getText(), evt);
    }//GEN-LAST:event_promTKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        crearArregloTeorico(evt);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        crearArregloPractico(evt);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        // TODO add your handling code here:
        jLabel19.setVisible(true);
        jLabel19.setForeground(Color.red);
        jLabel19.setText("* Al oprimir Calcula ultima nota Practica necesaria para aprobar ramo");
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        // TODO add your handling code here:
        jLabel19.setVisible(true);
        jLabel19.setForeground(Color.red);
        jLabel19.setText("* Al oprimir Calcula ultima nota Teorica necesaria para aprobar ramo");
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jLabel19.setVisible(true);
        jLabel19.setForeground(Color.red);
        jLabel19.setText("* Al oprimir Calcula Promedio Teorico obtenido en el ramo");
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jLabel19.setForeground(Color.black);
        jLabel19.setText(".");
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        jLabel19.setForeground(Color.black);
        jLabel19.setText(".");
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        jLabel19.setForeground(Color.black);
        jLabel19.setText(".");
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
        jLabel19.setVisible(true);
        jLabel19.setForeground(Color.red);
        jLabel19.setText("* Al oprimir Calcula Promedio Practico obtenido en el ramo");
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
        jLabel19.setForeground(Color.black);
        jLabel19.setText(".");
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        crearArregloPractico(evt);
        this.arregloP = true;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        promGral();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
        jLabel19.setVisible(true);
        jLabel19.setForeground(Color.red);
        jLabel19.setText("* Al oprimir Calcula Promedio General obtenido en el ramo");
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
        jLabel19.setForeground(Color.black);
        jLabel19.setText(".");
    }//GEN-LAST:event_jButton5MouseExited

    private void guardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseEntered
        // TODO add your handling code here:
        jLabel19.setVisible(true);
        jLabel19.setForeground(Color.red);
        jLabel19.setText("* Para guardar las notas debes primero Calcular los promedios obtenido");
    }//GEN-LAST:event_guardarMouseEntered

    private void guardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseExited
        // TODO add your handling code here:
        jLabel19.setForeground(Color.black);
        jLabel19.setText(".");
    }//GEN-LAST:event_guardarMouseExited

    private void validacionNota(String cadena, java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();

        if (!(c >= '0' && c <= '9') && c != '.') {
            evt.consume();
        }
        if ((c == '.') && cadena.contains(".")) {
            evt.consume();
        }
        if (cadena.length() >= 5) {
            evt.consume();
        }
    }

    double truncarNum(double a) {
        double aux = Math.rint(a * 100) / 100;
        a = aux;
        return a;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazMixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazMixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazMixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazMixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazMixto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonMin;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private jcMousePanel.jcMousePanel jcMousePanel3;
    private jcMousePanel.jcMousePanel jcMousePanel4;
    private javax.swing.JLabel nombreAsign;
    private javax.swing.JTextField np1;
    private javax.swing.JTextField np2;
    private javax.swing.JTextField np3;
    private javax.swing.JTextField np4;
    private javax.swing.JTextField np5;
    private javax.swing.JTextField np6;
    private javax.swing.JTextField np7;
    private javax.swing.JTextField np8;
    private javax.swing.JTextField nt1;
    private javax.swing.JTextField nt2;
    private javax.swing.JTextField nt3;
    private javax.swing.JTextField nt4;
    private javax.swing.JTextField nt5;
    private javax.swing.JTextField nt6;
    private javax.swing.JTextField nt7;
    private javax.swing.JTextField nt8;
    private javax.swing.JButton pagPrincipal;
    private javax.swing.JLabel pondPract;
    private javax.swing.JLabel pondTeo;
    private javax.swing.JTextField pp1;
    private javax.swing.JTextField pp2;
    private javax.swing.JTextField pp3;
    private javax.swing.JTextField pp4;
    private javax.swing.JTextField pp5;
    private javax.swing.JTextField pp6;
    private javax.swing.JTextField pp7;
    private javax.swing.JTextField pp8;
    private javax.swing.JTextField promGral;
    private javax.swing.JTextField promP;
    private javax.swing.JTextField promT;
    private javax.swing.JTextField pt1;
    private javax.swing.JTextField pt2;
    private javax.swing.JTextField pt3;
    private javax.swing.JTextField pt4;
    private javax.swing.JTextField pt5;
    private javax.swing.JTextField pt6;
    private javax.swing.JTextField pt7;
    private javax.swing.JTextField pt8;
    private javax.swing.JLabel tipoAprob;
    // End of variables declaration//GEN-END:variables
}
