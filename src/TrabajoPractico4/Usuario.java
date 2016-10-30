/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoPractico4;
import java.util.Random;
/**
 *
 * @author ricardo
 */
public class Usuario extends Thread{
private Buffer copiado;

    public Usuario(Buffer c) {
        copiado = c;
    }

    @Override
    public void run() {
        Random r = new Random();
        
        while (true) {
            char tipoTrabajo = generarTrabajo();
            boolean rand = r.nextBoolean();
            
            switch (tipoTrabajo) {
                case 'A':
                    copiado.agregarA();
                    break;
                case 'B':
                    copiado.agregarB();
                    break;
                case 'C':
                    if (rand) {
                        copiado.agregarA();
                    } else {
                        copiado.agregarB();
                    }
                break;
            }
            
            System.out.println("El usuario agregó un trabajo tipo " + tipoTrabajo);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private char generarTrabajo() {
        Random rand = new Random();
        int aleatorio = rand.nextInt(3);
        char tipo = 0;

        switch (aleatorio) {
            case 0:
                tipo = 'A';
                break;
            case 1:
                tipo = 'B';
                break;
            case 2:
                tipo = 'C';
                break;
        }

        return tipo;
    }
}