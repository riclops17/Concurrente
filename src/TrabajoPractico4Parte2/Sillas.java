/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico4Parte2;

/**
 *
 * @author ricardo
 */
public class Sillas extends Thread{
    private int nSillas;
    private boolean sillaBarbero;
    private int clientesEsperando;
    
    public Sillas ( int n){
        nSillas = n;
        sillaBarbero = false;
        clientesEsperando = 0;
        
    }
    public synchronized void cortarPelo() throws InterruptedException{
        sillaBarbero = true;
        clientesEsperando--;
        //cortando el pelo
        Thread.sleep(1000);
        sillaBarbero = false;
    }
    public int getClientes(){
        return this.clientesEsperando;
    }
    public void setOcupada(boolean s){
        sillaBarbero = s;
    }
    public boolean getSillaBarbero(){
        return this.sillaBarbero;
    }
}
