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
public class TestSoldado {
    public static void main(String[] args) {
        Cuartel c = new Cuartel(2);
        new Soldado(1,c).start();
        new Soldado (2,c).start();
        new Soldado (3,c).start();
        new Soldado (4,c).start();
    }
}
