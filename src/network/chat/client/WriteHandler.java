package network.chat.client;

import static util.MyLogger.log;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteHandler implements Runnable {

  private static final String DELIMITER = "|";

  private final DataOutputStream dataOutputStream;
  private final Client client;
  private boolean closed = false;

  public WriteHandler(DataOutputStream dataOutputStream, Client client) {
    this.dataOutputStream = dataOutputStream;
    this.client = client;
  }

  @Override
  public void run() {
    Scanner scanner = new Scanner(System.in);
    String username = "";

    while (scanner.nextLine().isBlank()) {
      System.out.print("회원 이름: ");
      username = scanner.nextLine();
    }

    try {
      dataOutputStream.writeUTF("/join" + DELIMITER + username);

      while (true) {
        String toSend = scanner.nextLine();

        if (toSend.equals("/exit")) {
          dataOutputStream.writeUTF(toSend);
          break;
        } else if (toSend.startsWith("/")) {
          dataOutputStream.writeUTF(toSend);
        } else {
          dataOutputStream.writeUTF("/message" + DELIMITER + toSend);
        }
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      close();
    }
  }

  public void close() {
    if (closed) {
      return;
    }
    try {
      System.in.close();
    } catch (IOException e) {
      log(e);
    }
    closed = true;
    client.close();
    log("WriteHandler 종료");
  }
}
