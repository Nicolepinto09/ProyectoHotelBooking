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
public class Estado {
    private int numeroHabitacion;
    private Cliente cliente;
    private String fechaLlegada;
    private ListaSimple acompañantes;


    public Estado(int numeroHabitacion, Cliente cliente, String fechaLlegada) {
        this.numeroHabitacion = numeroHabitacion;
        this.cliente = cliente;
        this.fechaLlegada = fechaLlegada;
        this.acompañantes = new ListaSimple();
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public ListaSimple getAcompañantes() {
        return acompañantes;
    }

    public void setAcompañantes(ListaSimple acompañantes) {
        this.acompañantes = acompañantes;
    }
    
    
    @Override
    public String toString() {
        return "Numero de habitacion:" + numeroHabitacion + ", cliente:" + cliente.getCedula() + ", llegada:" + fechaLlegada + '\n';
    }

    /*Compara si dos documentos son iguales*/
    public boolean compareEstado(Estado estado) {
        return (estado.getCliente().getTelefono() == null ? this.cliente.getTelefono() == null : estado.getCliente().getTelefono().equals(this.cliente.getTelefono())) && estado.getCliente().getNombre().equalsIgnoreCase(this.cliente.getNombre());
    }
    
}
