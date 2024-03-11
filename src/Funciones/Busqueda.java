package Funciones;

public class Busqueda {
    private String name;
    private String lastname;
    private String list_name;
    private String list_lastname;
    private int num_hab;

    public Busqueda(String name, String lastname, String list_name, String list_lastname, int num_hab) {
        this.name = name;
        this.lastname = lastname;
        this.list_name = list_name;
        this.list_lastname = list_lastname;
        this.num_hab = num_hab;
    }
     
    public void registro(){
        if (lastname == list_lastname && name == list_name)  {
            JOptionPane.showMessageDialog(null, num_hab);
        } else {
            JOptionPane.showMessageDialog(null, "Nuevo cliente.");
        }
    }
    
}
