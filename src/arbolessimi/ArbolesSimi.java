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
public class ArbolesSimi {
    public static void main (String src[]){
        Arbol ar = new Arbol();
        Arbol arr = new Arbol();
        ar.insertar(6);
        ar.insertar(5);
        ar.insertar(4);
        ar.insertar(3);
        ar.insertar(2);
        ar.insertar(1);
        
        arr.insertar(11);
        arr.insertar(10);
        arr.insertar(9);
        arr.insertar(8);
        arr.insertar(7);
        arr.insertar(6);
        
        arr.esSimilar(ar.raiz, arr.raiz);
        System.out.println(ar.CadenaInorden(ar.raiz));
        //ar1.sameTree(ar.raiz, ar1.raiz);
        
        //ar1.compa(ar.raiz, ar1.raiz);
    }
    
}
