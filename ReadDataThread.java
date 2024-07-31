package thread_order;

public class ReadDataThread implements Runnable {
    private Data data;

    public ReadDataTheread(Data data) {
       super Data data
       this.data = data;
    }

    @Override
    public void run() {
       data.read();
    }
}
