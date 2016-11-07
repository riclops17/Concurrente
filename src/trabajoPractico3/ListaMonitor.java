/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPractico3;

/**
 *
 * @author ricardo
 */
public class ListaMonitor {
    private int id;
    private int nBuscadores;
    private boolean hayBorrador = false;
    private boolean hayBuscador = false;
    private boolean hayInsertor = false;
    
    public ListaMonitor(int i){
        this.id = i;
    }
    public synchronized void empezarBuscar(int i) throws InterruptedException{
        while(hayBorrador){
            this.wait();
        }
        hayBuscador = true;
        nBuscadores++;
        System.out.println("el buscador "+i+" empezo a buscar");
    }
    public synchronized void TerminarBuscar(int i){
        System.out.println("el buscador "+i+" termino de buscar");
        nBuscadores--;
        if(nBuscadores == 0){
            hayBuscador = false;
            this.notify();
        }
    }
    public synchronized void  empezarInsertar(int i) throws InterruptedException{
        while(hayBorrador || hayInsertor){
            this.wait();
        }
        hayInsertor = true;
        System.out.println("el insertor "+i+ "empezo a insertar");
    }
    public synchronized void terminarInsertar(int i){
        hayInsertor = false;
        this.notify();
        System.out.println("el insertor "+i+" termino de insertar");
    }
    public synchronized void empezarBorrar(int i) throws InterruptedException{
        while( hayBuscador || hayInsertor||hayBorrador){
            this.wait();
        }
        hayBorrador = true;
        System.out.println("el borrador "+i+ " empezo a borrar");
    }
    public synchronized void terminarBorrar(int i){
        System.out.println("el borrador "+i+" termino de borrar");
        hayBorrador = false;
        this.notifyAll();
    }
}
