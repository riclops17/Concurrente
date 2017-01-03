/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico4Parte2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ricardo
 */
public class AutoNorte extends Thread{
    private int id;
    private GestionaTraficoMejorado g;
    public AutoNorte (int i, GestionaTraficoMejorado g1){
        this.id = i;
        this.g = g1;
    }
    public void run(){
        while(true){
            try {
                g.EntrarCocheDelNorte(id);
                //recorriendo puente
               
                g.SalirCocheDelNorte(id);
            } catch (InterruptedException ex) {
                Logger.getLogger(AutoNorte.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
