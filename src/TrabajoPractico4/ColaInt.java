/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico4;

/**
 *
 * @author ricardo
 */
public class ColaInt {
    private static final int tam = 30;
    private  int [] cola;
    private  int frente ;
    private  int fin ;
    
    public ColaInt(){
        this.cola = new int[tam];
        this.fin=0;
        this.frente=0;
       
    }
    public boolean poner(int elem){
        boolean res;
        if(this.frente == (this.fin +1)% this.tam){
            res = false;
            
        }else{
            this.cola[fin]= elem;
            this.fin = (this.fin +1) % tam;
            
            res = true;
        }
        return res;
        
        
    }
    public boolean esVacia(){
        return this.frente == this.fin;
    }
    public void vaciar(){
        this.fin = this.frente;
                 
    }
    public boolean sacar(){
        boolean exito  = true;
        if (this.esVacia()){
            exito = false;
        }else{
            this.frente = (this.frente+1)%this.tam;
        }
        return exito;
    }
    public int obtenerFrente(){
        return this.cola[frente];
    }
    public String toString(){
        String s ,c;
        s = "";
        c = "";
        int i = this.frente;
        if(i!= this.fin){
            i = i % cola.length;
            s = Integer.toString(this.cola[i]);
            c = c +""+ s;
            
        }
        return c;
        
        }
    public ColaInt clonar(){
         ColaInt copia = new ColaInt();
        copia.frente= this.frente;
        copia.fin = this.fin;
        copia.cola = this.cola.clone();
        return copia;
    }
    }


