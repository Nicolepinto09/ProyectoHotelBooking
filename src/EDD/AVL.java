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
public class AVL {
    
    private NodoAVL raiz;

    public AVL() {
        raiz = null;
    }

    public NodoAVL getRaiz() {
        return raiz;
    }

    public void insertar(int clave, Habitacion hab) {
        raiz = insertar(raiz, clave, hab);
    }

    
    private int altura(NodoAVL N) {
        if (N == null)
            return 0;
        return N.getAltura();
    }

    
    private NodoAVL insertar(NodoAVL nodo, int clave, Habitacion hab) {
        if (nodo == null) {
            return new NodoAVL(clave, hab);
        }

        if (clave < nodo.getClave()) {
            nodo.setIzquierda(insertar(nodo.getIzquierda(), clave, hab));
        } else if (clave > nodo.getClave()) {
            nodo.setDerecha(insertar(nodo.getDerecha(), clave, hab));
        } else {
            return nodo;
        }

        // Actualizar altura del nodo actual
        nodo.setAltura(1 + Math.max(altura(nodo.getIzquierda()), altura(nodo.getDerecha())));

        // Verificar el balanceo del árbol y aplicar rotaciones si es necesario
        return balancear(nodo, clave);
    }

    private NodoAVL balancear(NodoAVL nodo, int clave) {
        int balance = getBalance(nodo);

        // Rotación simple a la derecha
        if (balance > 1 && clave < nodo.getIzquierda().getClave()) {
            return rotarDerecha(nodo);
        }

        // Rotación simple a la izquierda
        if (balance < -1 && clave > nodo.getDerecha().getClave()) {
            return rotarIzquierda(nodo);
        }

        // Rotación doble izquierda derecha
        if (balance > 1 && clave > nodo.getIzquierda().getClave()) {
            nodo.setIzquierda(rotarIzquierda(nodo.getIzquierda()));
            return rotarDerecha(nodo);
        }


        if (balance < -1 && clave < nodo.getDerecha().getClave()) {
            nodo.setDerecha(rotarDerecha(nodo.getDerecha()));
            return rotarIzquierda(nodo);
        }

        return nodo;
    }


    private int getBalance(NodoAVL N) {
        if (N == null)
            return 0;
        return altura(N.getIzquierda()) - altura(N.getDerecha());
    }


    private NodoAVL rotarDerecha(NodoAVL y) {
        NodoAVL x = y.getIzquierda();
        NodoAVL T2 = x.getDerecha();

        x.setDerecha(y);
        y.setIzquierda(T2);
        
        y.setAltura(Math.max(altura(y.getIzquierda()), altura(y.getDerecha())) + 1);
        x.setAltura(Math.max(altura(x.getIzquierda()), altura(x.getDerecha())) + 1);

        return x;
    }

    private NodoAVL rotarIzquierda(NodoAVL x) {
        NodoAVL y = x.getDerecha();
        NodoAVL T2 = y.getIzquierda();

        y.setIzquierda(x);
        x.setDerecha(T2);

        x.setAltura(Math.max(altura(x.getIzquierda()), altura(x.getDerecha())) + 1);
        y.setAltura(Math.max(altura(y.getIzquierda()), altura(y.getDerecha())) + 1);

        return y;
    }
    
    public void inOrden() {
        inOrden(raiz);
    }

    private void inOrden(NodoAVL nodo) {
        if (nodo != null) {
            inOrden(nodo.getIzquierda()); 
            System.out.println(nodo.getClave() + " - " + nodo.getHab().toString()); 
            inOrden(nodo.getDerecha()); 
        }
    }
    
    public Habitacion buscarPorClave(int clave) {
        NodoAVL actual = raiz;

        while (actual != null) {
            if (clave < actual.getClave()) {
                actual = actual.getIzquierda();
            } else if (clave > actual.getClave()) {
                actual = actual.getDerecha();
            } else {
                return actual.getHab();
            }
        }
        return null;
    }

}
