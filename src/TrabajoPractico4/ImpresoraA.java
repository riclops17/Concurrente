/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ricardo
 */
    public class ImpresoraA  extends Thread{
    Buffer colaImp;

    public ImpresoraA(Buffer c) {
        colaImp = c;
    }

    @Override
    public void run() {
        while (true) {
            colaImp.quitarA();
            System.out.println("Imprimiendo un trabajo tipo A");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            colaImp.quitarB();
            System.out.println("Imprimiendo un trabajo tipo B");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}


