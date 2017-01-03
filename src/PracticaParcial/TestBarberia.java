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
public class TestBarberia {
    public static void main(String[] args) {
        SillaF s = new SillaF();
        Barberia b = new Barberia();
        new ClientePeluqueria(b,1,s).start();
        new ClientePeluqueria(b,2,s).start();
        new ClientePeluqueria(b,3,s).start();
        new ClientePeluqueria(b,4,s).start();
        new Barbero(b).start();
        
    }
}
