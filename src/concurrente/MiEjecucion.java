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
public class MiEjecucion  implements Runnable{
     public void run(){
              ir();
               }
     public void ir(){
        hacerMas();
      }
      public void hacerMas(){
       System.out.println("En la pila");
  }
}

