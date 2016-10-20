/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrente;
import java.io.*;
/**
 *
 * @author ricardo
 */
public class ejercicio9 {
    public static void main(String[] args) {
        try{
            System.out.println(metodo());
        }catch(Exception e){
            System.out.println("Execeptsion en metodo()");
            e.printStackTrace();
        }
    }
 private static int metodo(){
     int valor = 0;
     try{
         valor = valor +1 ;
         valor = valor + Integer.parseInt("W");
         valor = valor +1 ;
         System.out.println("valor al final del try: " + valor);
         throw new IOException();
     }catch(IOException e){
         valor = valor + Integer.parseInt("42");
         System.out.println("valor al final del catch: " + valor);
     }finally{
         valor = valor +1;
         System.out.println("valor al final de finally " + valor);
     }
     valor = valor +1;
     System.out.println("valor antes del return " + valor);
     return valor;
 }
    
}
