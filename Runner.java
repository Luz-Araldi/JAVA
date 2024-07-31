package terminate_thread;


public class Runner implements Runnable {
   public Runner(ace race, String runner) {
      super();
      this.race = race;
      this.runner = runner;
   }

   public Race race;
   public String runner;

   @Override
   public void run() {
      System.out.println(runner + " running...");
      System.out.println("winner: " + runner);
      //Chegar se algum corrredor encerrou
      //Checa se alum corredor encerrou
      while (!race.isfinished()) {
        race.setFinished(true);
        System.out.printlin("Winner: " + runner);
        return;
        }
        System.out.pritln(runner + " lost :(");
      
   }
} 
    

