/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author nicolepinto
 */
public class ListaSimple {
    private Nodo primero;
    private int size;
    
    public ListaSimple(){
        this.primero = null;
        this.size = 0;
    }
    
    public void Insert(String firstname, String lastname, int room){
        Nodo newcliente = new Nodo(firstname, lastname, room);
        if(this.getFirst() == null){
            setFirst(newcliente);
        }else{
            Nodo aux = getFirst();
            if(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            } else{
                aux.setSiguiente(newcliente);
            }
        }
        setSize(getSize() + 1);
    }
    
    public void Delete(String firstname, String lastname, int room){
        if(this.getFirst() == null){
            System.out.println("No hay clientes para que se puedan eliminar");
        }else{
        Nodo abc = getFirst();
        if(abc.getNombre().equals(firstname) && abc.getApellido().equals(lastname) && abc.getCuarto() == room){
            this.setFirst(this.getFirst().getSiguiente());
            
        }else{
        while(abc.getSiguiente() != null && !abc.getSiguiente().getNombre().equals(firstname) && !abc.getSiguiente().getApellido().equals(lastname) && abc.getSiguiente().getCuarto() != room){
            abc = abc.getSiguiente();
        }
        if(abc.getSiguiente()!= null){
        abc.setSiguiente(abc.getSiguiente().getSiguiente());}
        setSize(getSize() - 1);}}
    }
    
    public Nodo Search(String firstname, String lastname){
        Nodo aux = getFirst();
        while(aux != null && !aux.getNombre().equals(firstname) && !aux.getApellido().equals(lastname)){
            aux = aux.getSiguiente();
        }return aux;
    }
    
    public String Imprimir(){
        String a = "";
        Nodo aux = primero;
        while(aux != null) {
              a +="Nombre: " +  aux.getNombre() +" Apellido: " + aux.getApellido() + " Cuarto: "+aux.getCuarto()+"\n";
              aux = aux.getSiguiente();
        }
        return a;
    }

    /**
     * @return the first
     */
    public Nodo getFirst() {
        return primero;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(Nodo primero) {
        this.primero = primero;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
}
