/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import Clases.Reservacion;

/**
 *
 * @author nicolepinto
 */
public class NodoABB {
    private Reservacion reservacion;         
    private NodoABB hijoIzquierdo;
    private NodoABB hijoDerecho;
    private NodoABB padre;

    public Reservacion getReservacion() {
        return reservacion;
    }

    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }

    public NodoABB getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoABB hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoABB getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoABB hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public NodoABB getPadre() {
        return padre;
    }

    public void setPadre(NodoABB padre) {
        this.padre = padre;
    }

    public NodoABB(Reservacion reservacion) {
        this.reservacion = reservacion;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
        this.padre = null;
    }
}
