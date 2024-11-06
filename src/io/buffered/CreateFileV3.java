package io.buffered;

import static io.buffered.BufferedConst.BUFFER_SIZE;
import static io.buffered.BufferedConst.FILE_NAME;
import static io.buffered.BufferedConst.FILE_SIZE;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFileV3 {

  public static void main(String[] args) throws IOException {
    FileOutputStream fos = new FileOutputStream(FILE_NAME);
    BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER_SIZE);
    long startTime = System.currentTimeMillis();

    for (int i = 0; i < FILE_SIZE; i++) {
      bos.write(1);
    }
    bos.close();

    // BufferedOutputStream 을 close 하지 않고 FileOutputStream 만 직접 닫을 경우, bos.flush()가 호출되지 않아 남은 자원 저장 실패
    //fos.close();

    long endTime = System.currentTimeMillis();
    System.out.println("File created: " + FILE_NAME);
    System.out.println("File size: " + FILE_SIZE / 1024 / 1024 + "MB");
    System.out.println("Time taken: " + (endTime - startTime) + "ms");
  }
}
