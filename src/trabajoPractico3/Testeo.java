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
public class Testeo {

    public static void main(String[] args) {
        Lista l1 = new Lista();
        l1.insertar(1, 1);
        l1.insertar(2, 2);
        l1.insertar(3, 3);
        l1.insertar(4, 4);
        System.out.println(l1.toString());
        
        Semaphore sem1 = new Semaphore(1);
        Semaphore sem2 = new Semaphore(1);
        Semaphore sem3 = new Semaphore(1);
        Buscador bus1 = new Buscador("buscador1", sem1, sem2, sem3, l1);
        Buscador bus2 = new Buscador("buscador2", sem1, sem2, sem3, l1);
        Insertor ins1 = new Insertor("insertor1", sem1, sem2, sem3, l1);
        Insertor ins2 = new Insertor("insertor2", sem1, sem2, sem3, l1);
        Borrador bor = new Borrador("borrador1", sem1, sem2, sem3, l1);
        bus1.start();
        bus2.start();
        ins1.start();
        ins2.start();
        bor.start();
     
    }
}
