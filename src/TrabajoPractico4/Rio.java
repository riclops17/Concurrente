/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico4;
import java.util.concurrent.Semaphore;
/**
 *
 * @author ricardo
 */
public class Rio {
 
    private Semaphore sem,semLo,semCo;
    private int cantLo,cantCo;
    private boolean vivo;

    public Rio(Semaphore sem, Semaphore semLo, Semaphore semCo) {
        this.sem = sem;
        this.semLo = semLo;
        this.semCo = semCo;
        cantLo = 0;
        cantCo = 0;
        vivo = true;
    }

    
    public boolean isVivo() throws InterruptedException {
        sem.acquire();
        boolean qOnda= vivo;
        sem.release();
        return qOnda;
    }    
        /*if(!vivo){
            vivo=true;
            qOnda=false;
            semCo.release(1);
        }        
            sem.release();
        return qOnda;
        */
        
    
    
    
    
     public void loboEntra(String nombre) throws InterruptedException{
         sem.acquire();
         //semLo.acquire(1);
         this.cantLo++;
         System.out.println("Lobo "+nombre+" entrando");
         sem.release();
     }
     public void loboSale(String nombre) throws InterruptedException{
         sem.acquire();
         this.cantLo--;
         if (cantLo == 0 )
              //semCo.release(1);
         System.out.println("Lobo "+nombre+" Saliendo");
         sem.release();
     }
     public void corderoEntra(String nombre) throws InterruptedException{
         sem.acquire();
         if(cantCo==0 && cantLo > 0){
             //sem.release();
            // semCo.acquire();
             //sem.acquire();
             vivo=false;
         }else{
         System.out.println("Cordero "+nombre+" entra");
         this.cantCo++;
         vivo=true;
         }
         sem.release();
         }
     
     public void corderoSale(String nombre) throws InterruptedException{
         sem.acquire();
         this.cantCo--;
         //this.semCo.release();
         
         System.out.println("Cordero "+nombre+" Saliendo");
         sem.release();
     }
     
     public boolean comer(String nombre) throws InterruptedException{
         boolean retor=false;
         sem.acquire();
         if(cantCo==1 ){
             System.out.println("El lobo "+nombre+" acechando....");
             System.out.println("El lobo "+nombre+" atacando rggggg O:");
             System.out.println("El lobo "+nombre+" comiendo carne D:");
             System.out.println("El lobo "+nombre+" se comio un cordero :(");
             cantCo--;
             vivo = false;
             //semCo.release();
             retor=true;
           }
         sem.release();
         return retor;
     }
}

