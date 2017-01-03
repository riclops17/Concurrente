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
public class GestionTraficoSemaforos {
    private int nAutosNorte = 0;
    private int nAutosSur = 0;
    private Semaphore semN;
    private Semaphore semS;
    private Semaphore mutex;
    private Semaphore mutex2;
    
    public GestionTraficoSemaforos(){
        this.semN = new Semaphore (1);
        this.semS = new Semaphore(1);
        this.mutex = new Semaphore(1);
        this.mutex2 = new Semaphore (1);
    }
    public  void entrarCocheNorte(int id) throws InterruptedException{
        
       semN.acquire();
       mutex.acquire();
       nAutosNorte++;
       if(nAutosNorte == 1){
           semS.acquire();
       }
       mutex.release();
       semN.release();
       System.out.println("el auto del norte "+id+ "entro en el puente");
    }
    public  void salirCocheNorte(int id) throws InterruptedException{
        System.out.println("el auto del norte "+id+ "salio del puente");
        mutex.acquire();
        nAutosNorte--;
        if(nAutosNorte == 0){
            semS.release();
        }
        mutex.release();
    }
    public  void entrarCocheSur(int id) throws InterruptedException{
       semS.acquire();
       mutex2.acquire();
       nAutosSur++;
       if(nAutosSur == 1){
           semN.acquire();
       }
       mutex2.release();
       semS.release();
       System.out.println("el auto del sur "+id+ "entro en el puente");
    }
    public  void salirCocheSur(int id) throws InterruptedException{
          System.out.println("el auto del norte "+id+ "salio del puente");
        mutex2.acquire();
        nAutosSur--;
        if(nAutosSur == 0){
            semN.release();
        }
        mutex2.release();
    }
    
}
