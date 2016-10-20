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
public class Hamster extends Thread {
    private String nombre;
    private Jaula a;

    
  public Hamster(String nom, Jaula j){
       nombre = nom;
       a = j;
  
    }
  public String getNombre(){
      return this.nombre;
  }
  public void empezarComer(){
    
}
    public void run(){
         
   try{
          
            a.comer();
            Thread.sleep(1000);
            a.dormir();
            Thread.sleep(1000);
            a.rueda();
            Thread.sleep(1000);
           
        }catch(InterruptedException e){
            
        }
}
}
