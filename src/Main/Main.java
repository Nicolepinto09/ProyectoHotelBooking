/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import javax.swing.JOptionPane;

/**
 *
 * @author nicolepinto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String apellido = "Montilla";
        String nombre = "Alejandro";
        String lista_apellido = "Montilla";
        String lista_nombre = "Miguel";
        if (apellido == lista_apellido && nombre == lista_nombre)  {
            JOptionPane.showMessageDialog(null, "REGISTRADO");
        } else {
            JOptionPane.showMessageDialog(null, "Nuevo cliente.");
        }
    }
    
}
