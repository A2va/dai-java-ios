package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Readable;
import java.io.*;

/**
 * A class that reads binary files. This implementation reads the file byte per byte. It manages the
 * file input stream properly with a try-catch-finally block.
 */
public class BinaryFileReader implements Readable {

  @Override
  public void read(String filename) {
    try (FileInputStream reader = new FileInputStream(filename);) {
      reader.read();
    } catch (IOException e) {
      System.out.println("Exception: " + e);
    }
  }
}
