/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import Clases.Cliente;
import Clases.Habitacion;
import Clases.Reservacion;
import EDD.ABB;
import EDD.AVL;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author nicolepinto
 */
public class ArchivoCSV {
    
        private Helpers help = new Helpers();

    //funcion para leer archivo TXT
    public void Leer_reservas(ABB reservaciones) {
        String line;
        String expresion_txt = "";
        String path = "test//Reservas.csv";
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        expresion_txt += line + "\n";
                    }
                }
                if (!"".equals(expresion_txt)) {
                    String[] expresion_split = expresion_txt.split("\n");
                    for (int i = 0; i < expresion_split.length; i++) {
                        String[] info = expresion_split[i].split(",");
                        if (help.ValidarCedula(info[0]) != -1 && help.Validar_TipoHab(info[5]) != null && help.ValidarCorreo(info[3]) != null && help.ValidarTelf(info[6]) != null) {
                            int cedula = help.ValidarCedula(info[0]);
                            String nombre = info[1];
                            String apellido = info[2];
                            String correo = help.ValidarCorreo(info[3]);
                            String genero = info[4];
                            String telefono = help.ValidarTelf(info[6]);

                            Cliente cliente = new Cliente(nombre, apellido, correo, genero, cedula, telefono);

                            String tipo_hab = help.Validar_TipoHab(info[5]);
                            String fecha_llegada = info[7];
                            String fecha_salida = info[8];

                            Reservacion reserva = new Reservacion(cliente, tipo_hab, fecha_llegada, fecha_salida);

                            reservaciones.insertNodo(reservaciones.getNodoRaiz(), reserva);

                        } else {
                            JOptionPane.showMessageDialog(null, "Existe un error en alguno de los datos");
                            break;
                        }
                    }
                }
                br.close();
            }
        } catch (HeadlessException | IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al leer la expresion");
        }

    }
        public void Leer_habitaciones(AVL habitaciones) {
        String line;
        String expresion_txt = "";
        String path = "test//Habitaciones.csv";
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        expresion_txt += line + "\n";
                    }
                }
                if (!"".equals(expresion_txt)) {
                    String[] expresion_split = expresion_txt.split("\n");
                    for (int i = 0; i < expresion_split.length; i++) {
                        String[] info = expresion_split[i].split(",");
                        if (help.ValidarNumeros(info[0]) != -1 && help.ValidarNumeros(info[2]) != -1 && help.Validar_TipoHab(info[1]) != null) {
                            int num_hab = help.ValidarNumeros(info[0]);
                            String tipo_hab = help.Validar_TipoHab(info[1]);
                            int piso = help.ValidarNumeros(info[2]);

                            Habitacion hab = new Habitacion(num_hab, tipo_hab, piso);

                           habitaciones.insertar(num_hab, hab);
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "Existe un error en alguno de los datos");
                            break;
                        }
                    }
                }
                br.close();
            }
        } catch (HeadlessException | IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al leer la expresion");
        }
    }
    
    
    
}
