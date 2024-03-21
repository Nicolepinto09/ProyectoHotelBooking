/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author nicolepinto
 */
public class Historial {
    private int numerohabitacion;
    private String tipohabitacion;
    private int piso;

    public Historial(int numerohabitacion, String tipohabitacion, int piso) {
        this.numerohabitacion = numerohabitacion;
        this.tipohabitacion = tipohabitacion;
        this.piso = piso;
    }

    /**
     * @return the numerohabitacion
     */
    public int getNumerohabitacion() {
        return numerohabitacion;
    }

    /**
     * @param numerohabitacion the numerohabitacion to set
     */
    public void setNumerohabitacion(int numerohabitacion) {
        this.numerohabitacion = numerohabitacion;
    }

    /**
     * @return the tipohabitacion
     */
    public String getTipohabitacion() {
        return tipohabitacion;
    }

    /**
     * @param tipohabitacion the tipohabitacion to set
     */
    public void setTipohabitacion(String tipohabitacion) {
        this.tipohabitacion = tipohabitacion;
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
