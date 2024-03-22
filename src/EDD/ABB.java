/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author nicolepinto
 */
public class ABB {
    private NodoABB nodoRaiz;

    public ABB() {
        this.nodoRaiz = null;
    }

    public NodoABB getNodoRaiz() {
        return nodoRaiz;
    }

    public void setNodoRaiz(NodoABB nodoRaiz) {
        this.nodoRaiz = nodoRaiz;
    }

    public boolean esVacio() {
        return this.getNodoRaiz() == null;
    }

    public void vaciar() {
        this.setNodoRaiz(null);
    }

    public void insertNodo(NodoABB raiz, Reservacion reservacion) {
        NodoABB node = new NodoABB(reservacion);
        if (esVacio()) {
            setNodoRaiz(node);
        } else {
            if (reservacion.getCliente().getCedula() <= (int) raiz.getReservacion().getCliente().getCedula()) {
                if (raiz.getHijoIzquierdo() == null) {
                    raiz.setHijoIzquierdo(node);
                    node.setPadre(raiz);
                } else {
                    insertNodo(raiz.getHijoIzquierdo(), reservacion);
                }
            } else {
                if (raiz.getHijoDerecho() == null) {
                    raiz.setHijoDerecho(node);
                    node.setPadre(raiz);
                } else {
                    insertNodo(raiz.getHijoDerecho(), reservacion);
                }
            }
        }
    }

    public NodoABB buscarNodo(NodoABB nodoActual, int num) {
        if (nodoActual == null || nodoActual.getReservacion().getCliente().getCedula() == num) {
            return nodoActual;
        }

        if (num < nodoActual.getReservacion().getCliente().getCedula()) {
            return buscarNodo(nodoActual.getHijoIzquierdo(), num);
        } else {
            return buscarNodo(nodoActual.getHijoDerecho(), num);
        }
    }

    public void preOrden(NodoABB root) {
        if (root != null) {
            System.out.println("{ " + root.getReservacion().toString() + " }");
            preOrden(root.getHijoIzquierdo());
            preOrden(root.getHijoDerecho());
        }
    }

    public String preOrden2(NodoABB root, String cadena) {
        if (root != null) {
            cadena = cadena + root.getReservacion().toString() + ",";
            cadena = preOrden2(root.getHijoIzquierdo(), cadena);
            cadena = preOrden2(root.getHijoDerecho(), cadena);
        }

        return cadena;
    }


    public void inOrden(NodoABB root) {
        if (root != null) {
            preOrden(root.getHijoIzquierdo());
            System.out.println("{ " + root.getReservacion().toString() + " }");
            preOrden(root.getHijoDerecho());
        }
    }

    public void postOrden(NodoABB root) {
        if (root != null) {
            preOrden(root.getHijoIzquierdo());
            preOrden(root.getHijoDerecho());
            System.out.println("{ " + root.getReservacion().toString() + " }");
        }
    }

    public void Lista(NodoABB root, ListaSimple list) {
        list.insertarFinal(root.getReservacion());

        if (root.getHijoIzquierdo() != null) {
            Lista(root.getHijoIzquierdo(), list);
        }
        if (root.getHijoDerecho() != null) {
            Lista(root.getHijoDerecho(), list);
        }
    }
    
public boolean eliminar(int cedula) {
    NodoABB nodoAEliminar = buscarNodo(this.nodoRaiz, cedula);
    if (nodoAEliminar == null) {
        return false; // El nodo con la cédula especificada no existe.
    }

    // Caso 1 y 2: Nodo sin hijos o con un solo hijo.
    if (nodoAEliminar.getHijoIzquierdo() == null || nodoAEliminar.getHijoDerecho() == null) {
        NodoABB nuevoNodo;
        if (nodoAEliminar.getHijoIzquierdo() == null) {
            nuevoNodo = nodoAEliminar.getHijoDerecho();
        } else {
            nuevoNodo = nodoAEliminar.getHijoIzquierdo();
        }

        if (nodoAEliminar.getPadre() == null) { // Si es la raíz
            this.nodoRaiz = nuevoNodo;
        } else if (nodoAEliminar == nodoAEliminar.getPadre().getHijoIzquierdo()) {
            nodoAEliminar.getPadre().setHijoIzquierdo(nuevoNodo);
        } else {
            nodoAEliminar.getPadre().setHijoDerecho(nuevoNodo);
        }

        if (nuevoNodo != null) {
            nuevoNodo.setPadre(nodoAEliminar.getPadre());
        }
    } else { // Caso 3: Nodo con dos hijos.
        NodoABB sucesor = encontrarSucesor(nodoAEliminar.getHijoDerecho());
        eliminar(sucesor.getReservacion().getCliente().getCedula()); // Elimina el nodo sucesor (que no tendrá dos hijos).
        nodoAEliminar.setReservacion(sucesor.getReservacion());
    }
    return true;
}

private NodoABB encontrarSucesor(NodoABB nodo) {
    while (nodo.getHijoIzquierdo() != null) {
        nodo = nodo.getHijoIzquierdo();
    }
    return nodo;
}
}
