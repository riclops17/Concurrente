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
public class Barberia {
    private Semaphore bajar;
    private Semaphore espera;
    private Semaphore mutex;
    
    public Barberia() {
        bajar = new Semaphore(0);
        espera = new Semaphore(0);
        mutex = new Semaphore (1);
    }
    
    public void entrarBarberia(int id) throws InterruptedException {
        mutex.acquire();
        System.out.println("Cliente "+id+" despierta al barbero");
        espera.release();
    }
    
    public void SalirBarberia(int id) throws InterruptedException {
        bajar.acquire();
        System.out.println("Cliente "+id+"salio de la barberia");
        mutex.release();
    }
    
    public void esperarCliente() throws InterruptedException {
        espera.acquire();   // espero a que llegue un cliente
        System.out.println("Barbero se despierta");
    }
    
    public void CortarPelo() throws InterruptedException {
        System.out.println("Barbero cortando el pelo al cliente");
        Thread.sleep(5000);
        bajar.release();    // otro cliente ahora puede entrar
    }
}

