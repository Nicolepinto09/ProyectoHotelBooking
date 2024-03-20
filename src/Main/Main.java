package Main;

import Funciones.Helpers;

/**
 *
 * @author nicolepinto
 */
public class Main {

    public static void main(String[] args) {
        boolean validar = true;
        while (validar) {
            String ci = "28.155.004";
            Helpers cedula = new Helpers(ci);
            validar = cedula.validacion();
        }
    }
    
}
