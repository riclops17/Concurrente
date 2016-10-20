/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico2;

/**
 *
 * @author ricardo
 */
public class TestearHamster {
    
    public static void main(String[] args) {
    Jaula j1 = new Jaula("jaula1");
    
    Thread h1 = new Hamster("hamster1",j1);
    Thread h2 = new Hamster("hamster2",j1);
    Thread h3 = new Hamster("hamster3",j1);
    Thread h4 = new Hamster("hamster4",j1);
    h1.start();
    h2.start();
    h3.start();
    h4.start();
           
    
 }
    
}
