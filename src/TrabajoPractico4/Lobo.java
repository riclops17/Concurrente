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
public class Lobo extends Thread {
    private Rio r;
    private String no;

    public Lobo(Rio r, String no1) {
        this.r = r;
        no = no1;
    }

    public void run() {
        Random num = new Random();
        while (true) {
            try {
                r.loboEntra(this.no);
                if (r.comer(this.no)) {                    
                    Thread.sleep(num.nextInt(7) * 1000);
                }
                System.out.println("Lobo " + no + " tomando agua");
                Thread.sleep(num.nextInt(7) * 1000);
                r.loboSale(this.no);
                Thread.sleep(num.nextInt(7) * 1000);
            } catch (InterruptedException ex) {
            }
        }
    }
}


