/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import Clases.Habitacion;
import Clases.Historial;

/**
 *
 * @author pedro
 */
public class NodoAVL {
    private int h;
    private String t;
    private String f;
    private boolean s;
    private Historial[] array;
    private NodoAVL d;
    private NodoAVL i;
    public NodoAVL(int h, String t, String f){
        this.h = h;
        this.t = t;
        this.f = f;
        this.s = false;
        this.array = new Historial[10];
        for (int i = 0; i < 10; i++) {
            array[i]= null;
        }
    }

    /**
     * @return the h
     */
    public int getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(int h) {
        this.h = h;
    }

    /**
     * @return the t
     */
    public String getT() {
        return t;
    }

    /**
     * @param t the t to set
     */
    public void setT(String t) {
        this.t = t;
    }

    /**
     * @return the f
     */
    public String getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(String f) {
        this.f = f;
    }

    /**
     * @return the s
     */
    public boolean isS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(boolean s) {
        this.s = s;
    }

    /**
     * @return the array
     */
    public Historial[] getArray() {
        return array;
    }

    /**
     * @param array the array to set
     */
    public void setArray(Historial[] array) {
        this.array = array;
    }

    /**
     * @return the d
     */
    public NodoAVL getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(NodoAVL d) {
        this.d = d;
    }

    /**
     * @return the i
     */
    public NodoAVL getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(NodoAVL i) {
        this.i = i;
    }
    
}
