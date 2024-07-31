package terinate_thread;

public class Race {
   private volatile boolean finished;
   //private boolean finished;

   public boolean isFinished() {
      return finished;
   }
    
    
    public void setFinished(boolean finished) {
       this.finished = finished;
    }

}
