/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico4;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ricardo
 */
public class Agente  extends Thread{
    private Random r = new Random();
    private Mesa mesa;
    public Agente (Mesa m){
       this.mesa = m;
       
    }
    public void run(){
        int ingr = r.nextInt(3);
        while(true){
        
        try {
            Thread.sleep(r.nextInt(300));
            mesa.ingredientesAleatorios(ingr);
        } catch (InterruptedException ex) {
            Logger.getLogger(Agente.class.getName()).log(Level.SEVERE, null, ex);
        }
        } 
    }
    
}
