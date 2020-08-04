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
        Arbol ar1 = new Arbol();
        ar.insertar(6, 1);
        ar.insertar(5, 1);
        ar.insertar(4, 1);
        ar.insertar(3, 1);
        ar.insertar(2, 1);
        ar.insertar(1, 1);

        
        ar1.insertar(7, 1);
        ar1.insertar(8, 1);
        ar1.insertar(9, 1);
        ar1.insertar(10, 1);
        ar1.insertar(11, 1);
        ar1.insertar(12, 1);
        
        ar1.InordenSimi(ar.raiz, ar1.raiz);
        //ar1.sameTree(ar.raiz, ar1.raiz);
        
        //ar1.compa(ar.raiz, ar1.raiz);
    }
    
}
