/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaParcial;

import java.util.concurrent.Semaphore;

/**
 *
 * @author ricardo
 */
public class SillaF {
    private Semaphore s;
    
    public SillaF (){
        this.s = new Semaphore (4);
    }
    public   void tomarSilla(int id) throws InterruptedException{
        s.acquire();
        System.out.println("el cliente "+id+" ocupo la silla");
    }
    public   void DejarSilla(int id){
        System.out.println("el cliente "+id+" dejo la silla");
        s.release();
       
    }
}
