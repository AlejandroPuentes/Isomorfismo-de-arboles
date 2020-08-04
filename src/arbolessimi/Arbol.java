/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolessimi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author User
 */
public class Arbol {
    Nodo raiz;
    ArrayList nombreA1;
    ArrayList nombreA2;
    Arbol(){
        raiz = null;
        nombreA1 = new ArrayList();
        nombreA2 = new ArrayList();
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
  

    public void Inorden(Nodo a1){
        if(a1!=null){
            Inorden(a1.Izq);
            nombreA1.add(a1.Info);
            Inorden(a1.Dere);
        }
    }
  
    public void Inorden2(Nodo a2){
        if(a2!=null){
            Inorden2(a2.Izq);
            nombreA2.add(a2.Info);
            Inorden2(a2.Dere);     
        }
    }
   
    boolean prueba3 = true;
    public void InordenSimi(Nodo a1, Nodo a2){
        if(a1!=null && a2!=null){
            InordenSimi(a1.Izq,a2.Izq);
            if(a1.Info!=a2.Info){
                prueba3 = true;
                System.out.println("EL ARBOL ES SIMILAR");
            }else{
                prueba3 =false;
                System.out.println("EL ARBOL NO ES SIMILAR");
            }
            InordenSimi(a1.Dere,a2.Dere);
        }if(a1 !=null && a2==null || a2 != null && a1==null){
            System.out.println("NO son similares");
        }
    }
    
    public void compa(Nodo a1, Nodo a2){
        //System.out.println(a1.Info);
        //System.out.println(a2.Info);
        boolean x = true;
        LinkedList rec = new LinkedList();
        LinkedList rec2 = new LinkedList();
        int lon1=CantidadNodos(a1, rec);
        //System.out.println(lon1);
        int lon2=CantidadNodos2(a2, rec2);
        //System.out.println(lon2);
        if(lon1==lon2){
            Inorden(a1);
            Collections.sort(nombreA1);
            Inorden2(a2);
            Collections.sort(nombreA2);
            for(int i=0; i<lon1; i++){
                System.out.println(nombreA1.get(i));
                System.out.println(nombreA2.get(i));
                if(nombreA1.get(i)==nombreA2.get(i)){
                    System.out.println("Si");
                    x=true;
                }else{
                    x=false;
                    System.out.println("No");
                }
            }if(x==true){
                System.out.println("Son semejantes");
            }else{
                System.out.println("No son semejantes");
            }
        }else{
            System.out.println("Longitud !=");
        }
    }
    int prueba=0;
    public int CantidadNodos(Nodo aux, LinkedList recorrido){
        if(aux != null){
            CantidadNodos(aux.Izq, recorrido);
            recorrido.add(aux.Info);
            CantidadNodos(aux.Dere, recorrido);
            prueba++;
        }
        return prueba;
    }
        int prueba2=0;
    public int CantidadNodos2(Nodo aux, LinkedList recorrido){
        if(aux != null){
            CantidadNodos2(aux.Izq, recorrido);
            recorrido.add(aux.Info);
            CantidadNodos2(aux.Dere, recorrido);
            prueba2++;
        }
        return prueba2;
    }
    boolean sameTree(Nodo root1, Nodo root2){
        if(root1 == null && root2 == null){ 
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.Info == root2.Info && sameTree(root1.Izq,root2.Izq) && sameTree(root1.Dere, root2.Dere)){
            System.out.println("Son iguales");
            return true;
        }
        System.out.println("No son iguales");
        return false;
    }
    
}
