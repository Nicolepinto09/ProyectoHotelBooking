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
    
    
    
}
