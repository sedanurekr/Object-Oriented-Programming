
package proje2deneme2;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyThread implements Runnable {
    
    
    Sirketler sirket;
    public MyThread(Sirketler sirket) {
        this.sirket = sirket;
    }

    public void run() {
        int i=0;
       while(i<10){
           for(ArrayList l : this.sirket.getHisseSenedi()) {
                try {
                    Random rand = new Random();
                    int n = rand.nextInt(10) + 1;
                    sirket.update(l, n);
                    Thread.sleep(1000);
                } 
                catch (InterruptedException ex) {
                    Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
                }
                i++;
           }
        }
    }

    
    
}
