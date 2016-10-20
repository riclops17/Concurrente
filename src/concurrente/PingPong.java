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
public class PingPong extends Thread{
 private String pal; // Lo que va a escribir.
 private int delay; // Tiempo entre escritura
 public PingPong(String cartel,int cantMs){
 pal = cartel;
 delay = cantMs;
 };
 public void run(){ //sobrescribe run()de Thread
 while(true){
 System.out.println(pal+ " ");
// try{Thread.sleep(delay);}
 //catch(InterruptedException e){
 }
 }
 } //fin método run()
  //fin clase PingPong

