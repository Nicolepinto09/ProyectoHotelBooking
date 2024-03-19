/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import javax.swing.JOptionPane;
import Funciones.Helpers;

/**
 *
 * @author nicolepinto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ci = "28.155.004";
        Helpers cedula = new Helpers(ci);
        cedula.validacion();
    }
    
}
