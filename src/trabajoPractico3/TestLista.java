/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPractico3;

/**
 *
 * @author ricardo
 */
public class TestLista {
    public static void main(String[] args) {
        ListaMonitor m = new ListaMonitor(1);
        new BuscadorM(1,m).start();
        new BuscadorM(2,m).start();
        new InsertorM(1,m).start();
        new InsertorM(2,m).start();
        new BorradorM(1,m).start();
        new BorradorM(2,m).start();
        
    }
}
