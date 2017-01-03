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
public class TestPuente {
    public static void main(String[] args) {
        Semaphore a= new Semaphore(1);
        Semaphore b= new Semaphore(1);
        GestionTraficoSemaforos g = new GestionTraficoSemaforos(a,b);
        new AutoNorte(1,g).start();
        new AutoNorte(2,g).start();
        new AutoNorte(3,g).start();
        new AutoNorte(4,g).start();
        new AutoNorte(5,g).start();
        
         
        new AutoSur(1,g).start();
        new AutoSur(2,g).start();
        new AutoSur(3,g).start();
       
    }
    
}
