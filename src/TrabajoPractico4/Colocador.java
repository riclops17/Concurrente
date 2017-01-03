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
public class Colocador extends Thread {

    private LineaMontaje montaje;

    public Colocador(LineaMontaje lm) {
        montaje = lm;
    }

    @Override
    public void run() {
        Random rand;
        int producto;

        while (true) {
            producto = new Random().nextInt(3) + 1;
            montaje.colocar(producto);
            try {
                Thread.sleep((long) (Math.random() * 2000));
            } catch (InterruptedException ex) {
            }
        }
    }
}