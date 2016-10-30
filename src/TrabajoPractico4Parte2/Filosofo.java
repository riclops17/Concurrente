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
public class Filosofo  extends Thread{
    private int id;
    private Tenedor der ;
    private Tenedor izq;
    private Silla s;
    
    public Filosofo(int id1, Tenedor der1, Tenedor izq1, Silla s1){
        this.id = id1;
        this.der= der1;
        this.izq = izq1;
        this.s = s1;
    }
    @Override
    public void run(){
       while(true){
            try {
                s.ocuparSilla(id);
                izq.agarrarTenedor(id);
                der.agarrarTenedor(id);
                   // comer
                der.soltarTenedor(id);
                izq.soltarTenedor(id);
                s.dejarSilla(id);
            } catch (InterruptedException ex) {
                Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
    }
}
