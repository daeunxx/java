package network.tcp.v1;

import static util.MyLogger.log;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerV1 {

  private static final int PORT = 12345;

  public static void main(String[] args) throws IOException {
    log("서버 시작");
    ServerSocket serverSocket = new ServerSocket(PORT);

    log("서버 소켓 시작 - 리스닝 포트: " + PORT);

    Socket socket = serverSocket.accept();
    log("소켓 연결: " + socket);

    DataInputStream inputStream = new DataInputStream(socket.getInputStream());
    DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

    // 클라이언트로부터 문자 받기
    String received = inputStream.readUTF();
    log("client -> server: " + received);

    String toSend = received + " World!";
    outputStream.writeUTF(toSend);
    log("client <- server: " + toSend);

    log("연결 종료: " + socket);
    inputStream.close();
    outputStream.close();
    socket.close();
    serverSocket.close();
  }
}
