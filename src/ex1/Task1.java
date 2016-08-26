package ex1;

/**
 *
 * @author Nicklas Molving
 */
public class Task1 extends Thread{

    public void run(){
        System.out.println("Task 1 Initiating");
        long res = 0;
        for(int i = 1; i < 1000000000; i++){
            res += i;
        }
        System.out.println("Task 3 : " + res);
        System.out.println("Task 1 Done!");
        interrupt();
    }
}
