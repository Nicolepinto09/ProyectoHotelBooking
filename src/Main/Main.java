package Main;

import Funciones.Helpers;
import Interfaces.Menu;

/**
 *
 * @author nicolepinto
 */
public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setVisible(true);
        boolean validar = true;
        while (validar) {
            String ci = "28.155.004";
            Helpers cedula = new Helpers(ci);
            validar = cedula.validacion();
        }
    }
    
}
