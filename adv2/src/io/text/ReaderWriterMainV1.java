package io.text;

import static io.text.TextConst.FILE_NAME;
import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ReaderWriterMainV1 {

  public static void main(String[] args) throws IOException {
    String writeString = "ABC";

    // 문자 -> byte: UTF-8 인코딩
    byte[] writeBytes = writeString.getBytes(UTF_8);
    System.out.println("write String: " + writeString);
    System.out.println("write bytes: " + Arrays.toString(writeBytes));

    FileOutputStream fos = new FileOutputStream(FILE_NAME);
    fos.write(writeBytes);
    fos.close();

    FileInputStream fis = new FileInputStream(FILE_NAME);
    byte[] readBytes = fis.readAllBytes();
    fis.close();

    String readString = new String(readBytes, UTF_8);
    System.out.println("read bytes: " + Arrays.toString(readBytes));
    System.out.println("read String: " + readString);
  }
}