/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolessimi;

/**
 *
 * @author User
 */
public class Nodo {
    int Info;
    Nodo Izq;
    Nodo Dere;
    
    Nodo(int info){
        this.Info= info;
        Izq=Dere=null;
    }
}
