package network.chat.client;

import static util.MyLogger.log;

import java.io.DataInputStream;
import java.io.IOException;

public class ReadHandler implements Runnable {

  private final DataInputStream dataInputStream;
  private final Client client;
  private boolean closed = false;

  public ReadHandler(DataInputStream dataInputStream, Client client) {
    this.dataInputStream = dataInputStream;
    this.client = client;
  }

  @Override
  public void run() {
    try {
      while (true) {
        String received = dataInputStream.readUTF();
        log("Received: " + received);
      }
    } catch (IOException e) {
      log(e);
    } finally {
      client.close();
    }
  }

  public void close() {
    if (closed) {
      return;
    }
    closed = true;
    log("ReadHandler 종료");
  }
}
