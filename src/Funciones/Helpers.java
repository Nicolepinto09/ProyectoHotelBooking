package Funciones;

import javax.swing.JOptionPane;

public class Helpers {
    
    //Esta función verifica si una cadena de texto contiene solo letras (mayúsculas, minúsculas o caracteres especiales como la letra "ñ")
    public boolean validarletras(String letra){
        return letra.matches("[a-zA-Zñ]*");
    }
    
    //Verifica si una cadena de texto contiene solo números
    private boolean validarnumeros(String num){
        return num.matches("[0-9]*");
    }

    //Esta función verifica si una cadena de texto contiene solo números y la convierte a un entero si es así
    public int ValidarNumeros(String numero){
        if(validarnumeros(numero)== true){
            int num = Integer.parseInt(numero);
            return num;
        }else{
            return -1;
        }
    }
// Verifica si una cadena de texto contiene solo letras utilizando la función validarletras    
    public String ValidarLetras(String letras){
        if (validarletras(letras) == true) {
            return letras;
        } else {
            return null;
        }
    }
      
    //Verifica si una cadena de texto contiene solo números y si tiene una longitud válida para representar un número de cédula
    public int ValidarCedula(String ci){
        String replaceAll = ci.replace(".", "");
        if(validarnumeros(replaceAll)== true){
            if(replaceAll.length() >= 6 && replaceAll.length()<= 8){
                int num = Integer.parseInt(replaceAll);
                return num;
            }else{
                return -1;
            }
        }else{
            return -1;
        }
    }
    
    //Verifica si una cadena de texto representa un número de teléfono válido
    public String Validartelf(String telefono){
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
    
    //Verifica si una cadena de texto representa una dirección de correo electrónico válida
    public String ValidarCorreo(String correo){
        int count = 0;
        for (int i = 0; i < correo.length(); i++) {
            if(correo.charAt(i) == '@'){
                count++;
            }
        }
        if(count == 1){
            return correo;
        }else{
            return null;
        }
    }
    
    //Verifica si una cadena de texto representa un tipo válido de habitación, como "simple", "doble", "triple" o "suite"
    public String Validar_TipoHab(String tipodeHabitacion){
        if(tipodeHabitacion.equalsIgnoreCase("simple") || tipodeHabitacion.equalsIgnoreCase("doble") || tipodeHabitacion.equalsIgnoreCase("triple") || tipodeHabitacion.equalsIgnoreCase("suite")){
            return tipodeHabitacion;
        }else{
              return null;
        }
    }

}
