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
public class Barbero extends Thread {
    private Barberia laBarberia;
	public Barbero(Barberia laBarberia) {
       this.laBarberia = laBarberia;
	}
	
	public void run(){	
	while (true) {
        try {
	laBarberia.esperarCliente();
        //Cortar pelo
	Thread.sleep(2000);
	laBarberia.acabarCorte();
	//Decansa un poco
        Thread.sleep(1000);
        } catch (InterruptedException e){};
	}

	}
}
