/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;
import Clases.Cliente;
import Clases.Estado;

/**
 *
 * @author nicolepinto
 */
public class HashTable {
    private int size;
    private Estado[] estado;

    public HashTable() {
        this.size = 300;
        this.estado = new Estado[size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Estado[] getEstado() {
        return estado;
    }

    public void setEstado(Estado[] estado) {
        this.estado = estado;
    }

    public void initTable() {
        setEstado(new Estado[getSize()]);
        for (int i = 0; i < size; i++) {
            getEstado()[i] = null;
        }
    }

    public void insertEstado(Estado estado) {
        if (!estaEnHash(estado)) {
            int index = estado.getNumeroHabitacion();
            while (getEstado()[index] != null) {
                index++;
            }
            getEstado()[index] = estado;
        } 
    }

    public boolean estaEnHash(Estado est) {
        boolean aux = false;
        for (int i = 0; i < this.getEstado().length; i++) {
            if (getEstado()[i] != null) {
                if (getEstado()[i].compareEstado(est)) {
                    aux = true;
                }
            }
        }
        return aux;
    }

    public int indiceEnHash(Estado est) {
        for (int i = 0; i < this.getEstado().length; i++) {
            if (getEstado()[i] != null) {
                if (getEstado()[i].compareEstado(est)) {
                    return i;
                }
            }
        }

        return -1;
    }

    public int indiceDeClienteEnHash(Cliente cliente) {
        for (int i = 0; i < this.getEstado().length; i++) {
            if (getEstado()[i] != null) {
                if (getEstado()[i].getCliente().getNombre().equalsIgnoreCase(cliente.getNombre()) && getEstado()[i].getCliente().getApellido().equalsIgnoreCase(cliente.getApellido())) {
                    return i;
                } else {
                    for (int j = 0; j < getEstado()[i].getAcompañantes().getSize(); j++) {
                        Cliente acomp = (Cliente) getEstado()[i].getAcompañantes().getValor(j);
                        if (acomp.getNombre().equalsIgnoreCase(cliente.getNombre()) && acomp.getApellido().equalsIgnoreCase(cliente.getApellido())) {
                            return i;
                        }
                    }
                }
            }
        }
        return -1;
    }

    public Estado indiceDeEstadoEnHash(Cliente cliente) {
        for (int i = 0; i < this.getEstado().length; i++) {
            if (getEstado()[i] != null) {
                if (getEstado()[i].getCliente().getNombre().equalsIgnoreCase(cliente.getNombre()) && getEstado()[i].getCliente().getApellido().equalsIgnoreCase(cliente.getApellido())) {
                    return getEstado()[i];
                }
            }
        }

        return null;
    }

    public void AgregarAcompañante(Cliente cliente, Cliente acomp) {
        for (int i = 0; i < this.getEstado().length; i++) {
            if (getEstado()[i] != null) {
                if (getEstado()[i].getCliente().getNombre().equalsIgnoreCase(cliente.getNombre()) && getEstado()[i].getCliente().getApellido().equalsIgnoreCase(cliente.getApellido())) {
                    getEstado()[i].getAcompañantes().insertarFinal(acomp);
                }
            }
        }
    }

    public void Disponibles(ListaSimple hab_disp) {
        for (int i = 1; i < this.getEstado().length; i++) {
            if (getEstado()[i] == null) {
                hab_disp.insertarFinal(i);
            }
        }
    }

}
