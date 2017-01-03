/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico4Parte2;

/**
 *
 * @author ricardo
 */
public class Transbordador {
   private int id;
   private int nAutos;
   
   public Transbordador(int id1){
       this.id= id1;
   }
   
   public synchronized void entrar(int i) throws InterruptedException{
       while( nAutos  > 9){
           this.wait();
       }
       nAutos++;
       System.out.println("el auto: "+i+"entro al transbordador");
       if(nAutos == 10){
           System.out.println("el transportador viajo");
           this.notifyAll();
       }
   }
   public synchronized void salir( int i) throws InterruptedException{
       while(nAutos < 0){
           this.wait();
       }
       System.out.println("el auto: "+i+ "salio del transbordador");
       nAutos--;
       if(nAutos == 0){
           System.out.println("el tranbordador llego");
          this.notifyAll();  
       }
      
   }
}
