/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaParcial2;

import java.util.concurrent.Semaphore;

/**
 *
 * @author ricardo
 */
public class ListaSemaforo {
    private int nBuscadores;
    private int nInsertores;
    private int nBorradores;
    private Semaphore busc;
    private Semaphore ins;
    private Semaphore bor;
    private Semaphore mutex;
    private Semaphore mutex2;
    private Semaphore mutex3;
    
    public ListaSemaforo(){
        this.busc = new Semaphore(1);
        this.ins  = new Semaphore(1);
        this.bor = new Semaphore(1);
        this.mutex =  new Semaphore(1);
        this.mutex2 =  new Semaphore(1);
        this.mutex3 =  new Semaphore(1);
    }
    public void empezarBuscar() throws InterruptedException{
        busc.acquire();
        mutex.acquire();
        nBuscadores++;
        if(nBuscadores == 1){
            bor.acquire();
        }
        mutex.release();
        busc.release();
        
        
    }
    public void terminarBuscar() throws InterruptedException{
        
        mutex.acquire();
        nBuscadores--;
        if(nBuscadores == 0 && nInsertores == 0){
            bor.release();
        }
        mutex.release();
        
    }
    public void empezarInsertar() throws InterruptedException{
        mutex2.acquire();
        nInsertores++;
        if( nInsertores == 1){
            bor.acquire();
        }
        mutex2.release();
        ins.acquire();
    }
    public void terminarInsertar() throws InterruptedException{
        ins.release();
        mutex2.acquire();
        nInsertores--;
        if(nInsertores == 0 && nBuscadores == 0){
            bor.release();
        }
        mutex2.release();
    }
    public void empezarBorrar() throws InterruptedException{
        mutex3.acquire();
        nBorradores++;
        if(nBorradores  == 1){
            busc.acquire();
            ins.acquire();
        }
        mutex.release();
        bor.acquire();
    }
    public void terminarBorrar() throws InterruptedException{
        bor.release();
        mutex3.acquire();
        nBorradores--;
        if(nBorradores == 0){
            busc.release();
            ins.release();
        }
        mutex3.release();
    }
}
