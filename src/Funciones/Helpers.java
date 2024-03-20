package Funciones;

import javax.swing.JOptionPane;

public class Helpers {
    private String nombre;
    private String apellido;
    private String lista_nombre;
    private String lista_apellido;
    private int num_hab;
    private String ci;
    private String lista_ci;
    private String email;
    private String genero;
    private String tipo_hab;
    private String celular;
    private String llegada;
    private String salida;

    public Helpers(String nombre, String apellido, String lista_nombre, String lista_apellido, int num_hab) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.lista_nombre = lista_nombre;
        this.lista_apellido = lista_apellido;
        this.num_hab = num_hab;
    }

    public Helpers(String lista_nombre, String lista_apellido, String ci, String lista_ci, String email, String genero, String tipo_hab, String celular, String llegada, String salida) {
        this.lista_nombre = lista_nombre;
        this.lista_apellido = lista_apellido;
        this.ci = ci;
        this.lista_ci = lista_ci;
        this.email = email;
        this.genero = genero;
        this.tipo_hab = tipo_hab;
        this.celular = celular;
        this.llegada = llegada;
        this.salida = salida;
    }
    
    public Helpers(String ci) {
        this.ci = ci;
    }
    
    public boolean validacion() {
        String digitos = ci.replace(".", "");
        try {
            Integer.parseInt(digitos);
            return false;
        } catch (Exception e) {
            return true;
        }
    }
    
//import Funciones.Helpers;
//    
//        boolean validar = true;
//        while (validar) {
//            String ci = "28.155.004";
//            Helpers cedula = new Helpers(ci);
//            validar = cedula.validacion();
//        }

    public boolean clientes(){
        boolean verificacion = false;
        if (apellido == lista_apellido && nombre == lista_nombre)  {
            JOptionPane.showMessageDialog(null, "El cliente " + nombre + " " + apellido + " se encuentra alojado en la habitación " + num_hab);
            verificacion = true;
        }
        return verificacion;
    }
    
    public boolean reservacion() {
        boolean reserva = true;
        for (int i = 1; i < ci.length()+1; i++) {
            if (ci.charAt(ci.length()-i) != lista_ci.charAt(lista_ci.length()-i)) {
                reserva = false;
                break;
            }
        }
        if (reserva) {
            JOptionPane.showMessageDialog(null, "- Cliente: " + lista_nombre + " " + lista_apellido + "\n- C.I. " + lista_ci +
                    "\n- Correo: " + email + "\n- Género: " + genero + "\n- Tipo de habitación: " + tipo_hab + 
                    "\n- Teléfono: " + celular + "\n- Fecha de entrada: " + llegada + "\n- Fecha de salida: " + salida);
        }
        return reserva;
    }
    
}
