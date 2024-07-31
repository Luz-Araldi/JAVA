public class CounterTask  implements Runnable {
 
    @Override
    public void run() {
       synchronized (this) {
          counter++;
          System.out.println(Thread.currentThread().getName() + ": " + counter);
            
       }
    }
}
