/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RGR;

/**
 *
 * @author ricardo
 */
public class Numero extends Thread {
    private int ini;
    private int fin;
    private int[] arreglo;  
    private int buscado;
    
    public Numero(int ini, int fin, int[]vector, int buscado){
        this.ini=ini;
        this.fin=fin;
        this.arreglo = vector;
        this.buscado=buscado;
    }
    public void run(){
        for(int i=this.ini;i<=this.fin;i++){
            if(this.arreglo[i]== buscado){
                
            }
        }
    }
}





