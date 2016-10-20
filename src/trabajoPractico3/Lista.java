/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPractico3;

import java.util.concurrent.Semaphore;

/**
 *
 * @author ricardo
 */
public class Lista extends Thread{

    private NodoInt cabecera;
    private int longitud;
    private int nBuscadores;
    private int nInsertores;
    private int nBorradores;
    private Semaphore sem1;
    private Semaphore sem2;
    private Semaphore sem3;
    private Semaphore mutex1;
    private Semaphore mutex2;
    
   
    public Lista() {
        this.cabecera = null;
        this.longitud = 0;
    }

    public int longitud() {
        return this.longitud;
    }

    public boolean insertar(int elem, int pos) {
        // insertar el elemento nuevo en la posicion pos
        // detecta y reporat error en posicion invalida
        boolean exito = true;
        if (pos < 1 || pos > this.longitud + 1) {
            exito = false;
        } else if (pos == 1) {
            // crea un nuevo nodo y se enlaza en la cabecera
            this.cabecera = new NodoInt(elem, null);
            this.longitud++;

        } else {
            //avanza hasta el elemento en posicion pos -1
            NodoInt aux = this.cabecera;
            int i = 1;
            while (i < pos - 1) {
                aux = aux.getEnlace();
                i++;
            }
            // crea el nodo y lo enlaza
            NodoInt nuevo = new NodoInt(elem, aux.getEnlace());
            aux.setEnlace(nuevo);
            this.longitud++;
        }
        // nunca hay error de lista llena , entonces devuelve true
        return exito;
    }

    public boolean esVacia() {
        return this.cabecera == null;
    }

    public void vaciar() {
        this.cabecera = null;
    }

    public boolean eliminar(int pos) {
        boolean res = true;
        if (esVacia() || pos > this.longitud || pos <= 0) {
            res = false;
        } else {
            if (pos == 1) {
                this.cabecera = this.cabecera.getEnlace();

            } else {
                NodoInt aux = this.cabecera;
                int i = 1;
                while (i < pos - 1) {
                    aux = aux.getEnlace();
                    i++;
                }
                if (this.longitud != pos) {
                    aux.setEnlace(aux.getEnlace().getEnlace());

                } else {
                    aux.setEnlace(null);
                }

            }
            this.longitud--;
        }
        return res;
    }

    public String toString() {
        String s = "";
        int i;
        NodoInt aux = this.cabecera;
        for (i = 1; i <= this.longitud; i++) {
            s += aux.getElem() + ", ";
            aux = aux.getEnlace();
        }
        return s;
    }
    
public int localizar(int elem) {
        int pos = -1;
        int i = 1;
        boolean exito = false;
        NodoInt aux = this.cabecera;
        while (i <= this.longitud && !exito) {
            if (elem == aux.getElem()) {
                pos = i;
                exito = true;
            }
            aux = aux.getEnlace();
            i++;
        }
        return pos;

    }
public void empezarBuscar(){
    try{
           mutex1.acquire();
           nBuscadores++;
           if(nBuscadores == 1){
               sem3.acquire();
           }
    }catch (InterruptedException ex){
        
    }
    mutex1.release();
    sem1.release();
}
public void empezarBorrar(){
    try{
           sem3.acquire();
           
    }catch (InterruptedException ex){
        
    }
    
}
public void terminarBorrar(){
    sem3.release();
}
public void empezarInsertar() throws InterruptedException{
    
           sem2.acquire();
           
}
public void terminarInsertar(){
    sem2.release();
}

public void terminarBuscar(){
   try{
       mutex1.acquire();
       nBuscadores--;
       if(nBuscadores == 0){
           sem3.release();
       }
   }catch (InterruptedException ex){
      
   }
   mutex1.release();
    
}
public void buscar()throws InterruptedException{
    
    System.out.println("el elemento se encuentra en ");
   
    
}
public void borrar()throws InterruptedException{
 
    System.out.println("elemento borrado");
}
public void insertar() throws InterruptedException{
   
    System.out.println("el elemento se inserto");
  
}
}
