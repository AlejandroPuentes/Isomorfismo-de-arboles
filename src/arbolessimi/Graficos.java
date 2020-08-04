/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolessimi;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author User
 */
public class Graficos {
    
    public static void pintaArbol(Graphics g, Nodo n, int x, int y,int xoff,int yoff,int nivel){
        System.out.println(x);
        System.out.println(y);
        System.out.println(xoff);
        System.out.println(yoff);
        if(y==yoff){
            if (n == null) return;
                g.setColor(Color.CYAN);
            if(n.Izq!= null){ 
                g.drawLine(x, y, x - xoff+(nivel*2), y + yoff);     
            }
            if(n.Dere!= null){
                g.drawLine(x, y, (x+43) + xoff-(nivel*2), (y-10) + yoff);
            }

            g.fillOval(x-10, y-20, 30, 30);
            g.setColor(Color.BLACK);
            g.drawString(n.Info+"", x , y );
            pintaArbol(g, n.Izq, (int)(x - xoff), (y + yoff),xoff+nivel*2,yoff,nivel+1);
            pintaArbol(g, n.Dere, (int)((x+50) + xoff), (y + yoff),xoff-nivel*2,yoff,nivel+1); 
        }else{
            if (n == null) return;
                g.setColor(Color.CYAN);
            if(n.Izq!= null){ 
                g.drawLine(x, y, x - xoff+(nivel*2), y + yoff);     
            }
            if(n.Dere!= null){
                g.drawLine(x, y, x + xoff-(nivel*2), y + yoff);
            }
            g.fillOval(x-10, y-20, 30, 30);
            g.setColor(Color.BLACK);
            g.drawString(n.Info+"", x , y );
            pintaArbol(g, n.Izq, (int)(x - xoff), (y + yoff),xoff+nivel*2,yoff,nivel+1);
            pintaArbol(g, n.Dere, (int)((x) + xoff), (y + yoff),xoff-nivel*2,yoff,nivel+1); 
           }
   }
    
}

