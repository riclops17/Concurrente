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
public class Buscador extends Thread{
    private String nombre;
    private Lista l1;
    private Semaphore sem1;
    private Semaphore sem2;
    private Semaphore sem3;
    
    public Buscador(String n, Semaphore s1,Semaphore s2 ,Semaphore s3,Lista l){
        this.nombre = n;
        this.sem1 = s1;
        this.sem2 = s2;
        this.sem3 = s3;
        this.l1 = l;
    }
   
    public void run(){
       try{
            this.l1.empezarBuscar();
            //Thread.sleep(1000);
            this.l1.buscar();
            this.l1.terminarBuscar();
       
        }catch(InterruptedException ex){
            
        }
    
    }
}

