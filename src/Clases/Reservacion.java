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
    private String tipohabitacion;
    private String fechaLlegada;
    private String fechaSalida;

    public Reservacion(Cliente cliente, String tipohabitacion, String fechaLlegada, String fechaSalida) {
        this.cliente = cliente;
        this.tipohabitacion = tipohabitacion;
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
    
}
