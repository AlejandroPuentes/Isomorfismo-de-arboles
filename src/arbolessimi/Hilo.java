/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolessimi;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Hilo implements Runnable{
    private final arbolesS panta;
    private Thread Hilo;
    int x=300;
    int y=67;
    boolean Estado = true;
    
    public Hilo (arbolesS ven){
        this.panta=ven;
    }
    
    @Override
    public void run() {
        try {
            Animar();
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void iniciar() {
        Hilo = new Thread(this);
        Hilo.start();
    }

    public void Animar() throws InterruptedException {
        
        while (Estado) {
            //dibujar();
            //Niveles();
            pintar();
            Hilo.sleep(60);
        }
    }
    
    
     
    public void pintar(){ 
        BufferedImage DobleBufer=new BufferedImage(panta.getArbolA().getWidth(), panta.getArbolA().getHeight(),BufferedImage.TYPE_INT_RGB);
        Graphics lapiz = DobleBufer.getGraphics();
        Nodo padresus = panta.Arbol_A.raiz;
        Graficos.pintaArbol(lapiz, padresus, x, y, 67,67, 1);
        panta.getArbolA().getGraphics().drawImage(DobleBufer, 0, 0, panta.getArbolA());
        panta.getArbolA().getGraphics().dispose();
        
    }
    
    
    
   
    

}
