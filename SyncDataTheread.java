package thread_order;

public class SyncDataTheread implements Runnable {
  private Data data;

  public SyncDataTheread (Data data) {
    super();
    this.data = data;
  }

  @Override
  public void run() {
    data.sync();
  }
}

