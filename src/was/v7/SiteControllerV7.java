package was.v7;

import was.httpserver.HttpRequest;
import was.httpserver.HttpResponse;
import was.httpserver.servlet.annotation.Mapping;

public class SiteControllerV7 {

  @Mapping("/")
  public void home(HttpRequest request, HttpResponse response) {
    response.writeBody("<h1>home</h1>");
    response.writeBody("<ul>");
    response.writeBody("<li><a href='/site1'>site1</a></li>");
    response.writeBody("<li><a href='/site2'>site2</a></li>");
    response.writeBody("<li><a href='/search?q=hello'>검색</a></li>");
    response.writeBody("</ul>");
  }

  @Mapping("/search")
  public void search(HttpRequest request, HttpResponse response) {
    String query = request.getParameter("q");
    response.writeBody("<h1>search</h1>");
    response.writeBody("<li>query: " + query + "</li>");
  }

  @Mapping("/site1")
  public void site1(HttpRequest request, HttpResponse response) {
    response.writeBody("<h1>site1</h1>");
  }

  @Mapping("/site2")
  public void site2(HttpRequest request, HttpResponse response) {
    response.writeBody("<h1>site2</h1>");
  }

  @Mapping("/favicon.ico")
  public void favicon(HttpRequest request, HttpResponse response) {
  }
}
