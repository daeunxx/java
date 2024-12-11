package io.file.text;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class RealTextFileV3 {

  private static final String PATH = "temp/hello2.txt";

  public static void main(String[] args) throws IOException {
    String writeString = "abc\n가나다";
    System.out.println("== Write String ==");
    System.out.println(writeString);

    Path path = Path.of(PATH);

    // 파일에 쓰기
    Files.writeString(path, writeString, UTF_8);

    System.out.println("== Read String ==");
    Stream<String> lineStream = Files.lines(path, UTF_8);
    lineStream.forEach(System.out::println);
    lineStream.close();
  }
}