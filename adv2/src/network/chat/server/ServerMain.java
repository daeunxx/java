package network.chat.server;

import java.io.IOException;

public class ServerMain {

  public static void main(String[] args) throws IOException {
    Server server = new Server("localhost", 12345);
    server.run();
  }
}
