/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPractico3;
import java.util.concurrent.Semaphore;
/**
 *
 * @author ricardo
 */
public class Proceso4 extends Thread {
    private Semaphore sem4;
    public Proceso4(Semaphore s4){
        sem4 = s4;
        
    }
     public void run(){
        try{
            sem4.acquire();   
            }catch( InterruptedException e){
                System.out.println("proceso interrumpido");
        }
        System.out.println("P4");
        }
}
