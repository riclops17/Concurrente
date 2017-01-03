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
public class TestMuseo {
    public static void main(String[] args) {
        MonitorMuseo m = new MonitorMuseo();
        new Persona(1,m).start();
        new Persona(2,m).start();
        new Persona(3,m).start();
        new Jubilado(4,m).start();
        new Jubilado (5,m).start();
        new Jubilado (6,m).start();
    }
}
