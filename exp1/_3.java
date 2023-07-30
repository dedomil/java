/**
 * experiment 1 (c)
 * aditya yadav - cmpnb
 * adityadav1809@student.sfit.ac.in
 */

import java.io.*;

public class _3 {
  public static void main(String args[]) throws Exception {
    InputStreamReader r = new InputStreamReader(System.in);
    BufferedReader b = new BufferedReader(r);
    System.out.printf("enter your name: ");
    String name = b.readLine();
    System.out.printf("enter your roll no: ");
    String rno = b.readLine();
    System.out.printf("enter your marks: ");
    String marks = b.readLine();
    System.out.println("name " + name + "\nroll no: " + rno + "\nmarks: " + marks);
  }
}
