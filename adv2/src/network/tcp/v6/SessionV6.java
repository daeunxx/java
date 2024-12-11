package network.tcp.v6;

import static network.tcp.SocketCloseUtil.closeAll;
import static util.MyLogger.log;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class SessionV6 implements Runnable {

  private final Socket socket;
  private final DataInputStream inputStream;
  private final DataOutputStream outputStream;
  private final SessionManagerV6 sessionManager;
  private boolean closed = false;

  public SessionV6(Socket socket, SessionManagerV6 sessionManager) throws IOException {
    this.socket = socket;
    this.inputStream = new DataInputStream(socket.getInputStream());
    this.outputStream = new DataOutputStream(socket.getOutputStream());
    this.sessionManager = sessionManager;
    this.sessionManager.add(this);
  }

  @Override
  public void run() {
    try {
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
      sessionManager.remove(this);
      close();
    }
  }

  // 세션 종료와 서버 종료가 동시에 될 경우, 동시 호출 가능
  // 두 번 호출도 가능
  public synchronized void close() {
    if (closed) {
      return;
    }
    closeAll(socket, inputStream, outputStream);
    closed = true;
    log("연결 종료: " + socket + "isClosed: " + socket.isClosed());
  }
}
