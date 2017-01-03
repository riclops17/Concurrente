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
public class Taxista extends Thread{
    private Taxi unTaxi;

    public Taxista(Taxi t) {
        unTaxi = t;
    }
 public void run(){
     while(true){
         
         try {
             unTaxi.esperarCliente();
             unTaxi.viajar();
         } catch (InterruptedException ex) {
             Logger.getLogger(Taxista.class.getName()).log(Level.SEVERE, null, ex);
         }
               
     }
 }
}
