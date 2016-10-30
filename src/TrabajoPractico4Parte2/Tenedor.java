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
public class Tenedor {
  private int id;
  private boolean libre = true;
  
  public Tenedor (int id1){
      this.id = id1;
  }
  public synchronized void agarrarTenedor ( int i) throws InterruptedException{
      while(!libre){
          this.wait();
      }
      System.out.println("el filosofo " +i+"tiene el tenedor"+id);
      libre = false;
  }
  public synchronized void soltarTenedor( int i) throws InterruptedException{
      libre = true;
       System.out.println(" el filosofo "+i+ "solto el tenedor"+id);
       this.notify();
  }
}
