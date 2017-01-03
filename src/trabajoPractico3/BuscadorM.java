/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPractico3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ricardo
 */
public class BuscadorM extends Thread {
    private int id;
    private ListaMonitor l;
    
    public BuscadorM(int i,ListaMonitor l1 ){
        this.id = i;
        this.l = l1;
    }
    public void run(){
        try {
            l.empezarBuscar(id);
            l.TerminarBuscar(id);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuscadorM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
