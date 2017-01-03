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
public class AutoNorte extends Thread{
    private int id;
    private GestionTraficoSemaforos g;
    public AutoNorte (int i, GestionTraficoSemaforos g1){
        this.id = i;
        this.g = g1;
    }
    public void run(){
        while(true){
            
            try {
                g.entrarCocheNorte(id);
                //recorriendo puente
                 g.salirCocheNorte(id);
            } catch (InterruptedException ex) {
                Logger.getLogger(AutoNorte.class.getName()).log(Level.SEVERE, null, ex);
            }
               
              
            
            
            
        }
    }
}
