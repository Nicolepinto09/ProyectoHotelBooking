package Funciones;

public class Helpers {
    private String ci;

    public Helpers(String ci) {
        this.ci = ci;
    }
    
    public boolean validacion() {
        String digitos = ci.replace(".", "");
        try {
            Integer.parseInt(digitos);
            System.out.println("BIEN");
            return true;
        } catch (Exception e) {
            System.out.println("MAL");
            return false;
        }
    }
    
}
