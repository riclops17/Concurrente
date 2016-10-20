/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPractico3;
import java.util.concurrent.Semaphore;
/**
 *
 * @author ricardo
 */
public class TestearSemaforos {
    public static void main(String[] args) {
        Semaphore sem1 = new Semaphore(1);
        Semaphore sem2 = new Semaphore(1);
        Semaphore sem3 = new Semaphore (1);
        Semaphore sem4 = new Semaphore (0);
        Proceso1 h1 = new Proceso1(sem1,sem2);
        Proceso2 h2 = new Proceso2(sem2, sem3);
        Proceso3 h3 = new Proceso3(sem1, sem3, sem4);
        Proceso4 h4 = new Proceso4(sem4);

        h1.start();
        h2.start();
        h3.start();
        h4.start();

}
}
