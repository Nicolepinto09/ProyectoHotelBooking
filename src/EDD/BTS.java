/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author nicolepinto
 */
public class BTS {
    NodoBTS root;
    public BTS(){
        this.root = null;
    }
    public NodoBTS Search(int cedula, NodoBTS aux){
        NodoBTS found = null;
        if (aux.getCi() != cedula){
           found = Search(cedula, aux.getLeft());
           if(found == null){
              found = this.Search(cedula, aux.getRight()); 
           }
           
           return found;
        }else{
            return aux;
        }
    }
    
    public void Insert(int cedula, String firstname, String lastname, String email, String gender, String habitacion, String celular, String in, String out){
        NodoBTS r = new NodoBTS(cedula, firstname, lastname, email, gender, habitacion, celular, in, out);
        if(this.root == null){
            this.root = r;
        }else{
            Ins(r, this.root);
        }
        
    }
    
    public void Ins(NodoBTS r, NodoBTS aux){
        if (aux != null){
            if(aux.getCi() > r.getCi()){
                if(aux.getLeft() == null){
                    aux.setLeft(r);
                }else{
                    Ins(r, aux.getLeft());
                }
            }else{
                if(aux.getRight() == null){
                    aux.setRight(r);
                }else{
                    Ins(r, aux.getRight());
                }
            }      
    }
  }
}
