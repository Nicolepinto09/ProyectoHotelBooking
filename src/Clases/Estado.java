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
    private int num_hab;
    private Cliente cliente;
    private String fechaLlegada;
    private ListaSimple acompañantes;


    public Estado(int num_hab, Cliente cliente, String fechaLlegada) {
        this.num_hab = num_hab;
        this.cliente = cliente;
        this.fechaLlegada = fechaLlegada;
        this.acompañantes = new ListaSimple();
    }

    public int getNum_hab() {
        return num_hab;
    }

    public void setNum_hab(int num_hab) {
        this.num_hab = num_hab;
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
    
    

    // Arregla el to String para que imprima bonito
    @Override
    public String toString() {
        return "num_hab=" + num_hab + ", cliente=" + cliente.getCedula() + ", llegada=" + fechaLlegada + '\n';
    }

    /*Compara si dos documentos son iguales*/
    public boolean compareEstado(Estado estado) {
        return (estado.getCliente().getTelefono() == null ? this.cliente.getTelefono() == null : estado.getCliente().getTelefono().equals(this.cliente.getTelefono())) && estado.getCliente().getNombre().equalsIgnoreCase(this.cliente.getNombre());
    }
    
}
