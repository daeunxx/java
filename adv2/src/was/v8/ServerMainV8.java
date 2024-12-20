package was.v8;

import java.io.IOException;
import java.util.List;
import was.httpserver.HttpServer;
import was.httpserver.ServletManager;
import was.httpserver.servlet.annotation.AnnotationServletV3;

public class ServerMainV8 {

  private static final int PORT = 12345;

  public static void main(String[] args) throws IOException {
    ServletManager servletManager = new ServletManager();
    //servletManager.setDefaultServlet(new AnnotationServletV2(List.of(new SiteControllerV8())));
    servletManager.setDefaultServlet(new AnnotationServletV3(List.of(new SiteControllerV8())));

    HttpServer httpServer = new HttpServer(PORT, servletManager);
    httpServer.start();
  }
}
