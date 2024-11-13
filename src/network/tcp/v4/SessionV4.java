package network.tcp.v4;

import static network.tcp.SocketCloseUtil.closeAll;
import static util.MyLogger.log;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class SessionV4 implements Runnable {

  private final Socket socket;

  public SessionV4(Socket socket) {
    this.socket = socket;
  }

  @Override
  public void run() {
    // finally 블록에서 변수에 접근
    DataInputStream inputStream = null;
    DataOutputStream outputStream = null;

    try {
      inputStream = new DataInputStream(socket.getInputStream());
      outputStream = new DataOutputStream(socket.getOutputStream());

      while (true) {
        // 클라이언트로부터 문자 받기
        String received = inputStream.readUTF(); // 블로킹
        log("client -> server: " + received);

        if (received.equals("exit")) {
          break;
        }

        // 클라이언트에게 문자 보내기
        String toSend = received + " World!";
        outputStream.writeUTF(toSend);
        log("client <- server: " + toSend);
      }
    } catch (IOException e) {
      log(e);
    } finally {
      closeAll(socket, inputStream, outputStream);
      log("연결 종료: " + socket);
    }
  }
}
