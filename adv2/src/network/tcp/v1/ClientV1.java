package network.tcp.v1;

import static util.MyLogger.log;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientV1 {

  private static final int PORT = 12345;

  public static void main(String[] args) throws IOException {
    log("클라이언트 시작");

    Socket socket = new Socket("localhost", PORT);
    DataInputStream inputStream = new DataInputStream(socket.getInputStream());
    DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

    log("소켓 연결: " + socket);

    // 서버에게 문자 전송
    String toSend = "Hello";
    outputStream.writeUTF(toSend);
    log("client -> server: " + toSend);

    // 서버로부터 문자 받기
    String received = inputStream.readUTF();
    log("server -> client: " + received);

    log("연결 종료: " + socket);
    inputStream.close();
    outputStream.close();
    socket.close();
  }
}
