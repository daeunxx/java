package io.file;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public class NewFilesMain {

  public static void main(String[] args) throws IOException {
    Path file = Path.of("temp/example.txt");
    Path directory = Path.of("temp/exampleDir");

    System.out.println("File exists: " + Files.exists(file));

    try {
      Files.createFile(file);
      System.out.println("File created");
    } catch (FileAlreadyExistsException e) {
      System.out.println(file + " File already exists");
    }

    try {
      Files.createDirectory(directory);
      System.out.println("Directory created");
    } catch (FileAlreadyExistsException e) {
      System.out.println(directory + " Directory already exists");
    }

    //Files.delete(file);
    //System.out.println("File deleted");

    System.out.println("Is regular file: " + Files.isRegularFile(file));
    System.out.println("Is directory: " + Files.isDirectory(directory));

    System.out.println("File name: " + file.getFileName());
    System.out.println("File size: " + Files.size(file) + " bytes");

    Path newFile = Path.of("temp/newExample.txt");
    Files.move(file, newFile, StandardCopyOption.REPLACE_EXISTING);
    System.out.println("File moved");

    System.out.println("Last modified: " + Files.getLastModifiedTime(newFile));

    BasicFileAttributes attributes = Files.readAttributes(newFile, BasicFileAttributes.class);
    System.out.println("== Attributes read ==");
    System.out.println("Creation time: " + attributes.creationTime());
    System.out.println("Is directory: " + attributes.isDirectory());
    System.out.println("Is regular file: " + attributes.isRegularFile());
    System.out.println("Is SymbolicLink: " + attributes.isSymbolicLink());
    System.out.println("Size: " + attributes.size());
  }
}