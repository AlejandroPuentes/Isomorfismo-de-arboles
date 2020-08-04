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
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Hilo2 implements Runnable{
    private final arbolesS panta;
    private Thread Hilo2;
    int x=300;
    int y=67;
    boolean Estado = true;
    
    public Hilo2 (arbolesS ven){
        this.panta=ven;
    }
    
    @Override
    public void run() {
        try {
            Animar();
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void iniciar() {
        Hilo2 = new Thread(this);
        Hilo2.start();
    }

    public void Animar() throws InterruptedException {
        
        while (Estado) {
            pintar();
            Hilo2.sleep(60);
        }
    }
    
    
     
    public void pintar(){ 
        BufferedImage DobleBufer=new BufferedImage(panta.getArbolB().getWidth(), panta.getArbolB().getHeight(),BufferedImage.TYPE_INT_RGB);
        Graphics lapiz = DobleBufer.getGraphics();
        Nodo padresus = panta.Arbol_B.raiz;
        Graficos.pintaArbol(lapiz, padresus, x, y, 67,67, 1);
        panta.getArbolB().getGraphics().drawImage(DobleBufer, 0, 0, panta.getArbolB());
        panta.getArbolB().getGraphics().dispose();
        
    }
    
    
    
   
    

}
