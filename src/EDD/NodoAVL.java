/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import Clases.Habitacion;

/**
 *
 * @author nicolepinto
 */
public class NodoAVL {
    
    private int clave;
    private Habitacion hab;
    private int altura;
    private NodoAVL izquierda;
    private NodoAVL derecha;

    public NodoAVL(int clave, Habitacion hab) {
        this.hab = hab;
        this.clave = clave;
        this.altura = 1;
        this.izquierda = null;
        this.derecha = null;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public NodoAVL getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoAVL izquierda) {
        this.izquierda = izquierda;
    }

    public NodoAVL getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoAVL derecha) {
        this.derecha = derecha;
    }

    public Habitacion getHab() {
        return hab;
    }

    public void setHab(Habitacion hab) {
        this.hab = hab;
    }
    
            
    public boolean completo(){
        return (getDerecha()!=null && getIzquierda()!=null);
    }
    
    public boolean esHoja(){
        return (getDerecha()==null && getIzquierda()==null);
    }

    public boolean tieneIzquierda(){
        return (getIzquierda()!=null);
    }

    public boolean tieneDerecha(){
        return (getDerecha()!=null);
    }
      
}
