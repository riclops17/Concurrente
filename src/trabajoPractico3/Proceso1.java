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
public class Proceso1  extends Thread{
    private Semaphore sem1;
    private Semaphore sem2;
     public Proceso1(Semaphore s1,Semaphore s2){
        sem1 = s1;
        sem2 = s2;
    }
    public void run(){
        try{
            sem2.acquire();   
            }catch( InterruptedException e){
                System.out.println("proceso interrumpido");
        }
        System.out.println("P1");
          sem1.release();
        }
        
    }
        

