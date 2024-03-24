/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EDD.ListaSimple;

/**
 *
 * @author nicolepinto
 */
public class Habitacion {
    private int num_hab;
    private String tipo_hab;
    private int piso;
    private boolean dispo;
    private ListaSimple historial_hab;
    
    public Habitacion(int num_hab, String tipo_hab, int piso) {
        this.num_hab = num_hab;
        this.tipo_hab = tipo_hab;
        this.piso = piso;
        this.dispo = false;
        this.historial_hab = new ListaSimple();
    }

    /**
     * @return the num_hab
     */
    public int getNum_hab() {
        return num_hab;
    }

    /**
     * @param num_hab the num_hab to set
     */
    public void setNum_hab(int num_hab) {
        this.num_hab = num_hab;
    }

    /**
     * @return the tipo_hab
     */
    public String getTipo_hab() {
        return tipo_hab;
    }

    /**
     * @param tipo_hab the tipo_hab to set
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

    /**
     * @return the dispo
     */
    public boolean isDispo() {
        return dispo;
    }

    /**
     * @param dispo the dispo to set
     */
    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    /**
     * @return the historial_hab
     */
    public ListaSimple getHistorial_hab() {
        return historial_hab;
    }

    /**
     * @param historial_hab the historial_hab to set
     */
    public void setHistorial_hab(ListaSimple historial_hab) {
        this.historial_hab = historial_hab;
    }
    
    
    
}
