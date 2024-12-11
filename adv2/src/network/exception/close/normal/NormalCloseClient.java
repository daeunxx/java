package network.exception.close.normal;

import static util.MyLogger.log;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class NormalCloseClient {

  public static void main(String[] args) throws IOException {
    Socket socket = new Socket("localhost", 12345);
    log("소켓 연결: " + socket);
    InputStream inputStream = socket.getInputStream();

    readByInputStream(inputStream, socket);
    readByBufferedReader(inputStream, socket);
    readByDataInputStream(inputStream, socket);

    log("연결 종료: " + socket.isClosed());
  }

  private static void readByInputStream(InputStream inputStream, Socket socket) throws IOException {
    int read = inputStream.read();
    log("read: " + read);

    if (read == -1) {
      inputStream.close();
      socket.close();
    }
  }

  private static void readByBufferedReader(InputStream inputStream, Socket socket)
      throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
    String readString = br.readLine();
    log("readString: " + readString);
    if (readString != null) {
      br.close();
      socket.close();
    }
  }

  private static void readByDataInputStream(InputStream inputStream, Socket socket)
      throws IOException {
    DataInputStream dis = new DataInputStream(inputStream);

    try {
      dis.readUTF();
    } catch (IOException e) {
      log(e);
    } finally {
      dis.close();
      socket.close();
    }
  }
}
