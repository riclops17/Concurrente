/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico4Parte2;
import java.util.concurrent.Semaphore;
/**
 *
 * @author ricardo
 */
public class GestionaTraficoMejorado {
    private int id;
    private int nAutosNorte = 0;
    private int nAutosSur = 0;
    private boolean hayCocheNorte = false;
    private boolean hayCocheSur = false;
    private boolean sentidoN = false;
    private boolean sentidoS= false;
   
    
    public GestionaTraficoMejorado(int i){
        this.id = i;
    }
   public synchronized void EntrarCocheDelNorte(int i) throws InterruptedException{
        while(nAutosSur > 0 && nAutosNorte > 10 && sentidoN  ){
            this.wait();
        }
       
        nAutosNorte++;
        if(nAutosNorte == 10){
            sentidoN = false;
            sentidoS = true;
        }
        System.out.println("el auto del norte "+i+ "entro en el puente");
    }
    public synchronized void SalirCocheDelNorte(int i){
        System.out.println("el auto del norte "+i+ "salio del puente");
        nAutosNorte--;
        if(nAutosNorte == 0 ){
            
            this.notifyAll();
            sentidoS = false;
        }
    }
    public synchronized void EntrarCocheDelSur(int i) throws InterruptedException{
        
        while( nAutosNorte > 0 && nAutosSur > 10 && sentidoS){
            this.wait();
        }
        
        nAutosSur++;
        if(nAutosSur == 10){
            sentidoS = false;
        }
        System.out.println("el auto del sur "+i+" entro en el puente");
        
    }
    public synchronized void SalirCocheDelSur(int i){
        nAutosSur--;
        System.out.println("el auto del sur "+i+" salido del puente");
       
        if(nAutosSur== 0){
          sentidoN = true;  
         this.notifyAll();
         
         
        }
        
    }
    }
    

