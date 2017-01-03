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
public class TestIndustria {
    public static void main(String[] args) {
         LineaMontaje linea = new LineaMontaje(3);
         new Colocador(linea).start();
         new Empaquetador(linea, 1).start();
         new Empaquetador(linea, 2).start();
         new Empaquetador(linea, 3).start();
         

    }
}
