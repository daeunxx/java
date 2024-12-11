package io.start;

import static java.nio.charset.StandardCharsets.*;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamMain {

  public static void main(String[] args) throws IOException {
    PrintStream printStream = System.out;

    byte[] bytes = "Hello World!\n".getBytes(UTF_8);
    printStream.write(bytes);
    printStream.println("Print");
  }
}