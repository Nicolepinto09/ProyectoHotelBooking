package Funciones;

import javax.swing.JOptionPane;

public class Busqueda {
    private String name;
    private String lastname;
    private String list_name;
    private String list_lastname;
    private int num_hab;
    private String ci;
    private String list_ci;
    private String email;
    private String genero;
    private String tipo_hab;
    private String celular;
    private String llegada;
    private String salida;

    public Busqueda(String name, String lastname, String list_name, String list_lastname, int num_hab) {
        this.name = name;
        this.lastname = lastname;
        this.list_name = list_name;
        this.list_lastname = list_lastname;
        this.num_hab = num_hab;
    }

    public Busqueda(String list_name, String list_lastname, String ci, String list_ci, String email, String genero, String tipo_hab, String celular, String llegada, String salida) {
        this.list_name = list_name;
        this.list_lastname = list_lastname;
        this.ci = ci;
        this.list_ci = list_ci;
        this.email = email;
        this.genero = genero;
        this.tipo_hab = tipo_hab;
        this.celular = celular;
        this.llegada = llegada;
        this.salida = salida;
    }
     
    public void clientes(){
        if (lastname == list_lastname && name == list_name)  {
            JOptionPane.showMessageDialog(null, "El cliente " + name + " " + lastname + " se encuentra alojado en la habitación " + num_hab);
        }
    }
    
    public void reservacion() {
        boolean r = true;
        for (int i = 1; i < ci.length()+1; i++) {
            if (ci.charAt(ci.length()-i) != list_ci.charAt(list_ci.length()-i)) {
                r = false;
                break;
            }
        }
        if (r) {
            JOptionPane.showMessageDialog(null, "- Cliente: " + list_name + " " + list_lastname + "\n- C.I. " + list_ci +
                    "\n- Correo: " + email + "\n- Género: " + genero + "\n- Tipo de habitación: " + tipo_hab + 
                    "\n- Teléfono: " + celular + "\n- Fecha de entrada: " + llegada + "\n- Fecha de salida: " + salida);
        }
    }
    
}
