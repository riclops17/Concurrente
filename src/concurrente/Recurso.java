/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrente;

/**
 *
 * @author ricardo
 */
public class Recurso {
    static synchronized void uso(){
   Thread t=Thread.currentThread();
   System.out.println("Soy "+t.getName());
}
}
