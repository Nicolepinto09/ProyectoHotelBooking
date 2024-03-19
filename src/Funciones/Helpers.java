package Funciones;

public class Helpers {
    private String ci;

    public Helpers(String ci) {
        this.ci = ci;
    }
    
    public boolean validacion() {
        boolean cedula = false;
        String digitos = ci.replace(".", "");
        System.out.println(digitos);
        return cedula;
    }
            
}
