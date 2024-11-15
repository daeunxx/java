package network.chat.client;

import static network.tcp.SocketCloseUtil.closeAll;
import static util.MyLogger.log;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

  private final String host;
  private final int port;
  private final Socket socket;
  private final DataInputStream dataInputStream;
  private final DataOutputStream dataOutputStream;
  private final ReadHandler readHandler;
  private final WriteHandler writeHandler;
  private boolean closed = false;

  public Client(String host, int port) throws IOException {
    this.host = host;
    this.port = port;

    this.socket = new Socket(this.host, this.port);
    this.dataInputStream = new DataInputStream(this.socket.getInputStream());
    this.dataOutputStream = new DataOutputStream(this.socket.getOutputStream());

    this.readHandler = new ReadHandler(dataInputStream, this);
    this.writeHandler = new WriteHandler(dataOutputStream, this);
  }

  public void start() throws IOException {
    log("클라이언트 시작");
    Thread readThread = new Thread(readHandler, "readThread");
    Thread writeThread = new Thread(writeHandler, "writeThread");
    readThread.start();
    writeThread.start();
  }

  public void close() {
    if (closed) {
      return;
    }
    readHandler.close();
    writeHandler.close();
    closeAll(socket, dataInputStream, dataOutputStream);
    closed = true;
    log("클라이언트 연결 종료");
  }
}
