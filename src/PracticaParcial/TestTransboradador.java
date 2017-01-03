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
public class TestTransboradador {
    
    public static void main(String[] args) {
        Semaphore viajar= new Semaphore(1);//controla la subida de los autos al transbordador
        Semaphore llego= new Semaphore(0);//controla la bajada de los autos al transbordador
        Transbordador transbordador= new Transbordador(viajar,llego);
        Thread[] vector= new Thread[30];
        for (int i = 0; i < vector.length; i++) {
            vector[i]= new Auto(transbordador,i);
        }
        for(int j = 0; j < vector.length; j++) {
            vector[j].start();
        }
        for (int i = 0; i < vector.length; i++) {
            try{
                vector[i].join();
            }catch(Exception e){
                System.err.println("join "+e.getMessage());
            }
        }
        System.out.println("No quedan mas autos");
    }
}


