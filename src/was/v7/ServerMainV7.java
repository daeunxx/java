package was.v7;

import java.io.IOException;
import java.util.List;
import was.httpserver.HttpServer;
import was.httpserver.ServletManager;
import was.httpserver.servlet.annotation.AnnotationServletV1;

public class ServerMainV7 {

  private static final int PORT = 12345;

  public static void main(String[] args) throws IOException {
    ServletManager servletManager = new ServletManager();
    servletManager.setDefaultServlet(new AnnotationServletV1(List.of(new SiteControllerV7())));

    HttpServer httpServer = new HttpServer(PORT, servletManager);
    httpServer.start();
  }
}
