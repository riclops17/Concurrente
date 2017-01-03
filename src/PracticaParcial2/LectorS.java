/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaParcial2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ricardo
 */
public class LectorS extends Thread {
    private int id;
    private LibroS li;
    
    public LectorS(int id1, LibroS l1){
        this.id = id1;
        this.li = l1;
    }
    public void run(){

            
                
        
        try {
            li.empezarLeer(id);
            li.terminarLeer(id);
        } catch (InterruptedException ex) {
            Logger.getLogger(LectorS.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        
                
                
           
       
}
}
