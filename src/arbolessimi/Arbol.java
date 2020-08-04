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
public class Arbol {
    Nodo raiz;
    
    Arbol(){
        raiz = null;
    }
    
    public void insertar(int x, int dire){
        //direccion 1 derecha 2 izquierda
        Nodo nuevo =new Nodo(x);
        if (raiz == null){
            raiz = nuevo;
        }else{
            Nodo p ;
            p=raiz;
            while(p!=null){
                if (dire==1){
                   if(p.Dere==null){
                       p.Dere=new Nodo(x);
                       return;
                   }else{
                       p=p.Dere;
                   } 
                }else{
                    if(p.Izq==null){
                       p.Izq=new Nodo(x);
                       return;
                   }else{
                       p=p.Izq;
                   }
                }
            }           
        }
        
    }
    
       

}
