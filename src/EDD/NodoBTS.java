/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author nicolepinto
 */
public class NodoBTS {
    private NodoBTS izquierda;
    private NodoBTS derecha;
    private int cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String genero;
    private String habitacion;
    private String celular;
    private String entrada;
    private String salida;

    public NodoBTS(int cedula, String nombre, String apellido, String correo, String genero, String habitacion, String celular, String entrada, String salida) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.genero = genero;
        this.habitacion = habitacion;
        this.celular = celular;
        this.entrada = entrada;
        this.salida = salida;
        this.izquierda = null;
        this.derecha = null;
    }
    /**
     * @return the left
     */
    public NodoBTS getLeft() {
        return izquierda;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(NodoBTS izquierda) {
        this.izquierda = izquierda;
    }

    /**
     * @return the right
     */
    public NodoBTS getRight() {
        return derecha;
    }

    /**
     * @param right the right to set
     */
    public void setRight(NodoBTS derecha) {
        this.derecha = derecha;
    }

    /**
     * @return the ci
     */
    public int getCi() {
        return cedula;
    }

    /**
     * @param ci the ci to set
     */
    public void setCi(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return nombre;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.nombre = nombre;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return apellido;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return correo;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String correo) {
        this.correo = correo;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return genero;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String genero) {
        this.genero = genero;
    }

    /**
     * @return the habitacion
     */
    public String getHabitacion() {
        return habitacion;
    }

    /**
     * @param habitacion the habitacion to set
     */
    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the in
     */
    public String getIn() {
        return entrada;
    }

    /**
     * @param in the in to set
     */
    public void setIn(String entrada) {
        this.entrada = entrada;
    }

    /**
     * @return the out
     */
    public String getOut() {
        return salida;
    }

    /**
     * @param out the out to set
     */
    public void setOut(String salida) {
        this.salida = salida;
    }

}
