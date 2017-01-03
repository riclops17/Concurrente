/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaParcial;

/**
 *
 * @author ricardo
 */
public class Silla {
    private int  sLibre = 3;
    
    public synchronized void ocuparSilla(int i) throws InterruptedException{
        while(sLibre == 0){
            this.wait();
        }
        System.out.println("el cliente "+i+" ocupo la silla");
        sLibre--;
    }
    public synchronized void dejarSilla(int i)throws InterruptedException{
        sLibre++;
        System.out.println("el cliente "+i+" dejo la silla");
        this.notify();
    }
}

