/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico4Parte2;

/**
 *
 * @author ricardo
 */
public class TestTransportador {
    public static void main(String[] args) {
        Transbordador t = new Transbordador(1);
        new Auto(1,t).start();
        new Auto(2,t).start();
        new Auto(3,t).start();
        new Auto(4,t).start();
        new Auto(5,t).start();
        new Auto(6,t).start();
        new Auto(7,t).start();
        new Auto(8,t).start();
        new Auto(9,t).start();
        new Auto(10,t).start();
        new Auto(11,t).start();
        new Auto(12,t).start();
    }
}
