import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.security.MessageDigest;

import sun.misc.BASE64Encoder;

public class MainClass {
  public static void main(String[] args) throws Exception {
    MessageDigest md = MessageDigest.getInstance("MD5");
    BufferedInputStream in = new BufferedInputStream(new FileInputStream("inputfile.txt"));

    int theByte = 0;
    while ((theByte = in.read()) != -1) {
      md.update((byte) theByte);
    }
    in.close();

    byte[] theDigest = md.digest();

    System.out.println(new BASE64Encoder().encode(theDigest));
  }
}
