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
public class Proceso3  extends Thread{
    private Semaphore sem1;
    private Semaphore sem3;
    private Semaphore sem4;
    public Proceso3(Semaphore s1,Semaphore s3,Semaphore s4){
        sem1 = s1;
        sem3 = s3;
        sem4 = s4;
    }
     public void run(){
        try{
            sem1.acquire();   
            }catch( InterruptedException e){
                System.out.println("proceso interrumpido");
        }
        System.out.println("P3");
          sem3.release();
          sem4.release();
        }
        
    }

