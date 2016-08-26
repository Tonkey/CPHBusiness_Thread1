package ex2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicklas Molving
 */
public class Thread1 extends Thread{

    private Even e;
    
    public Thread1(Even e){
        this.e = e;
    }
    
    @Override
    public void run(){
        int count = 0;
        
        for(int i = 0; i < 100000; i++){
            int x = e.next();
//            System.out.println(x);
            if(x%2 != 0) count++;
        }
        
        System.out.println("Count " + count);
    }
    
}
