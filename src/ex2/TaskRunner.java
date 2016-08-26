package ex2;

/**
 *
 * @author Nicklas Molving
 */
public class TaskRunner {
    /**
     * What happens? When the threads access the next() method at the same time, and with enough speed,
     * they collide and runs n++ on top of each other, giving an uneven result instead of an even result.
     * how Common is this? I guess that depends on the specific situation, I've gotten anywhere from 200 uneven numbers,
     * up to 90k uneven numbers, which in my mind makes it a way too common problem.
    */
    public static void main(String[] args) {
    Even e = new Even();
        
    Thread t1 = new Thread1(e);
    t1.start();
    Thread t2 = new Thread1(e);
    t2.start();
    
    
    }
    
    
}
