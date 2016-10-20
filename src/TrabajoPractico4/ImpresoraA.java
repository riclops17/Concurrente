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
    public class ImpresoraA  extends Thread{
    private int numero;
    private String dato;
    private Buffer buff;
    private char tipo;
    public ImpresoraA(int n,String d, Buffer b){
        numero = n;
        buff = b;
        dato = d;
       
    }
    public void run(){
      
    }
}

