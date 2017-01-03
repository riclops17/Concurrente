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
public class MonitorSemaf {
    int permisos;
    
    
    public MonitorSemaf (int n1){
        this.permisos = n1;
    }
    public synchronized void  adquirir() throws InterruptedException{
        while(permisos <= 0){
            this.wait();
        }
        permisos--;
        
    }
    public synchronized void liberar(){
        permisos++;
        this.notifyAll();
    }
    public synchronized boolean tryAdquire(){
        boolean res = false;
        if(permisos > 0){
            res = true;
            permisos--;
        }
      return res;  
    }
    public synchronized void adquirirN(int n) throws InterruptedException{
        while (permisos < n){
            this.wait();
        }
        permisos -=  n;
        
    }
    public synchronized void liberarN(int n){
        permisos = permisos + n;
        this.notifyAll();
    }
    
    
    
}
