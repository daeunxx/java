package network.chat.server;

import static util.MyLogger.log;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

  private final String host;
  private final int port;
  private int sessionSize = 0;

  public Server(String host, int port) {
    this.host = host;
    this.port = port;
  }

  public void run() throws IOException {
    log("서버 시작");
    ServerSocket serverSocket = new ServerSocket(this.port);
    SessionManager sessionManager = new SessionManager();

    log("서버 소켓 시작 - 리스닝 포트: " + this.port);
    addShutdownHoot(serverSocket, sessionManager);

    try {
      while (true) {
        Socket socket = serverSocket.accept();
        log("소켓 연결: " + socket);

        Session session = new Session(sessionManager, socket);
        Thread thread = new Thread(session, ("session" + ++sessionSize));
        thread.start();
      }
    } catch (IOException e) {
      log("서버 소켓 종료: " + e);
    }
  }

  public void addShutdownHoot(ServerSocket serverSocket, SessionManager sessionManager) {
    ShutdownHook shutdownHook = new ShutdownHook(serverSocket, sessionManager);
    Runtime.getRuntime().addShutdownHook(new Thread(shutdownHook, "shutdown"));
  }

  static class ShutdownHook implements Runnable {

    private final ServerSocket serverSocket;
    private final SessionManager sessionManager;

    public ShutdownHook(ServerSocket serverSocket, SessionManager sessionManager) {
      this.serverSocket = serverSocket;
      this.sessionManager = sessionManager;
    }

    @Override
    public void run() {
      log("ShutdownHook 실행");

      try {
        sessionManager.closeAll();
        serverSocket.close();

        Thread.sleep(1000);
      } catch (IOException | InterruptedException e) {
        log(e);
      }
    }
  }
}
