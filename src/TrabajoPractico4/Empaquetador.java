/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico4;

/**
 *
 * @author ricardo
 */
public class Empaquetador extends Thread {

    private LineaMontaje montaje;
    private int tipoProducto;

    public Empaquetador(LineaMontaje lm, int tipo) {
        montaje = lm;
        tipoProducto = tipo;
    }

    @Override
    public void run() {
        while (true) {
            montaje.sacar(tipoProducto);
            try {
                Thread.sleep((long) (Math.random() * 2000));
            } catch (InterruptedException ex) {
            }
            System.out.println(">>> Productos empaquetados: " + montaje.getProductos());
        }
    }
}