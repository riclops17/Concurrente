/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaParcial;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ricardo
 */
public class Barbero  extends Thread{
    private Barberia b;
    
    public Barbero(Barberia b1){
        this.b = b1;
    }
    public void run(){
        
            
        
        try {
            b.esperarCliente();
            b.CortarPelo();
        } catch (InterruptedException ex) {
            Logger.getLogger(Barbero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
