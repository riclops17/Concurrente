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
public class Cliente extends Thread{
 private Barberia laBarberia;
 private int clienteId;
 private boolean cortePelo = false;
	
 public Cliente(Barberia laBarberia, int id){
    this.laBarberia = laBarberia;
   this.clienteId  = id;
	}
 public void run(){
		
while (true) {
		
try{
   Thread.sleep(2000);
	cortePelo = laBarberia.entrar(clienteId);
	//Cortar pelo
	if (cortePelo){
     //Espero hasta que me crezca el pelo
      Thread.sleep(25000);
     } else {
  //Espero y lo vuelvo a intentar
   Thread.sleep(4000);
}
} catch (InterruptedException e){};
 }
 }
}
