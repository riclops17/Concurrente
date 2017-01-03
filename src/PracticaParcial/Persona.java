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
public class Persona  extends Thread{
    private int id;
    private MonitorMuseo m;
    public Persona(int i,MonitorMuseo r){
        this.id = i;
        this.m = r;
    }
    public void run() {
        while (true){
           
            try {
                m.entrarSala(id);
                m.salirSala(id);
            } catch (InterruptedException ex) {
                Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        
        }
    }
}
