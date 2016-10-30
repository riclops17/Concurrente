/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ricardo
 */
public class Fumador extends Thread{

    private int id;
    private Mesa m;
    
    public Fumador(int id1, Mesa m1){
        this.id = id1;
        this.m = m1;
    }
    public void run(){
        while(true){
            try {
                m.empezarfumar(id);
                Thread.sleep(300);
                m.terminarFumar(id);
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                Logger.getLogger(Fumador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
        
    }

