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
    private String fechallegada;
    private String fechasalida;

    public Reservacion(Cliente cliente, String tipohabitacion, String fechallegada, String fechasalida) {
        this.cliente = cliente;
        this.tipohabitacion = tipohabitacion;
        this.fechallegada = fechallegada;
        this.fechasalida = fechasalida;
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
     * @return the fechallegada
     */
    public String getFechallegada() {
        return fechallegada;
    }

    /**
     * @param fechallegada the fechallegada to set
     */
    public void setFechallegada(String fechallegada) {
        this.fechallegada = fechallegada;
    }

    /**
     * @return the fechasalida
     */
    public String getFechasalida() {
        return fechasalida;
    }

    /**
     * @param fechasalida the fechasalida to set
     */
    public void setFechasalida(String fechasalida) {
        this.fechasalida = fechasalida;
    }
}
