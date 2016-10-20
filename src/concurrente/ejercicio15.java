/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrente;

/**
 *
 * @author ricardo
 */
public class ejercicio15 {
    public static void main(String[] args) {
        try{
            System.out.println(esMenor(15));
        }catch( RuntimeException exc){
            System.out.println(exc.getMessage());
        }
    }
    public static boolean esMenor(int a)throws RuntimeException{
        boolean res;
        res= false;
        if(a>18){
          return res = true;
        }else throw new RuntimeException ("es menor");
            
        
    }
    
}
