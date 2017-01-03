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
public class Transbordador {
    //private ArrayList<Auto> transbordador= new ArrayList();
    private Semaphore permisoViajar;//controla la subida de los autos al transbordador
    private Semaphore bajar;//controla la bajada de los autos del transbordador
    private int cont=0;//controlo que no sean mas de 10 los autos que suben al transbordador
    
    public Transbordador(Semaphore unSem, Semaphore lleno){
        this.permisoViajar= unSem;
        this.bajar= lleno;
    }
    
    public void subir(int id){
        try{
            permisoViajar.acquire();//si hay lugar disponible en el transbordador entra
                this.cont++;
                System.out.println("Auto "+id+" ingresando al transbordador");
                try{
                    Thread.sleep(2000);//simulo que se acomoda el auto en el transbordador
                }catch(Exception e){
                    System.err.println("simulacion ingreso transbordador "+e.getMessage());
                }           
                if(this.cont<10){
                    this.permisoViajar.release();//una vez que ya se acomodo el auto, libera el permiso para darle el acceso a otro                                        
                    this.bajar.acquire();//se bloquea hasta que no llegue el barco a la otra orilla
                    bajar(id);
                }else{
                    //if(this.cont==10){
                     sarpar(id);                           
                    //}
                }
        }catch(Exception e){
            System.err.println("ir "+e.getMessage());
        }
    }
    
    public synchronized void sarpar(int id){
        try{
            System.out.println("Transbordador en viaje....");
            this.wait(5000);//simula el viaje de ida del barco el ultimo hilo que entro
        }catch(Exception e){
                System.err.println("sarpar "+e.getMessage());
        }
        System.out.println("LLega el transbordador a la orilla oeste");
        bajar(id);//el ultimo en subir, es el primero en bajar, y habilita al resto de los autos a que empiecen a bajar
    }
    
    public void bajar(int id){
        this.cont--;
        System.out.println("Bajando Auto "+id+" del transbordador");
        try{
            Thread.sleep(2000);//simulo que desciende el auto del transbordador
        }catch(Exception e){
            System.err.println("simulacion bajada transbordador "+e.getMessage());
        }
        if(this.cont>0){
            this.bajar.release();//empieza a liberar a los autos que quedaron bloqueados
        }else{
            volver(id);//el ultimo auto que queda en el transbordador simula la vuelta a la otra orilla
        }
    }
    
    public synchronized void volver(int id){
        try{
            System.out.println("Comienza el retorno del transbordador...");
            this.wait(5000);//simula el viaje de vuelta del barco el ultimo hilo que queda
        }catch(Exception e){
                System.err.println("sarpar "+e.getMessage());
        }
        System.out.println("LLega el transbordador a la orilla este...");
        this.permisoViajar.release();//libera a los autos que quedaron a la orilla que no pudieron subir
    }
}


