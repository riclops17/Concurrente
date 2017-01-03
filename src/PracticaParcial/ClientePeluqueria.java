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
public class ClientePeluqueria extends Thread {
    private Barberia b;
    private SillaF s;
    private int id;
    public ClientePeluqueria(Barberia b1 , int i, SillaF s1) {
        this.b = b1;
        this.id = i;
        this.s = s1;
    }

   
    public void run() {
        while (true){
            try {
                s.tomarSilla(id);
                b.entrarBarberia(id);
                b.SalirBarberia(id);
                s.DejarSilla(id);
            } catch (InterruptedException ex) {

            }
        }
        }
}
