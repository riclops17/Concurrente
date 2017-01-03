/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaParcial;

/**
 *
 * @author ricardo
 */
public class MonitorMuseo {
    private int cantPersonas;
    private int cantJubilado;
   
    private int x = 5 ;
    
    public synchronized void entrarSala(int id) throws InterruptedException{
        while(  cantJubilado > 0 || cantPersonas > x){
            this.wait();
        }
        
        cantPersonas++;
        System.out.println("entro la persona"+id);
    }
    public synchronized void entrarJubilado(int id) throws InterruptedException{
        cantJubilado++;
        while(cantPersonas > x){
            this.wait();
        }
        cantJubilado--;
        cantPersonas++;
       
        System.out.println("el jubilado"+id+"entro al museo");
    }
    public synchronized void salirSala(int id){
        System.out.println(+id+"salio del museo");
        cantPersonas--;
       
        this.notifyAll();
    }
    public synchronized void notificarTemperatura( int t){
        if(t > 30){
            this.x = 35;
        }else{
            this.x = 50;
        }
        
    }
    
    
}
