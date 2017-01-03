/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico4;
import java.util.Random;
/**
 *
 * @author ricardo
 */
public class Cordero extends Thread{
    private Rio r;
    private boolean vivo;
    private String no1;

    public Cordero(Rio r, String no) {
        this.r = r;
        vivo = true;
        this.no1 = no;
    }

    public void run() {
        Random num = new Random();
        while (vivo) {
            try {
                r.corderoEntra(this.no1);
                System.out.println("El cordero "+no1+" esta tomando agua");
                Thread.sleep(num.nextInt(7)*1000);
                if (!r.isVivo()) {
                    vivo = false;
                }else{                    
                r.corderoSale(this.no1);
                }
                Thread.sleep(num.nextInt(7)*1000);
     
            } catch (InterruptedException ex) {
            }
        }
    }
}

