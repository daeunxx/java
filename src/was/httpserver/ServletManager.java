package was.httpserver;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import was.httpserver.servlet.DefaultServlet;
import was.httpserver.servlet.InternalErrorServlet;
import was.httpserver.servlet.NotFoundServlet;

public class ServletManager {

  private final Map<String, HttpServlet> servlets = new HashMap<>();
  private HttpServlet notFoundServlet = new NotFoundServlet();
  private HttpServlet internalErrorServlet = new InternalErrorServlet();

  public void add(String path, HttpServlet servlet) {
    servlets.put(path, servlet);
  }

  public void setNotFoundServlet(HttpServlet notFoundServlet) {
    this.notFoundServlet = notFoundServlet;
  }

  public void setInternalErrorServlet(HttpServlet internalErrorServlet) {
    this.internalErrorServlet = internalErrorServlet;
  }

  public void execute(HttpRequest request, HttpResponse response) throws IOException {
    try {
      HttpServlet servlet = servlets.getOrDefault(request.getPath(), new DefaultServlet());
      servlet.service(request, response);
    } catch (PageNotFoundException e) {
      e.printStackTrace();
      notFoundServlet.service(request, response);
    } catch(Exception e) {
      e.printStackTrace();
      internalErrorServlet.service(request, response);
    }
  }
}
