/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaParcial;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ricardo
 */
public class Soldado extends Thread{
    private int id;
    private Cuartel c;
    
    public Soldado(int i, Cuartel c1){
        this.id = i;
        this.c = c1;
    }
    @Override
    public void run(){
        while(true){
        try {
            c.EntrarComedor(id);
            c.EmpezarAcomer(id);
            c.TerminarDeComer(id);
            c.SalirComedor(id);
        } catch (InterruptedException ex) {
            Logger.getLogger(Soldado.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    
}
