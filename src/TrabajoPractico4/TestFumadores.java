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
public class TestFumadores {
    public static void main(String[] args) {
       Mesa m1 = new Mesa();
       
       new Fumador(1,m1).start();
       new Fumador (2,m1).start();
       new Fumador (3,m1).start();
       new Agente(m1).start();
    }
}
