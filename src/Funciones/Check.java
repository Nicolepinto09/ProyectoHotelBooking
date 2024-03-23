/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import Clases.Estado;
import Clases.Habitacion;
import EDD.ABB;
import EDD.HashTable;
import EDD.NodoABB;

/**
 *
 * @author nicolepinto
 */
public class Check {
    private Estado habitacion;
    private HashTable huespedes;
    private ABB reservaciones;

    public Check(Estado habitacion, HashTable huespedes, ABB reservaciones) {
        this.habitacion = habitacion;
        this.huespedes = huespedes;
        this.reservaciones = reservaciones;
    }
    
    public void ChekIn(int cedula){
        NodoABB found = this.reservaciones.buscarNodo(reservaciones.getNodoRaiz(), cedula);
        System.out.println("asdsdweqw");
        if(found != null){
            Habitacion f = this.habitacion.SearchEmpty(found.getHabitacion(), habitacion.getRaiz());
            System.out.println("//");
            if(f != null){
//                System.out.println("0000");
                this.huespedes.Insert(found.getFirstname(),found.getLastname(), f.getH());
                f.setS(true);
                System.out.println("Cliente: " + found.getFirstname() + " " + found.getLastname() + "\n" + "Habitacion "+ found.getHabitacion());
                System.out.println("Se ha realizado los tramites perfectamente");
            }else{
                System.out.println("popopopopopop");
                System.out.println("La habitacion que se habia pedido aun no esta libre");
            }
        }else{
            System.out.println("Por la cedula ingresada " + cedula + " no se encontro reservaciones");
        }
    }
    
    public void Checkout(int cedula){
        NodoABB found = this.reservaciones.buscarNodo(reservaciones.getNodoRaiz(), cedula);
        if(found != null){
            Nodo f = this.huespedes.Search(found.getFirstname(), found.getLastname());
            if(f != null){
               Habitacion h = this.habitacion.SearchRoom(cedula, habitacion.getRaiz());
               h.setS(false);
               h.Insert(found.getFirstname(), found.getLastname(), found.getEmail(), found.getGender(), found.getIn(), found.getOut());
                System.out.println("Nombre: "  + found.getFirstname() + " "+ found.getLastname() + "\n" + "Habitacion: " + found.getHabitacion() + "\n" +  "Entrada: " + found.getIn() + "Salida: "+ found.getOut()+ "Email: " + found.getEmail());
               this.huespedes.Delete(f.getFirstname(), f.getLastname(), f.getRoom());
               this.reservaciones.delete(cedula);
               System.out.println("Se confirmo su salida del hotel que tenga un lindo dia");
            }else{
                System.out.println("No se ha encontrado a la persona en la base de datos");
            }
        }else{
            System.out.println("El cliente no se encontro en los huespedes actuales");
        }
    }
}
