/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaParcial;

/**
 *
 * @author ricardo
 */
public class TestTaxi {
    public static void main(String[] args) {
        Taxi t = new Taxi();
        new Cliente(t,1).start();
        new Cliente (t,2).start();
        new Cliente (t,3).start();
        new Cliente (t,4).start();
        new Cliente (t,5).start();
        new Taxista(t).start();
    }
}
