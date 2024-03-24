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
    
}
