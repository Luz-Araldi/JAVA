package creating_tasks;

public class PrinHelloTask implements Runnable {
private String name;

public PrintHelloTask (String name) {
    this.name = name;
}

@Override
public void run() {
   // Sleep para monitorar no JConsole
   // try {
   // Thread.sleep(60000);   
   // } cath (InterrupteException e) {
   // System.out.println(name + "was interrupted!");
   // e.printStackTrace();   
   // }

   System.out.printLn("Hello, " + name + "!");
   }

}

