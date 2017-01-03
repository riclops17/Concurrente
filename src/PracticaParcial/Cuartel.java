/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaParcial;
import java.util.concurrent.Semaphore;
/**
 *
 * @author ricardo
 */
public class Cuartel {
    private Semaphore recinto;
    private Semaphore abridor;
    private Semaphore bandeja;
    private Semaphore postre;
    private int eleccion;
    
    public Cuartel(int a){
        this.recinto = new Semaphore (100);
        this.abridor = new Semaphore (10);
        this.bandeja = new Semaphore (5);
        this.postre = new Semaphore (3);
        this.eleccion = a;
    }
    public void EntrarComedor(int id) throws InterruptedException{
        recinto.acquire();
        System.out.println("el soldado"+id+ "entro al comedor");
    }
    public void agarrarAbridor(int id) throws InterruptedException{
        abridor.acquire();
        System.out.println("el soldado "+id+"esta usando el abridor");
        Thread.sleep(2000);
    }
    public void DejarAbridor(int id){
        System.out.println("el soldado "+id+"dejo el abridor");
        abridor.release();
    }
    public void agarrarPostre(int id) throws InterruptedException{
        postre.acquire();
        System.out.println("el soldado "+id+ " agarro el postre");
        Thread.sleep(2000);
        
    }
    public void DejarPostre(int id){
        System.out.println("el soldado "+id+"dejo el postre");
        postre.release();
    }
    public void EmpezarAcomer(int id) throws InterruptedException{
        bandeja.acquire();
        System.out.println("el soldado "+id+"agarro una bandeja");
                
        if(this.eleccion == 2){
            this.agarrarAbridor(id);
            Thread.sleep(50);
            this.DejarAbridor(id);
        }
        this.agarrarPostre(id);
        Thread.sleep(2000);
    }
    public void TerminarDeComer(int id){
        
        this.DejarPostre(id);
        System.out.println("el soldado "+id+"dejo la bandeja");
        bandeja.release();
    }
    public void SalirComedor(int id){
        System.out.println("el soldado"+id+"salio del cuartel");
        recinto.release();
    }
}
