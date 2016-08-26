package ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicklas Molving
 */
public class Task3 extends Thread {

    public boolean stopCounting = false;
    
    public void run() {
        System.out.println("Task 3 Initiated");
        int i = 10;
        while(!stopCounting){
            System.out.println("Task 3 : " + i);
            try {
                sleep(3000);

            } catch (InterruptedException ex) {
            }
            i++;
        }
        System.out.println("Task 3 Done!");
    }
    
    public void stopCount(){
        stopCounting = true;
    }
    
}
