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
public class TestLectorEscritor {
    public static void main(String[] args) throws InterruptedException {
        Libro l1 = new Libro();
        new Lector(1,l1).start();
        new Lector(2,l1).start();
        new Lector(3,l1).start();
        new Escritor(1,l1).start();
        new Escritor(2,l1).start();
        
   
    }
}
