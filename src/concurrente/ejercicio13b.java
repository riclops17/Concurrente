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
public class ejercicio13b {
    public static void main(String[] args) {
        try{
           ruletaRusa(2); 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    public static boolean ruletaRusa(int a)throws Exception{
        int num = 1;
        boolean res = true;
        while(num<=10 && res){
            if(num == a){
                res = false;
            }else{
                throw new Exception (" el numero no esta");
            }
            num++;
        }
        return res;
    }
}
