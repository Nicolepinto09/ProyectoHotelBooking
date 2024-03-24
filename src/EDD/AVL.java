/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author pedro
 */
public class AVL {
    private NodoAVL raiz;
    public AVL(){
        this.raiz = null;
    }

    /**
     * @return the raiz
     */
    public NodoAVL getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(NodoAVL raiz) {
        this.raiz = raiz;
    }
    
    public void InsertarCuarto(int h, String t, String f, NodoAVL aux){
        NodoAVL newh = new NodoAVL(h,t,f);
        if(this.getRaiz() == null){
            this.setRaiz(newh);
        }else{
            if(aux != null){
            if (aux.getH() > h){
                if(aux.getI() == null){
                    aux.setI(newh);
                }else{
                    InsertarCuarto(h,t,f,aux.getI());
                }
            }else{
                if(aux.getD() == null){
                    aux.setD(newh);
                }else{
                    InsertarCuarto(h,t,f,aux.getD());
                }
            }
        }
      }
    }
    public NodoAVL BuscarCuarto(int h, NodoAVL aux){
        if(aux!= null){
            if(aux.getH() != h){
                if(aux.getH() < h){
                    NodoAVL b = BuscarCuarto(h,aux.getI());
                    return b;
                }else{
                    NodoAVL a = BuscarCuarto(h,aux.getD());
                    return a;
                }
            }else{
                return aux;
            }
        }
        return null;
    }
    
    public NodoAVL BuscarVacio(String t, NodoAVL aux){
        if(aux != null){
            if(aux.getT().equals(t) && aux.isS() == false){
                return aux;
            }else{
                NodoAVL a = BuscarVacio(t, aux.getI());
                if(a == null){
                    NodoAVL b = BuscarVacio(t, aux.getD());
                    return b;
                }else{
                    return a;
                }
            }
        }
        return null;
    }
}
