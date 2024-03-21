/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author nicolepinto
 */
public class HashTable {
    private ListaSimple[] array;
    private int size;
    public HashTable(int size){
        this.size = size;
        for (int i = 0; i < this.size; i++) {
            this.array[i] = new ListaSimple();
            
        }
    }

    /**
     * @return the array
     */
    public ListaSimple[] getArray() {
        return array;
    }

    /**
     * @param array the array to set
     */
    public void setArray(ListaSimple[] array) {
        this.array = array;
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
    //a(int)
    public Integer Key(String firstname, String lastname){
        Integer a = 0;
        for (int i = 0; i < firstname.length(); i++) {
             char b = firstname.charAt(i);
            a += (int)b;
        }
        for (int i = 0; i < lastname.length(); i++) {
             char b = lastname.charAt(i);
            a += (int)b;
        }
        return a % getSize();
    }
    
    public void Insert(String firstname, String lastname, int room){
        Integer f = Key(firstname, lastname);
        this.array[f].Insert(firstname, lastname, room);
    }
    
    public void Delete(String firstname, String lastname, int room){
        Integer f = Key(firstname, lastname);
        this.array[f].Delete(firstname, lastname, room);
    }
    
    public Nodo Search(String firstname, String lastname){
        Integer f = Key(firstname, lastname);
        Nodo p = this.array[f].Search(firstname, lastname);
        return p;
    }
    
    public String Print(){
        String a = "";
        for (int i = 0; i < this.size; i++) {
           a += this.array[i].Imprimir();
        }
        return a;
    }
}
