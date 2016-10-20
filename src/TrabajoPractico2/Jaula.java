/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico2;

/**
 *
 * @author ricardo
 */
public class Jaula {
    private String nom;
    public Jaula(String n){
        nom = n;
        
    }
    public static synchronized void comer(){
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+ " esta comiendo");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            
        }
    }
    public static synchronized void dormir(){
        Thread t = Thread.currentThread();
     System.out.println(t.getName()+ " esta durmiendo");
      try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            
        }
    }
     public static synchronized void rueda(){
        Thread t = Thread.currentThread();
     System.out.println(t.getName()+ " esta corriendo");
      try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            
        }
    }
}
