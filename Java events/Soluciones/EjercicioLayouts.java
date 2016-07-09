/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soluciones;

import Ejercicios.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Macarena
 */
public class EjercicioLayouts extends javax.swing.JFrame {

    /**
     * Creates new form EjercicioLayouts
     */
    private int cont = 1;

    public EjercicioLayouts() {
        initComponents();
        setFlowLayout();
        setGridBagLayout();
        setBorderLayout();
        setBoxLayout();
        setGridLayout();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void setFlowLayout() {
        for (int i = 0; i < 10; i++) {
            this.jPanel2.add(new JButton(String.valueOf(cont++)));
        }
    }

    public void setGridBagLayout() {
        //asignamos al los botones restricciones
        GridBagConstraints r = new GridBagConstraints();
        r.gridx = 0;
        r.gridy = 0;
        r.fill=GridBagConstraints.VERTICAL; //expansión en vertical
        r.weighty=1.0; //se expande
        r.gridheight=4; //cuarta altura
        this.jPanel3.add(new JButton(String.valueOf(cont++)), r);
        r.gridx = 1;
        r.gridy = 0;
        r.gridheight=1; //se sigue expandiendo con altura normal
        this.jPanel3.add(new JButton(String.valueOf(cont++)), r);
        r.gridx = 1;
        r.gridy = 1;
        r.gridheight=1;  //se sigue expandiendo con altura normal
        this.jPanel3.add(new JButton(String.valueOf(cont++)), r);
        r.gridx = 1;
        r.gridy = 2;
        r.gridheight=1;  //se sigue expandiendo con altura normal
        this.jPanel3.add(new JButton(String.valueOf(cont++)), r);
        r.gridx = 1;
        r.gridy = 3;
        r.gridheight=1;  //se sigue expandiendo con altura normal
        this.jPanel3.add(new JButton(String.valueOf(cont++)), r);
    }

    public void setBorderLayout() {
        this.jPanel6.add(new JButton(String.valueOf(cont++)), BorderLayout.CENTER);
        this.jPanel6.add(new JButton(String.valueOf(cont++)), BorderLayout.NORTH);
        this.jPanel6.add(new JButton(String.valueOf(cont++)), BorderLayout.WEST);
        this.jPanel6.add(new JButton(String.valueOf(cont++)), BorderLayout.EAST);
        this.jPanel6.add(new JButton(String.valueOf(cont++)), BorderLayout.SOUTH);
    }

    public void setBoxLayout() {
        this.jPanel5.setPreferredSize(new Dimension(80, 0));
        for (int i = 0; i < 10; i++) {
            this.jPanel5.add(new JButton(String.valueOf(cont++)));
        }
    }

    public void setGridLayout() {
        for (int i = 0; i < 20; i++) {
            this.jPanel4.add(new JButton(String.valueOf(cont++)));
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administradores de diseño");

        jPanel1.setLayout(new java.awt.BorderLayout(10, 10));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("FlowLayout"));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 25, 25));
        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("GridBagLayout"));
        jPanel3.setLayout(new java.awt.GridBagLayout());
        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("GridLayout"));
        jPanel4.setLayout(new java.awt.GridLayout(0, 5));
        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("BoxLayout"));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.PAGE_AXIS));
        jPanel1.add(jPanel5, java.awt.BorderLayout.LINE_END);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("BorderLayout"));
        jPanel6.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(EjercicioLayouts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjercicioLayouts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjercicioLayouts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjercicioLayouts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjercicioLayouts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}