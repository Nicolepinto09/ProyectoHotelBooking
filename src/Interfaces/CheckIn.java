/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Clases.Estado;
import Clases.Reservacion;
import Funciones.Helpers;
import static Interfaces.Bienvenida.estados;
import static Interfaces.Bienvenida.habitaciones;
import static Interfaces.Bienvenida.habitaciones_disponibles;
import static Interfaces.Bienvenida.reservaciones;
import javax.swing.JOptionPane;


/**
 *
 * @author pedro
 */
public class CheckIn extends javax.swing.JFrame {

            public static Menu v2;

    public CheckIn(Menu v2) {
        initComponents();
        this.v2 = v2;
        v2.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        input_ci = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        Menu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("REGISTRO DE ENTRADA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese su cédula:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPanel1.add(input_ci, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 150, -1));

        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setText("Guardar huesped");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        Menu.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Menu.setText("Menú");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Imagenes/FCheckIn.jpg"))); // NOI18N
        jLabel3.setText("jLabel1");
        jLabel3.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, 490, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Helpers help = new Helpers();
        
        //Obtiene el valor de la cédula desde un componente de interfaz de usuario
        String cedula = input_ci.getText();
        
        //Valida la cédula utilizando el método ValidarCedula del objeto help
        int ci = help.ValidarCedula(cedula);
        
        //Variables para contar y almacenar el número de habitación asignada
        
        int count = 0;
        int num_hosp = 0;
                
        if(ci != -1){
            Reservacion reservacion = reservaciones.buscarNodo(reservaciones.getNodoRaiz(), ci).getReservacion();
            
            for (int i = 0; i < habitaciones_disponibles.getSize(); i++) {
                int num_hab = (int) habitaciones_disponibles.getValor(i);
                
                if(habitaciones.buscarPorClave(num_hab).getTipodeHabitacion().equalsIgnoreCase(reservacion.getTipodeHabitacion())){
                    habitaciones.buscarPorClave(num_hab).setDispo(false);
     
                    num_hosp = num_hab;
                    count += 1;
                    break;
                }    
            }
            if(count == 0){
                JOptionPane.showMessageDialog(null, "No hay habitacion del tipo deseado diponible en estos momentos");
            }else{
                reservaciones.eliminar(ci);
                Estado estado = new Estado(num_hosp, reservacion.getCliente(), reservacion.getFechaLlegada());
                estados.insertEstado(estado);
                JOptionPane.showMessageDialog(null, "Se le ha asignado la habitacion " + num_hosp);
            }
        }else{
            JOptionPane.showMessageDialog(null, "La cedula es invalida");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        v2.setVisible(true);
    }//GEN-LAST:event_MenuActionPerformed

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
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIn(v2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Menu;
    private javax.swing.JTextField input_ci;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
