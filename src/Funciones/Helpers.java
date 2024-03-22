package Funciones;

import javax.swing.JOptionPane;

public class Helpers {
    
    public boolean clientes(String apellido, String lista_apellido, String nombre, String lista_nombre) {
        boolean verificacion = false;
        if (apellido == lista_apellido && nombre == lista_nombre) {
            verificacion = true;
        }
        return verificacion;
    }
    
    public boolean validarletras(String letra) {
        return letra.matches("[a-zA-Zñ]*");
    }

    public String ValidarLetras(String letras) {
        if (validarletras(letras) == true) {
            return letras;
        } else {
            return null;
        }
    }
    
    public boolean validarCI(String ci) {
        String digitos = ci.replace(".", "");
        try {
            Integer.valueOf(digitos);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }
    
    private boolean validarnumeros(String num) {
        return num.matches("[0-9]*");
    }
    
    public int ValidarNumeros(String numero) {
        if(validarnumeros(numero)== true){
            int num = Integer.parseInt(numero);
            return num;
        } else {
            return -1;
        }
    }
    
    public int ValidarCedula(String ci) {
        String replaceAll = ci.replace(".", "");
        if (validarnumeros(replaceAll)== true) {
            if (replaceAll.length() >= 7 && replaceAll.length()<= 9) {
                int num = Integer.parseInt(replaceAll);
                return num;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
    
    public boolean reservacion(String ci, String lista_ci, String lista_apellido, String lista_nombre, String correo, String genero, String tipo_hab, String celular, String llegada, String salida) {
        boolean reserva = true;
        for (int i = 1; i < ci.length()+1; i++) {
            if (ci.charAt(ci.length()-i) != lista_ci.charAt(lista_ci.length()-i)) {
                reserva = false;
                break;
            }
        }
        return reserva;
    }
   
    public String ValidarTelf(String telefono) {
        String cell = telefono.replaceAll(" ", "");
        if (cell.charAt(0) == '(') {
            if (cell.charAt(4) == ')') {
                String cell_uno = cell.replace('(', '0');
                String cell_dos = cell_uno.replace(')', '0');
                if (validarnumeros(cell_dos) == true) {
                    return telefono;
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
    
    public String ValidarCorreo(String correo){
        int count = 0;
        for (int i = 0; i < correo.length(); i++) {
            if(correo.charAt(i) == '@') {
                count++;
            }
        }
        if (count == 1) {
            return correo;
        } else {
            return null;
        }
    }
    
    public String Validar_TipoHab(String tipo_hab){
        if (tipo_hab.equalsIgnoreCase("simple") || tipo_hab.equalsIgnoreCase("doble") || tipo_hab.equalsIgnoreCase("triple") || tipo_hab.equalsIgnoreCase("suite")) {
            return tipo_hab;
        } else {
              return null;
        }
    }

}
