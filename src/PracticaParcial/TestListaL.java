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
public class TestListaL {
    public static void main(String[] args) {
        ListaLock m = new ListaLock(1);
        new BuscadorL(1,m).start();
        new BuscadorL(2,m).start();
        new InsertorL(1,m).start();
        new InsertorL(2,m).start();
        new BorradorL(1,m).start();
        new BorradorL(2,m).start();
    }
}
