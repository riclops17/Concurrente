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
public class TestBarberia {
    public static void main(String[] args) {
     int nSillas     = 4;
       int nClientes   = 10;
		Barberia  laBarberia  = new Barberia(nSillas);
		Barbero   elBarbero   = new Barbero(laBarberia);
		Cliente[] losClientes = new Cliente[10];
		
		elBarbero.start();
		
		for (int i = 0; i < nClientes; i++ ) {
			losClientes[i] = new Cliente(laBarberia, i);
			losClientes[i].start();
		}
	}
}
