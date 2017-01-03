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
public class TestPuente {
    public static void main(String[] args) {
        GestionaTraficoMejorado g = new GestionaTraficoMejorado(1);
        new AutoNorte(1,g).start();
        new AutoNorte(2,g).start();
        new AutoNorte(3,g).start();
        new AutoNorte(4,g).start();
        new AutoNorte(5,g).start();
        new AutoNorte(6,g).start();
        new AutoNorte(7,g).start();
        new AutoNorte(8,g).start();
        new AutoNorte(9,g).start();
        new AutoNorte(10,g).start();
        new AutoNorte(11,g).start();
         
        new AutoSur(1,g).start();
        new AutoSur(2,g).start();
        new AutoSur(3,g).start();
        new AutoSur(4,g).start();
        new AutoSur(5,g).start();
        new AutoSur(6,g).start();
        new AutoSur(7,g).start();
        new AutoSur(8,g).start();
        new AutoSur(9,g).start();
        new AutoSur(10,g).start();
        new AutoSur(11,g).start();
        
        
        
    }
}
