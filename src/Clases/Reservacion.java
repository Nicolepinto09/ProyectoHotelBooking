/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author nicolepinto
 */
public class Reservacion {
    private Cliente cliente;
    private String tipo_hab;
    private String fechaLlegada;
    private String fechaSalida;

    public Reservacion(Cliente cliente, String tipo_hab, String fechaLlegada, String fechaSalida) {
        this.cliente = cliente;
        this.tipo_hab = tipo_hab;
        this.fechaLlegada = fechaLlegada;
        this.fechaSalida = fechaSalida;
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
     * @return the fechaLlegada
     */
    public String getFechaLlegada() {
        return fechaLlegada;
    }

    /**
     * @param fechaLlegada the fechaLlegada to set
     */
    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    /**
     * @return the fechaSalida
     */
    public String getFechaSalida() {
        return fechaSalida;
    }

    /**
     * @param fechaSalida the fechaSalida to set
     */
    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return "Cliente:" + cliente.getNombre() +" " + cliente.getApellido() + ", "+cliente.getCedula() + "\nTipo de Habitacion:" + tipo_hab + "\nFecha de Llegada:" + fechaLlegada + "\nFecha de Salida:" + fechaSalida;    }
    
}
