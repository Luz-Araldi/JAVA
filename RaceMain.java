package terminate_theread;

public class RaceMain {
    
    public static void main(String ags[]) {
       Race race = new Race();
       Thread runner1 = new Thread(new Runner(race, runner:" terminate_thread.Runner"))
       Thread runner2 = new Thread(new Runner(race, runner:"Runner 2" ));
       System.out.println("Starting...");
       runner1.start();
       runner2.start();
    }
}

