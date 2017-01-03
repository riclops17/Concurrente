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
public class Auto extends Thread {
    private int id;
    private Transbordador t;
    
   public Auto(int id1, Transbordador t1){
       this.id = id1;
       this.t = t1;
   }
   public void run(){
       while(true){
        try {
            
            t.entrar(id);
             Thread.sleep(2000);
            t.salir(id);
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Auto.class.getName()).log(Level.SEVERE, null, ex);
        }
      
   }
}
}
