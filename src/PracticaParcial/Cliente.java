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
public class Cliente extends Thread {
    private Taxi unTaxi;
    private int id;
    public Cliente(Taxi t , int i) {
        unTaxi = t;
        this.id = i;
    }

    @Override
    public void run() {
        
            try {
                unTaxi.subirTaxi(id);
                unTaxi.bajar(id);
            } catch (InterruptedException ex) {

            }
        }
    }



