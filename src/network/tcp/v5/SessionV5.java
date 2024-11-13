package network.tcp.v5;

import static util.MyLogger.log;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class SessionV5 implements Runnable {

  private final Socket socket;

  public SessionV5(Socket socket) {
    this.socket = socket;
  }

  @Override
  public void run() {

    try(socket;
        DataInputStream inputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream())) {
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
    }

    log("연결 종료: " + socket + "isClosed: " + socket.isClosed());
  }
}
