/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico4Parte2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ricardo
 */
public class Lector extends Thread{
    private int id;
    private Libro li;
    
    public Lector(int id1, Libro l1){
        this.id = id1;
        this.li = l1;
    }
    public void run(){
        while(true){
            try {
                li.empezarLeer(id);
                // leyendo
                li.terminarLeer(id);
            } catch (InterruptedException ex) {
                Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
}
