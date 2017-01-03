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
public class Clinica {
    private int cantSalaMedica;
    private int cantEscayola;
    private int cantRayosX;
    
    public synchronized void EntrarSalaMedica(int id) throws InterruptedException{
        while(cantSalaMedica >= 20){
            this.wait();
        }
        cantSalaMedica++;
        System.out.println("el paciente "+id+" ingreso a la sala medica");
    }
    public synchronized void SalirSalaMedica(int id){
        System.out.println("el paciente "+id+" salio de la sala medica");
        cantSalaMedica--;
        this.notifyAll();
    }
    public synchronized void EntrarEscayola(int id) throws InterruptedException{
        while(cantEscayola >= 6){
            this.wait();
        }
        cantEscayola++;
        System.out.println("el paciente "+id+" ingreso a Escayola");
    }
    
    public synchronized void SalirEscayola(int id){
        System.out.println("el paciente "+id+" salio de Escayola");
        cantEscayola--;
        this.notifyAll();
    }
    public synchronized void entrarRayosx(int id){
        cantRayosX++;
        System.out.println("el paciente"+id+"entro a rayos x");
    }
    public synchronized void salirRayosx(int id){
       System.out.println("el paciente "+id+"salio de rayos x");
        cantRayosX--;
        
    }
}
