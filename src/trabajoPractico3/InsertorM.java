/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPractico3;

/**
 *
 * @author ricardo
 */
public class InsertorM extends Thread{
   private int id;
   private ListaMonitor l;
    
    public InsertorM(int i, ListaMonitor l1 ){
        this.id = i;
        this.l = l1;
    }
    public void run(){
        try {
            l.empezarInsertar(id);
            l.terminarInsertar(id);
          
        } catch (InterruptedException ex) {
            
        }
    } 
}
