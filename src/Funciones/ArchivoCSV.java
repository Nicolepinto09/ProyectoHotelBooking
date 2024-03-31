/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import Clases.Cliente;
import Clases.Estado;
import Clases.Habitacion;
import Clases.Reservacion;
import EDD.ABB;
import EDD.AVL;
import EDD.HashTable;
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
        //funcion para leer archivo TXT

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
        
        //funcion para leer archivo TXT

        public void Leer_Estado(HashTable table) {
        String line;
        String expresion_txt = "";
        String path = "test//Estado.csv";
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
                    Cliente ultimo_cliente = new Cliente();

                    for (int i = 0; i < expresion_split.length - 1; i++) {
                        String[] info = expresion_split[i].split(",");

                        if (!info[0].equalsIgnoreCase("")) {
                            if (help.ValidarNumeros(info[0]) != -1 && help.ValidarCorreo(info[3]) != null && help.ValidarTelf(info[5]) != null) {
                                int num_hab = help.ValidarNumeros(info[0]);

                                String nombre = info[1];
                                String apellido = info[2];
                                String email = help.ValidarCorreo(info[3]);
                                String sexo = info[4];
                                String telf = help.ValidarTelf(info[5]);
                                Cliente cliente = new Cliente(nombre, apellido, email, sexo, telf);

                                ultimo_cliente.setApellido(apellido);
                                ultimo_cliente.setNombre(nombre);

                                String fecha_llegada = info[6];

                                Estado estado = new Estado(num_hab, cliente, fecha_llegada);
                                table.insertEstado(estado);

                            } else {
                                JOptionPane.showMessageDialog(null, "Hay un error en algun dato");
                                break;
                            }
                        } else {
                            if (i != 0) {
                                if (help.ValidarCorreo(info[3]) != null && help.ValidarTelf(info[5]) != null) {
                                    String nombre = info[1];
                                    String apellido = info[2];
                                    String email = help.ValidarCorreo(info[3]);
                                    String sexo = info[4];
                                    String telf = help.ValidarTelf(info[5]);
                                    Cliente cliente = new Cliente(nombre, apellido, email, sexo, telf);
                                    
                                    table.AgregarAcompañante(ultimo_cliente, cliente);

                                }
                            }
                        }
                    }
                }
                br.close();
            }
        } catch (HeadlessException | IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al leer la expresion");
        }
    }
   
    //funcion para leer archivo TXT
        
    public void Leer_historial(AVL habitaciones) {
        String line;
        String expresion_txt = "";
        String path = "test//Historico.csv";
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
                        if (help.ValidarCedula(info[0]) != -1 && help.ValidarCorreo(info[3]) != null) {
                            int cedula = help.ValidarCedula(info[0]);
                            String nombre = info[1];
                            String apellido = info[2];
                            String correo = help.ValidarCorreo(info[3]);
                            String genero = info[4];
                            String date = info[5];
                            
                            int num_hab = help.ValidarNumeros(info[6]);

                            Cliente cliente = new Cliente(nombre, apellido, correo, genero, cedula);
                            
                            Estado estado = new Estado(num_hab, cliente, date);
                            
                            
                            habitaciones.buscarPorClave(num_hab).getHistorial_hab().insertarFinal(estado);

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
