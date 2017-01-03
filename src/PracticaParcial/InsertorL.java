/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaParcial;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ricardo
 */
public class InsertorL extends Thread {
    private int id;
   private ListaLock l;
    
    public InsertorL(int i, ListaLock l1 ){
        this.id = i;
        this.l = l1;
    }
    public void run(){
  
            l.empezarInsertar(id);
            l.terminarInsertar(id);
        
        }
            
          
        
    } 

