/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico4;
import TrabajoPractico4.ColaInt;
/**
 *
 * @author ricardo
 */
public class Buffer {
 private ColaInt datos;
 public Buffer (){
    
}
 
 public synchronized int sacar() throws InterruptedException{
     while (datos.esVacia()){
         this.wait();
     }
     datos.obtenerFrente();
     this.notifyAll();
     return(datos.obtenerFrente());
 }
 public Synchronized void agregar(int a ){
       datos.poner(a);
       this.notifyAll();
 }
}
