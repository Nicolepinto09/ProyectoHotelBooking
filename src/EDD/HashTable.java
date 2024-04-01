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

    
    //Inicia un arreglo de estados con valores nulos
    
    public void initTable() {
        setEstado(new Estado[getSize()]);
        for (int i = 0; i < size; i++) {
            getEstado()[i] = null;
        }
    }

    //Inserta un nuevo estado en el arreglo de estados
    
    public void insertEstado(Estado estado) {
        if (!estaEnHash(estado)) {
            int index = estado.getNumeroHabitacion();
            while (getEstado()[index] != null) {
                index++;
            }
//            JOptionPane.showMessageDialog(null, "La clave del Cliente " + estado.getCliente().getNombre()+ " es: " + index);
            getEstado()[index] = estado;
        } else {
//            JOptionPane.showMessageDialog(null, "¡ERROR!\nEl estado ya está registrado");
        }
    }

    //Verifica si un estado ya está presente en el arreglo de estados
    
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

    //Encuentra el índice de un estado en el arreglo de estados
    
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

    //Encuentra el índice de un cliente en el arreglo de estados
    
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

    //Encuentra el estado asociado a un cliente en el arreglo de estados
    
    public Estado indiceDeEstadoEnHash(Cliente cliente) {
        for (int i = 0; i < this.getEstado().length; i++) {
            if (getEstado()[i] != null) {
                if (getEstado()[i].getCliente().getNombre().equalsIgnoreCase(cliente.getNombre()) && getEstado()[i].getCliente().getApellido().equalsIgnoreCase(cliente.getApellido())) {
                    return getEstado()[i];
                } else {

                    for (int j = 0; j < getEstado()[i].getAcompañantes().getSize(); j++) {
                        Cliente acomp = (Cliente) getEstado()[i].getAcompañantes().getValor(j);
                        if (acomp.getNombre().equalsIgnoreCase(cliente.getNombre()) && acomp.getApellido().equalsIgnoreCase(cliente.getApellido())) {
                            return getEstado()[i];
                        }
                    }
                }
            }
        }

        return null;
    }
    
    //Agrega un acompañante a un estado dado.

    public void AgregarAcompañante(Cliente cliente, Cliente acomp) {
        for (int i = 0; i < this.getEstado().length; i++) {
            if (getEstado()[i] != null) {
                if (getEstado()[i].getCliente().getNombre().equalsIgnoreCase(cliente.getNombre()) && getEstado()[i].getCliente().getApellido().equalsIgnoreCase(cliente.getApellido())) {
                    getEstado()[i].getAcompañantes().insertarFinal(acomp);
                }
            }
        }
    }

    //Encuentra las habitaciones disponibles y las agrega a una lista
    
    public void Disponibles(ListaSimple hab_disp) {
        for (int i = 1; i < this.getEstado().length; i++) {
            if (getEstado()[i] == null) {
                hab_disp.insertarFinal(i);
            }
        }
    }

    //Elimina un estado dado del arreglo de estados
    
    public boolean eliminarEstado(Estado estadoAEliminar) {
        int indice = indiceEnHash(estadoAEliminar);
        if (indice != -1) {
            estado[indice] = null;
            return true;
        }
        return false;
    }

}
