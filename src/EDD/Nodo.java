/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author nicolepinto
 */
public class Nodo {
    private String nombre;
    private String apellido;
    private int cuarto;
    private Nodo siguiente;
    public Nodo(String nombre, String apellido, int cuarto){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuarto = cuarto;
        this.siguiente = null;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the cuarto
     */
    public int getCuarto() {
        return cuarto;
    }

    /**
     * @param cuarto the cuarto to set
     */
    public void setCuarto(int cuarto) {
        this.cuarto = cuarto;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
