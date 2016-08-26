package ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicklas Molving
 */
public class Task2 extends Thread{
    
    @Override
    public void run(){
        System.out.println("Task 2 Initiated");
        for(int i = 1; i <= 5; i++){
            System.out.println("Task 2 : " + i);
            try {
                sleep(2000);
            } catch (InterruptedException ex) {
            }
        }
        System.out.println("Task 2 Done");
    }
    
}
