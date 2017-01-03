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
public class Taxi {
    private Semaphore bajar;
    private Semaphore espera;
    private Semaphore mutex;
    
    public Taxi() {
        bajar = new Semaphore(0);
        espera = new Semaphore(0);
        mutex = new Semaphore (1);
    }
    
    public void subirTaxi(int id) throws InterruptedException {
        mutex.acquire();
        System.out.println("Cliente "+id+" despierta al taxista");
    
          espera.release();
      
        
    }
    
    public void bajar(int id) throws InterruptedException {
        
        bajar.acquire();
        System.out.println("Cliente "+id+" baja del taxi");
        mutex.release();
    }
    
    public void esperarCliente() throws InterruptedException {
        espera.acquire();   // espero a que llegue un cliente
        System.out.println("Taxista se despierta");
    }
    
    public void viajar() throws InterruptedException {
        System.out.println("Estoy transportando al cliente");
        Thread.sleep(5000);
        bajar.release();    // otro cliente ahora puede entrar
    }
}


