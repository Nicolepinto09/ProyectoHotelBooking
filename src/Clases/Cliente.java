/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author nicolepinto
 */
public class Cliente {
    private String nombre;
    private String apellido; 
    private String correo;
    private String genero;
    private int cedula;
    private String telefono;

    public Cliente(String nombre, String apellido, String correo, String genero, int cedula, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.genero = genero;
        this.cedula = cedula;
        this.telefono = telefono;
    }
    public Cliente(String nombre, String apellido, String correo, String genero, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.genero = genero;
        this.cedula = 0;
        this.telefono = telefono;
    }
    
    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = null;
        this.genero = null;
        this.cedula = 0;
        this.telefono = null;
    }
    
    public Cliente(String nombre, String apellido, String correo, String genero, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.genero = genero;
        this.cedula = cedula;
        this.telefono = null;
    }
    
    public Cliente() {
        this.apellido = this.nombre = null;
        this.correo = null;
        this.genero = null;
        this.cedula = 0;
        this.telefono = null;
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
     * @return the Correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the Correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", genero=" + genero + ", cedula=" + cedula + ", telefono=" + telefono + '}';
    }
    
}
