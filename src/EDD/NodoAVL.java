/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import Clases.Habitacion;

/**
 *
 * @author pedro
 */
public class NodoAVL {
    private int numero;
    private NodoAVL hijoizquierdo;
    private NodoAVL hijoderecho;
    private Habitacion habitacion;
    private int altura;

    public NodoAVL(Habitacion habitacion, int numero) {
        this.habitacion = habitacion;
        this.altura = 1;
        this.numero = numero;
        this.hijoderecho = null;
        this.hijoizquierdo = null;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the hijoizquierdo
     */
    public NodoAVL getHijoizquierdo() {
        return hijoizquierdo;
    }

    /**
     * @param hijoizquierdo the hijoizquierdo to set
     */
    public void setHijoizquierdo(NodoAVL hijoizquierdo) {
        this.hijoizquierdo = hijoizquierdo;
    }
    
    
    
}
