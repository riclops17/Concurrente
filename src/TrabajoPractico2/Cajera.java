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
public class Cajera extends Thread {
private String nombre;
private Cliente cliente;
private long initialTime;
// Constructor, getter & setter
@Override
public void run() {
System.out.println("La cajera " + this.nombre + " COMIENZA APROCESAR LA COMPRA DEL CLIENTE "
+ this.cliente.getNombre() + " EN EL TIEMPO: "
+ (System.currentTimeMillis() - this.initialTime) / 1000
+ "seg");
for (int i = 0; i < this.cliente.getCarroCompra().length; i++) {
this.esperarXsegundos(cliente.getCarroCompra()[i]);
System.out.println("Procesado el producto " + (i + 1)
+ " del cliente " + this.cliente.getNombre() + "->Tiempo: "
+ (System.currentTimeMillis() - this.initialTime) / 1000
+ "seg");
}
System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " + this.cliente.getNombre() + " EN EL TIEMPO: "
+ (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
}
}