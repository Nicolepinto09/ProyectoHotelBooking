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
    private int num_hab;
    private Cliente cliente;
    private String llegada;

    public Estado(int num_hab, Cliente cliente, String llegada) {
        this.num_hab = num_hab;
        this.cliente = cliente;
        this.llegada = llegada;
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
