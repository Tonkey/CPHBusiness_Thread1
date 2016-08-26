package ex1;

/**
 *
 * @author Nicklas Molving
 */
public class TaskRunner{

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Task1();
        t1.start();
        Thread t2 = new Task2();
        t2.start();
        
        Task3 t3 = new Task3();
        t3.start();
        Thread.sleep(10000);
        t3.stopCount();
        
    }
}
