/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico4;
import TrabajoPractico4.ColaInt;
/**
 *
 * @author ricardo
 */
public class Buffer {
    private int tipoA;
    private int tipoB;

    public Buffer() {
        tipoA = 0;
        tipoB = 0;
    }

    public synchronized void agregarA() {
        tipoA++;
        notifyAll();
    }

    public synchronized void agregarB() {
        tipoB++;
        notifyAll();
    }

    public synchronized void quitarA() {
        while (tipoA == 0) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        tipoA--;
    }
    
    public synchronized void quitarB() {
        while (tipoB == 0) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        tipoB--;
    }
}