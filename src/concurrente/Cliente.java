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
public class Cliente extends Thread {
    
public void run(){
     Recurso.uso();
   try {
 Thread.sleep(2000);
   }catch (InterruptedException e){
   };
};

}
