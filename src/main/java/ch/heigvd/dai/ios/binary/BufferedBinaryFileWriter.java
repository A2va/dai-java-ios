package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Writable;

import java.io.*;

/**
 * A class that writes binary files. This implementation writes the file using a buffered output
 * stream. It manages the file output stream properly with a try-with-resources block.
 */
public class BufferedBinaryFileWriter implements Writable {

  @Override
  public void write(String filename, int sizeInBytes) {
    try (BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(filename));) {
      byte[] buff = new byte[sizeInBytes];
      writer.write(buff);
      writer.flush();
    } catch (IOException e) {
      System.out.println("Exception: " + e);
    }
  }
}
