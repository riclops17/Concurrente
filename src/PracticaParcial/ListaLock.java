/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaParcial;

import java.util.concurrent.locks.*;

/**
 *
 * @author ricardo
 */
public class ListaLock {
    private int id;
    private int nBuscadores;
    private boolean hayBuscador = false;
    private boolean hayBorrador = false;
    private boolean hayInsertor = false;
    private Lock llave;
    private Condition busc;
    private Condition ins;
    private Condition bor;
   
    public ListaLock ( int i){
        this.id = i;
        llave = new ReentrantLock();
        busc = llave.newCondition();
        ins = llave.newCondition();
        bor = llave.newCondition();
    }
    public  void empezarBuscar(int i) {
        llave.lock();
        try{
        while(hayBorrador){
            busc.await();
        }
        hayBuscador = true;
        nBuscadores++;
        System.out.println("el buscador "+i+" empezo a buscar");
        }catch (InterruptedException ex){          
                    
        }finally{
          llave.unlock();
        }
        
    }
    public  void TerminarBuscar(int i){
     
        
        System.out.println("el buscador "+i+" termino de buscar");
        nBuscadores--;
        if(nBuscadores == 0){
            hayBuscador = false;
            busc.signal();
        }
        
    }
    public  void  empezarInsertar(int i) {
        llave.lock();
        try{
            
        while(hayBorrador || hayInsertor){
            ins.await();
        }
        hayInsertor = true;
        System.out.println("el insertor "+i+ "empezo a insertar");
        }catch (InterruptedException ex){
            
        }finally{
            llave.unlock();
        }
        
    }
    public  void terminarInsertar(int i){
      
        hayInsertor = false;
        ins.signal();
        System.out.println("el insertor "+i+" termino de insertar");
        
    }
    public void empezarBorrar(int i) throws InterruptedException{
        llave.lock();
        try{
        while( hayBuscador || hayInsertor||hayBorrador){
            bor.await();
        }
        hayBorrador = true;
        System.out.println("el borrador "+i+ " empezo a borrar");
        }catch (InterruptedException ex){
            
        }finally{
            llave.unlock();
        }
    }
    public  void terminarBorrar(int i){
        
        System.out.println("el borrador "+i+" termino de borrar");
        hayBorrador = false;
        bor.signalAll();
        
    }
    
}
