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
public class Barberia  extends Thread{
        private int nSillasEspera;
	private int nSillasEsperaOcupadas = 0;
	private boolean sillaBarberoOcupada = false;
	private boolean finCorte = false;
	private boolean barberoDormido = false;
        
  public Barberia(int nSillasEspera) {
   this.nSillasEspera = nSillasEspera;
  }
   public synchronized boolean entrar(int id) throws InterruptedException {
       if (nSillasEsperaOcupadas == nSillasEspera) {
    // Si no hay sillas libres, me voy sin cortar el pelo
     System.out.println(" El cliente " + id + " se va sin cortarse el pelo");
     return false;
     }else{
        //Me quedo esperando si la silla del barbero está ocupada
	nSillasEsperaOcupadas ++;
        if(sillaBarberoOcupada){
        System.out.println("El cliente " + id + " se sienta en la silla de espera");
        }
        while (sillaBarberoOcupada){
            wait();
        }
        //Desocupo la silla de espera 
         nSillasEsperaOcupadas --;
         //Me siento en la silla del barbero 
         sillaBarberoOcupada = true;
         finCorte = false;
         //Si el barbero está dormido le despierto
         if (barberoDormido) {
         System.out.println (" El cliente " + id + " despierta al barbero");
	    notifyAll();}
        //Espero a que me corte el pelo
        System.out.println("El cliente " + id + " en la silla de barbero");
        while (!finCorte) {
            wait();
        }
         sillaBarberoOcupada = false;
         //Que pase el siguiente
         notifyAll();
          System.out.println("El cliente " + id + " se va con el pelo cortado");
	  return true;
       }
   }
   public synchronized void esperarCliente()throws InterruptedException {
     //El barbero espera a que llegue un cliente
     //Se supone que le corta el pelo fuera del monitor
     barberoDormido = true;
     while(!sillaBarberoOcupada || finCorte) {
     System.out.println("Barbero esperando cliente");
	wait();
	}
       barberoDormido = false;		   
       System.out.println("Barbero cortando el pelo");
   }
    public synchronized void acabarCorte(){
      finCorte = true;
      System.out.println(" Barbero termina de cortar el pelo");
      notifyAll();
    }
	  
	
}

