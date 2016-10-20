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
public class Concurrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] v = new double [15];
        try{
         acceso_por_indice (v, 16); 
        } catch (RuntimeException exc){
            System.out.println(exc.getMessage());
        }
    }
    public static double acceso_por_indice (double [] v, int j) throws RuntimeException{
     
           if ((0 <= j) && (j <= v.length))
              return v[j];
             else throw new RuntimeException ("El indice " + j + " no existe en el vector");
 
     } 
           }
          
    
    
   