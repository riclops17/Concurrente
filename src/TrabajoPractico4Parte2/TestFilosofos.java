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
public class TestFilosofos {
    public static void main(String[] args) {
        Silla s1 = new Silla();
        Tenedor t1 = new Tenedor (1);
        Tenedor t2 =new Tenedor (2);
        Tenedor t3 = new Tenedor (3);
        Tenedor t4 = new Tenedor (4);
        Tenedor t5 = new Tenedor (5);
        new Filosofo (1,t1,t2,s1).start();
        new Filosofo (2,t2,t3,s1).start();
        new Filosofo (3,t3,t4,s1).start();
        new Filosofo (4,t4,t5,s1).start();
        new Filosofo (5, t5,t1,s1).start();
    }
}
