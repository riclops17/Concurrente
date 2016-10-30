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
public class Mesa {
    private boolean fumando = false;
    private boolean ingrEnMesa = false;
    private int ingr;
    public synchronized void ingredientesAleatorios(int ing) throws InterruptedException{
        while( ingrEnMesa || fumando){
            wait();
        }
        this.ingr = ing;
        ingrEnMesa = true;
        System.out.println("el agente no pone ingredientes :"+ing);
        notifyAll();
    }
    public synchronized void empezarfumar(int id) throws InterruptedException{
        while(!ingrEnMesa|| fumando || ingr != id){
            wait();
        }
        System.out.println("el fumador "+id+ "empezo a fumar");
        ingrEnMesa = false;
        fumando = true;
        
    }
    public synchronized void terminarFumar(int id)throws InterruptedException{
        fumando = false;
        System.out.println("el fumador "+id+ "termino de fumar");
        notifyAll();
    }
}
