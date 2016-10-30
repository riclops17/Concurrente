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
public class Libro {
    private int nLectores = 0;
    private int nEscritores = 0;
    private boolean hayEscritor = false;
    
    
    public synchronized void empezarLeer(int id) throws InterruptedException{
        while(hayEscritor|| nEscritores > 0){
            this.wait();
        }
        nLectores++;
        System.out.println("el lector "+id+" empezo a leer");
    }
    public synchronized void terminarLeer(int id){
        System.out.println("el lector "+id+" termino de leer");
        nLectores--;
        if(nLectores == 0){
            this.notify();
        }
        
    }
    public synchronized void EmpezarEscribir(int id) throws InterruptedException{
        nEscritores++;
        while(hayEscritor  || nLectores > 0){
            this.wait();
        }
        hayEscritor = true;
        System.out.println("el escritor "+id+" empezo a escribir");
    }
    public synchronized void TerminarEscribir(int id){
        nEscritores--;
        System.out.println("el escritor "+id+" termino de escribir");
        hayEscritor = false;
        this.notifyAll();
    }
}
