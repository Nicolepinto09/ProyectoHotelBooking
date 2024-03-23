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

    public int getNum_hab() {
        return num_hab;
    }

    public void setNum_hab(int num_hab) {
        this.num_hab = num_hab;
    }

    public String getTipo_hab() {
        return tipo_hab;
    }

    public void setTipo_hab(String tipo_hab) {
        this.tipo_hab = tipo_hab;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    public ListaSimple getHistorial_hab() {
        return historial_hab;
    }

    public void setHistorial_hab(ListaSimple historial_lab) {
        this.historial_hab = historial_lab;
    }

        public String mostrar_historial(){
        if(!historial_hab.isEmpty()){
            return historial_hab.Transformar();
        }
        
        return "No hay historial en esta habitacion";
    }

    
    @Override
    public String toString() {
        return "Habitacion{" + "num_hab=" + num_hab + ", tipo_hab=" + tipo_hab + ", piso=" + piso + ", dispo=" + dispo + ", historial_lab=" + historial_hab + '}';
    }

    
}
