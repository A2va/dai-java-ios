package ch.heigvd.dai.ios.text;

import ch.heigvd.dai.ios.Writable;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * A class that writes text files. This implementation write the file byte per byte. It manages the
 * file writer properly with a try-catch-finally block.
 */
public class TextFileWriter implements Writable {

  @Override
  public void write(String filename, int sizeInBytes) {
    try (FileWriter writer = new FileWriter(filename, StandardCharsets.UTF_8);) {
      char[] cbuff = new char[sizeInBytes / 2];
      writer.write(cbuff);
    } catch (IOException e) {
      System.out.println("Exception: " + e);
    }
  }
}
