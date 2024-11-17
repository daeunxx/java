package network.chat.server;

import static network.tcp.SocketCloseUtil.closeAll;
import static util.MyLogger.log;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Session implements Runnable {

  private final SessionManager sessionManager;
  private final Socket socket;
  private final DataInputStream inputStream;
  private final DataOutputStream outputStream;
  private final CommandManager commandManager;

  private boolean closed = false;

  private String username;

  public Session(SessionManager sessionManager, Socket socket) throws IOException {
    this.sessionManager = sessionManager;
    this.commandManager = new CommandManager(sessionManager);
    sessionManager.add(this);
    this.socket = socket;
    this.inputStream = new DataInputStream(socket.getInputStream());
    this.outputStream = new DataOutputStream(socket.getOutputStream());
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public void run() {
    try {
      while (true) {
        String received = inputStream.readUTF();
        log("client -> server: " + received);

        commandManager.execute(received, this);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      sessionManager.remove(this);
      sessionManager.sendAll(this.username + " 님이 퇴장하셨습니다.");
      close();
    }
  }

  public void sendMessage(String message) throws IOException {
    outputStream.writeUTF(message);
    log("client <- server: " + message);
  }

  public synchronized void close() {
    if (closed) {
      return;
    }
    closeAll(socket, inputStream, outputStream);
    closed = true;
    log("연결 종료: " + socket + "isClosed: " + socket.isClosed());
  }
}
