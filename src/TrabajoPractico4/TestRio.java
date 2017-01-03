/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico4;
import java.util.concurrent.Semaphore;
/**
 *
 * @author ricardo
 */
public class TestRio {


    public static void main(String [ ] args){
        Semaphore mutex = new Semaphore(1,true);
        Semaphore lobos = new Semaphore(10);
        Semaphore corderos = new Semaphore(1,true);
        Rio r = new Rio(mutex,lobos, corderos);
        
        for(int i=0;i<=12;i++){
            Lobo l = new Lobo(r,i+"");
            Cordero c = new Cordero(r,i+"");
            l.start();
            c.start();
        }
    }
}


