package network.exception.close.reset;

import static util.MyLogger.log;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

public class ResetCloseClient {

  public static void main(String[] args) throws IOException, InterruptedException {
    Socket socket = new Socket("localhost", 12345);
    log("소켓 연결: " + socket);

    InputStream inputStream = socket.getInputStream();
    OutputStream outputStream = socket.getOutputStream();

    // client <- server: FIN
    Thread.sleep(1000); // server 가 close() 호출할 때까지 대기

    // client -> server: PUSH[1]
    outputStream.write(1);

    // client <- server: RST (강제 종료)
    Thread.sleep(1000); // RST 메시지 전송 대기

    try {
      // java.net.SocketException: Connection reset
      int read = inputStream.read();
    } catch (SocketException e) {
      e.printStackTrace();
    }

    try {
      // java.net.SocketException: Broken pipe
      outputStream.write(1);
    } catch (SocketException e) {
      e.printStackTrace();
    }
  }
}
