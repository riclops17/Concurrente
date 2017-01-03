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
public class GestionaTrafico {
    private int id;
    private int nAutosNorte = 0;
    private int nAutosSur = 0;
    private boolean hayCocheNorte = false;
    private boolean hayCocheSur = false;
    
    
    public GestionaTrafico(int i){
        this.id = i;
    }
    public synchronized void EntrarCocheDelNorte(int i) throws InterruptedException{
        while(nAutosSur > 0 ){
            this.wait();
        }
       
        nAutosNorte++;
       
        
        System.out.println("el auto del norte "+i+ "entro en el puente");
    }
    public synchronized void SalirCocheDelNorte(int i){
        System.out.println("el auto del norte "+i+ "salio del puente");
        nAutosNorte--;
        if(nAutosNorte == 0){
           
            this.notifyAll();
        }
    }
    public synchronized void EntrarCocheDelSur(int i) throws InterruptedException{
        
        while( nAutosNorte > 0 ){
            this.wait();
        }
        
        nAutosSur++;
       
        System.out.println("el auto del sur "+i+" entro en el puente");
        
    }
    public synchronized void SalirCocheDelSur(int i){
        nAutosSur--;
        System.out.println("el auto del sur "+i+" salido del puente");
       
        if(nAutosSur== 0){
          
         this.notifyAll();
         
        }
        
    }
    
}
