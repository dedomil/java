import java.io.*;

public class _3 {
  public static void main(String args[]) throws Exception {
    InputStreamReader r = new InputStreamReader(System.in);
    BufferedReader b = new BufferedReader(r);
    System.out.printf("enter your name: ");
    String name = b.readLine();
    System.out.println("your name is " + name);
  }
}
