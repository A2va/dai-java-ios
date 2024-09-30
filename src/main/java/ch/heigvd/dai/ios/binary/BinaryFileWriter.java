package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Writable;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * A class that writes binary files. This implementation writes the file byte per byte. It manages
 * the file output stream properly with a try-catch-finally block.
 */
public class BinaryFileWriter implements Writable {

  @Override
  public void write(String filename, int sizeInBytes) {
    try (FileOutputStream writer = new FileOutputStream(filename);) {
      byte[] buff = new byte[sizeInBytes];
      writer.write(buff);
      writer.flush();
    } catch (IOException e) {
      System.out.println("Exception: " + e);
    }
  }
}
