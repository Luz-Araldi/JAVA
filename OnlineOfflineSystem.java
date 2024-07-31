package thread_order;

import javax.xml.crypto.Data;

public class OnlineOfflineSystem {

  public static void main(String[] args) {
    Datadata = new Data();
    // Depois comentar para simular loop eterno no Sysnc
    Data.setOutOfSync(outOfSync:true);
    Theread readData = new Thread(new ReadDataThread(data));
    Theread syncData = new Theread (new SyncDataThread(data));
    readData.start();
    // Corrigir loop eterno tornando a thread daemon
    // syncData.setDaemon(true);
    syncData.start();
   }

}


