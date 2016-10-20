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
public class ejercicio1  {
    public static void main(String[] args) {
        Thread hilo1= new letras('A');
        Thread hilo2 = new letras ('B');
        Thread hilo3 = new letras ('C');
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
    
}
class Turno{
     public synchronized void turno(letras a){
         if(a.getOrden() == 1){
             System.out.println("A");
             
         }
         if(a.getOrden() == 2){
             System.out.println("B");
         }
         if ( a.getOrden() == 3){
             System.out.println("c");
         }
    }
}

 class letras extends Thread{
    private char letra;
    private int orden;
   
     
   public letras(char l , int or ){
       letra = l;
       orden = or;
       
   }
   public int getOrden(){
       return this.orden;
   }
   public void run(){
       imprimirLetra();
       }
  
public void imprimirLetra(){
    System.out.print(letra);
}
 }
