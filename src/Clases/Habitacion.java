/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author nicolepinto
 */
public class Habitacion {
    private int num_hab;
    private String tipo_hab;
    private int piso;

    public Habitacion(int num_hab, String tipo_hab, int piso) {
        this.num_hab = num_hab;
        this.tipo_hab = tipo_hab;
        this.piso = piso;
    }

    /**
     * @return the numerohabitacion
     */
    public int getNum_hab() {
        return num_hab;
    }

    /**
     * @param num_hab the numerohabitacion to set
     */
    public void setNum_hab(int num_hab) {
        this.num_hab = num_hab;
    }

    /**
     * @return the tipohabitacion
     */
    public String getTipo_hab() {
        return tipo_hab;
    }

    /**
     * @param tipo_hab the tipohabitacion to set
     */
    public void setTipo_hab(String tipo_hab) {
        this.tipo_hab = tipo_hab;
    }

    /**
     * @return the piso
     */
    public int getPiso() {
        return piso;
    }

    /**
     * @param piso the piso to set
     */
    public void setPiso(int piso) {
        this.piso = piso;
    }
    
}
