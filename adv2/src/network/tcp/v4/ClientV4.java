package network.tcp.v4;

import static network.tcp.SocketCloseUtil.closeAll;
import static util.MyLogger.log;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientV4 {

  private static final int PORT = 12345;

  public static void main(String[] args) {
    log("클라이언트 시작");

    // finally 블록에서 변수에 접근
    Socket socket = null;
    DataInputStream inputStream = null;
    DataOutputStream outputStream = null;

    try {
      socket = new Socket("localhost", PORT);
      inputStream = new DataInputStream(socket.getInputStream());
      outputStream = new DataOutputStream(socket.getOutputStream());

      log("소켓 연결: " + socket);

      Scanner scanner = new Scanner(System.in);
      while (true) {
        System.out.print("전송 문자: ");
        String toSend = scanner.nextLine();

        // 서버에게 문자 전송
        outputStream.writeUTF(toSend);
        log("client -> server: " + toSend);

        if (toSend.equals("exit")) {
          break;
        }

        // 서버로부터 문자 받기
        String received = inputStream.readUTF();
        log("server -> client: " + received);
      }
    } catch (IOException e) {
      log(e);
    } finally {
      closeAll(socket, inputStream, outputStream);
      log("연결 종료: " + socket);
    }
  }
}
