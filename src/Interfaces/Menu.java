/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import EDD.ABB;
import EDD.AVL;
import EDD.HashTable;
import EDD.ListaSimple;

/**
 *
 * @author MigueMonti
 */
public class Menu extends javax.swing.JFrame {

  public static Bienvenida v1;
    
    public Menu(Bienvenida v1) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
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
        Clientes = new javax.swing.JButton();
        Reservacion = new javax.swing.JButton();
        Habitacion = new javax.swing.JButton();
        In = new javax.swing.JButton();
        Out = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Clientes.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Clientes.setText("Búsqueda de Clientes");
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });
        jPanel1.add(Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 200, -1));

        Reservacion.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Reservacion.setText("Búsqueda de Reservación");
        Reservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservacionActionPerformed(evt);
            }
        });
        jPanel1.add(Reservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        Habitacion.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Habitacion.setText("Historial de Habitación");
        Habitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HabitacionActionPerformed(evt);
            }
        });
        jPanel1.add(Habitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 200, -1));

        In.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        In.setText("Check-In");
        In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InActionPerformed(evt);
            }
        });
        jPanel1.add(In, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 200, -1));

        Out.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Out.setText("Check-Out");
        Out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutActionPerformed(evt);
            }
        });
        jPanel1.add(Out, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 200, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HOTEL BOOKING");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 400, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Imagenes/WhatsApp Image 2024-03-31 at 8.37.36 PM.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-400, -130, 1140, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
        // TODO add your handling code here:
      BClientes v5 = new BClientes (this);
        this.setVisible(false);
        v5.setVisible(true); 

    }//GEN-LAST:event_ClientesActionPerformed

    private void ReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservacionActionPerformed
        // TODO add your handling code here:
         BReservacion v4 = new BReservacion(this);
        this.setVisible(false);
        v4.setVisible(true);

    }//GEN-LAST:event_ReservacionActionPerformed

    private void HabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HabitacionActionPerformed
        // TODO add your handling code here:
      
         Historial v6 = new Historial(this);
        this.setVisible(false);
        v6.setVisible(true);

    }//GEN-LAST:event_HabitacionActionPerformed

    private void InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InActionPerformed
        // TODO add your handling code here:
                CheckIn v2 = new CheckIn(this);
        this.setVisible(false);
        v2.setVisible(true);
    }//GEN-LAST:event_InActionPerformed

    private void OutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutActionPerformed
        // TODO add your handling code here:
         Checkout v3 = new Checkout(this);
        this.setVisible(false);
        v3.setVisible(true);
        
    }//GEN-LAST:event_OutActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clientes;
    private javax.swing.JButton Habitacion;
    private javax.swing.JButton In;
    private javax.swing.JButton Out;
    private javax.swing.JButton Reservacion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
