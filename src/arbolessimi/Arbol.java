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
    private String estado;
    Arbol(){
        raiz = null;
        nombreA1 = new ArrayList();
        nombreA2 = new ArrayList();
    }
    
    public void insertar(int x){
        //direccion 1 derecha 2 izquierda
        Nodo nuevo =new Nodo(x);
        if (raiz == null){
            raiz = nuevo;
        }else{
            Nodo p,q=null ;
            p=raiz;
            while(p!=null){
                if (x < p.Info){
                   q=p;
                   p=p.Izq;
                }else{
                    if(x>p.Info){
                        q=p;
                        p=p.Dere;
                    }else{
                        return;
                    }
                }
            }
            if (x<q.Info){
                q.Izq = new Nodo(x);
            }else{
                if(x>q.Info){
                    q.Dere = new Nodo (x);
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
    
 
    
    // Semejantes
    public boolean compa(Nodo a1, Nodo a2){
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
                return true;
            }else{
                System.out.println("No son semejantes");
                return false;
            }
        }else{
            System.out.println("Longitud !=");
            return false;
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
    
    //iguales
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
    //similares
    public  void InordenSimilar(Nodo a1, Nodo a2) {
        if (a1 != null && a2 != null) {
            InordenSimilar(a1.Izq, a2.Izq);
            InordenSimilar(a1.Dere, a2.Dere);
        }
        if (a1 != null && a2 == null || a2 != null && a1 == null) {
            this.estado = "noEsSimilar";
        }
    }
    
    public  boolean repetidos(Nodo arbol1, Nodo arbol2){
        // la informacion de uno o mas nodos es distinta
        // arbol1inor y arbol2inor son los recorridos en inorden de cada arbol, en una variable string
        String arbol1inor = CadenaInorden(arbol1);
        System.out.println(CadenaInorden(arbol1));
        String arbol2inor = CadenaInorden1(arbol2);
        System.out.println(CadenaInorden(arbol1));
        for(int i = 0; i<arbol1inor.length(); i++){
            char numero1 = arbol1inor.charAt(i);
            char numero2 = arbol2inor.charAt(i);
            if(numero1 != numero2) return true;
            
        }
        return false;
    }
    
    public boolean esSimilar(Nodo arbol1, Nodo arbol2){
        this.estado = "similar";
        InordenSimilar(arbol1, arbol2);
        boolean r2 = repetidos(arbol1, arbol2);
        
        System.out.println("MISMA ESTRUCTURA: "+ this.estado);
        System.out.println("POR LO MENOS UN DIFERENTE: "+ r2);
        
        if(r2 == true && this.estado.equals("similar")){
            System.out.println("ES SIMILAR");
            return true;
        }
        return false;
    }
    String cadena1="";
    String CadenaInorden(Nodo a2){
        if(a2!=null){
            CadenaInorden(a2.Izq);
            //System.out.println(a2.Info);
            cadena1 =cadena1+a2.Info;
            CadenaInorden(a2.Dere);     
        }
        return cadena1;
    }
    String cadena3="";
    String CadenaInorden1(Nodo a2){
        if(a2!=null){
            CadenaInorden1(a2.Izq);
            //System.out.println(a2.Info);
            cadena3 =cadena3+a2.Info;
            CadenaInorden1(a2.Dere);     
        }
        return cadena3;
    }
    
    public int Verificcion(Nodo a, Nodo b){
        int number = 0; 
        if(sameTree(a,b)==true){
            number=1;
        }else{
            if(compa(a, b)==true){
                number=2;
            }else{
                if(esSimilar(a, b)==true){
                    number=3;
                }else{
                    number =4;
                }
            }
            
        }
        return number;
        
    }
    
}
