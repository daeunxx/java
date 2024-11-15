package network.chat.client;

import static util.MyLogger.log;

import java.io.DataInputStream;
import java.io.IOException;

public class ReadHandler implements Runnable {

  private final DataInputStream dataInputStream;
  private final Client client;
  private boolean closed =false;

  public ReadHandler(DataInputStream dataInputStream, Client client) {
    this.dataInputStream = dataInputStream;
    this.client = client;
  }

  @Override
  public void run() {
    while (true) {
      try {
        String received = dataInputStream.readUTF();
        System.out.println("출력: " + received);
      } catch (IOException e) {
        log(e);
      } finally {
        close();
      }
    }
  }

  public void close() {
    if (closed) {
      return;
    }
    closed = true;
    client.close();
    log("ReadHandler 종료");
  }
}
