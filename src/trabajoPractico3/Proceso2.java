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
public class Proceso2 extends Thread {
    private Semaphore sem2;
    private Semaphore sem3;
     public Proceso2(Semaphore s2,Semaphore s3){
        sem2 = s2;
        sem3 = s3;
               
    }
    public void run(){
        try{
            sem3.acquire();   
            }catch( InterruptedException e){
                System.out.println("proceso interrumpido");
        }
        System.out.println("P2");
          sem2.release();
        }
        
    }
