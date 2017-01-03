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
public class LineaMontaje {

    private int productoTipo1;
    private int productoTipo2;
    private int productoTipo3;
    private int productosEmpaquetados;
    private int productosEnLineaMontaje;

    private static int CAPACIDAD;
   

    public LineaMontaje(int n) {
        productoTipo1 = 0;
        productoTipo2 = 0;
        productoTipo3 = 0;
        productosEnLineaMontaje = 0;
        productosEmpaquetados = 0;
        CAPACIDAD = n;
       
    }

    public synchronized void colocar(int tipoProducto) {
        
        try {
            while (productosEnLineaMontaje == CAPACIDAD) {
                System.err.println("Cola de producción llena");
                this.wait();
            }
            productosEnLineaMontaje++;
            switch (tipoProducto) {
                case 1:
                    System.out.println("Coloqué producto tipo 1");
                    productoTipo1++;
                    this.notify();
                    break;
                case 2:
                    System.out.println("Coloqué producto tipo 2");
                    productoTipo2++;
                    this.notify();
                    break;
                case 3:
                    System.out.println("Coloqué producto tipo 3");
                    productoTipo3++;
                    this.wait();
                    break;
            }
            this.wait();
        } catch (InterruptedException ex) {
        }
        
    }

    public synchronized void sacar(int tipoProducto) {
        
        try {
            while (productosEnLineaMontaje == 0) {
               this.wait();
            }
            switch (tipoProducto) {
                case 1:
                    if (productoTipo1 > 0) {
                        System.out.println("Se empaquetó un producto tipo 1");
                        productoTipo1--;
                    } else {
                        this.wait();
                    }
                    break;
                case 2:
                    if (productoTipo2 > 0) {
                        System.out.println("Se empaquetó un producto tipo 2");
                        productoTipo2--;
                    } else {
                        this.wait();
                    }
                    break;
                case 3:
                    if (productoTipo3 > 0) {
                        System.out.println("Se empaquetó un producto tipo 2");
                        productoTipo3--;
                    } else {
                        this.wait();
                    }
                    break;
            }
            productosEmpaquetados++;
            productosEnLineaMontaje--;

            this.notify();   // Aviso que la línea ya no está llena
        } catch (InterruptedException ex) {
            
        } 
        
    }

    public int getProductos() {
        return productosEmpaquetados;
    }
}
