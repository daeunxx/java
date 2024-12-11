package was.v5.servlet;

import java.io.IOException;
import was.httpserver.HttpRequest;
import was.httpserver.HttpResponse;
import was.httpserver.HttpServlet;

public class HomeServlet implements HttpServlet {

  @Override
  public void service(HttpRequest request, HttpResponse response) throws IOException {
    // 원칙적으로는 Content-Length 계산해야 하지만 생략함
    response.writeBody("<h1>home</h1>");
    response.writeBody("<ul>");
    response.writeBody("<li><a href='/site1'>site1</a></li>");
    response.writeBody("<li><a href='/site2'>site2</a></li>");
    response.writeBody("<li><a href='/search?q=hello'>검색</a></li>");
    response.writeBody("</ul>");
  }
}
