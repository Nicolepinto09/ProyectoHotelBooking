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
}
