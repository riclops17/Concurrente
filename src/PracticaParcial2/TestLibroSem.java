/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaParcial2;

/**
 *
 * @author ricardo
 */
public class TestLibroSem {
    public static void main(String[] args) {
        LibroS l1 =  new LibroS();
        new LectorS(1,l1).start();
        new LectorS(2,l1).start();
        new LectorS(3,l1).start();
        new EscritorS(1,l1).start();
        new EscritorS(2,l1).start();
    }
}
