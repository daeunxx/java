package was.httpserver.servlet.annotation;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import was.httpserver.HttpRequest;
import was.httpserver.HttpResponse;
import was.httpserver.HttpServlet;
import was.httpserver.PageNotFoundException;
import was.v7.SiteControllerV7;

public class AnnotationServletV1 implements HttpServlet {

  private final List<Object> controllers;

  public AnnotationServletV1(List<Object> controllers) {
    this.controllers = controllers;
  }

  @Override
  public void service(HttpRequest request, HttpResponse response) throws IOException {
    String path = request.getPath();

    for (Object controller : controllers) {
      Method[] methods = controller.getClass().getDeclaredMethods();
      for (Method method : methods) {
        Mapping annotation = method.getAnnotation(Mapping.class);
        if (annotation != null && annotation.value().equals(path)) {
          invoke(new SiteControllerV7(), method, request, response);
          return;
        }
      }
    }
    throw new PageNotFoundException("request = " + path);
  }

  private static void invoke(Object controller, Method method, HttpRequest request,
      HttpResponse response) {
    try {
      method.invoke(controller, request, response);
    } catch (IllegalAccessException | InvocationTargetException e) {
      throw new RuntimeException(e);
    }
  }
}