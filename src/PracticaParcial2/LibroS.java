/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaParcial2;

import java.util.concurrent.Semaphore;

/**
 *
 * @author ricardo
 */
public class LibroS {
    private int nLectores = 0;
    private int nEscritores = 0;
    private Semaphore lec;
    private Semaphore esc;
    private Semaphore mutex;
    private Semaphore mutex2;
    
    public LibroS(){
        lec = new Semaphore(1);
        esc = new Semaphore(1);
        mutex = new Semaphore(1);
        mutex2 = new Semaphore(1);
    }
    public  void empezarLeer(int id) throws InterruptedException{
        lec.acquire();
        System.out.println("el lector"+id+"empezo a leer");
        mutex.acquire();
        
        nLectores++;
        if(nLectores == 1){
            
            esc.acquire();
        }
        mutex.release();
        lec.release();
        
    }
    public void terminarLeer(int id) throws InterruptedException{
       System.out.println("el lector "+id+ "termino de leer");
        mutex.acquire();
        nLectores--;
        if(nLectores == 0){
            
            esc.release();
        }
       
        mutex.release();
       
    }
    public  void empezarEscribir(int id) throws InterruptedException{
      
       System.out.println("el escritor"+id+"empezo de escribir");
        mutex2.acquire();
       
        nEscritores++;
        if( nEscritores == 1){
            lec.acquire();
        }
        mutex2.release();
        
        esc.acquire();
        
    }
    public void terminarEscribit(int id) throws InterruptedException{
        esc.release();
       System.out.println("el escritor"+id+"termino de escribir");
        mutex2.acquire();
        nEscritores--;
        if(nEscritores == 0){
         
            lec.release();
            
        }
    
        mutex2.release();
       
        
    }
}

