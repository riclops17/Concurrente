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
public class TestearPingPong {
    public static void main(String[] args){
 // 2 threads
 PingPong t1 =new PingPong("PING",33);
 PingPong t2= new PingPong("PONG",10);
 // Activación
 t1.start(); t2.start();
 // Espera 2 segundos
 try{ Thread.sleep(5000);
 }catch (InterruptedException e){
 }
 
 // Finaliza la ejecución de los threads

 }
}
