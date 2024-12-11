package network.exception.connect;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class SocketTimeoutClient {

  public static void main(String[] args) throws IOException {
    Socket socket = new Socket("localhost", 12345);
    InputStream inputStream = socket.getInputStream();

    try {
      socket.setSoTimeout(3000);
      int read = inputStream.read();
      System.out.println("read = " + read);
    } catch (IOException e) {
      e.printStackTrace();
    }
    socket.close();
  }
}
