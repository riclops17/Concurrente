/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaParcial;

import java.util.Random;

/**
 *
 * @author ricardo
 */
public class Auto  extends Thread{
    private Transbordador tra;
    private int id;
    
    public Auto(Transbordador unTrans, int id){
        this.tra= unTrans;
        this.id= id;//identifica el auto para hacer una traza en el output
    }
    
    public void run(){
        Random aleatorio= new Random();
        try{
            Thread.sleep(aleatorio.nextInt(2000)+1000);//doy un tiempo para que no lleguen todos los autos juntos
        }catch(Exception e){
            System.err.println("llegada al transbordador "+e.getMessage());
        }
        System.out.println("Auto "+this.id+" intenta subir al transbordador");
        this.tra.subir(id);
    }

}


