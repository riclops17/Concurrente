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
public class TestImpresora {
    public static void main(String[] args) {
        Buffer b1 = new Buffer();
        ImpresoraA imp = new ImpresoraA(b1);
        new Usuario (b1).start();
       // new Usuario(b1).start();
    }
}
