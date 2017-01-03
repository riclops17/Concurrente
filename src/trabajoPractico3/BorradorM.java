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
public class BorradorM extends Thread{
    private int id;
    private ListaMonitor l;
    
    public BorradorM(int i,ListaMonitor l1 ){
        this.id = i;
        this.l = l1;
    }
    public void run(){
        try {
           l.empezarBorrar(id);
           l.terminarBorrar(id);
          
        } catch (InterruptedException ex) {
            
        }
    } 
}
