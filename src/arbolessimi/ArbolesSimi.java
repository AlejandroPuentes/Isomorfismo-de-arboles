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
        ar.insertar(2, 2);
        ar.insertar(3, 1);
        ar.insertar(4, 2);
        ar.insertar(5, 1);
        ar.insertar(1, 2);

        
        ar1.insertar(6, 1);
        ar1.insertar(2, 2);
        ar1.insertar(3, 1);
        ar1.insertar(4, 2);
        ar1.insertar(5, 1);
        ar1.insertar(1, 2);
        
        //ar1.sameTree(ar.raiz, ar1.raiz);
        
        ar1.compa(ar.raiz, ar1.raiz);
    }
    
}
