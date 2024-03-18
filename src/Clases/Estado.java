/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author nicolepinto
 */
public class Estado {
    private int numerohabitacion;
    private Cliente cliente;
    private String llegada;

    public Estado(int numerohabitacion, Cliente cliente, String llegada) {
        this.numerohabitacion = numerohabitacion;
        this.cliente = cliente;
        this.llegada = llegada;
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
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the llegada
     */
    public String getLlegada() {
        return llegada;
    }

    /**
     * @param llegada the llegada to set
     */
    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }
    
}
