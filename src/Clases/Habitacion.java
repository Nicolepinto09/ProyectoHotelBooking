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
    private int numeroHabitacion;
    private String tipodeHabitacion;
    private int piso;
    private boolean dispo;
    private ListaSimple historial_hab;

    public Habitacion(int numeroHabitacion, String tipodeHabitacion, int piso) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipodeHabitacion = tipodeHabitacion;
        this.piso = piso;
        this.historial_hab = new ListaSimple();
        this.dispo = false;
    }

    
    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getTipodeHabitacion() {
        return tipodeHabitacion;
    }

    public void setTipodeHabitacion(String tipodeHabitacion) {
        this.tipodeHabitacion = tipodeHabitacion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }
    
    public ListaSimple getHistorial_hab() {
        return historial_hab;
    }

    public void setHistorial_hab(ListaSimple historial_hab) {
        this.historial_hab = historial_hab;
    }
    
    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    @Override
    public String toString() {
        return "Habitacion:" + "numeroHabitacion:" + numeroHabitacion + ", tipodeHabitacion:" + tipodeHabitacion + ", piso:" + piso ;
    }
    
    public String mostrar_historial(){
        if(!historial_hab.isEmpty()){
            return historial_hab.Transformar();
        }
        
        return "No hay historial en esta habitacion";
    }

}
