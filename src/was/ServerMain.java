package was;

import java.io.IOException;
import was.v2.HttpServerV2;

public class ServerMain {

  private static final int PORT = 12345;

  public static void main(String[] args) throws IOException {
    //HttpServerV1 server = new HttpServerV1(PORT);
    HttpServerV2 server = new HttpServerV2(PORT);
    server.start();
  }
}
