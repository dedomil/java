/**
 * experiment 2 (a)
 * aditya yadav - cmpnb
 * adityadav1809@student.sfit.ac.in
 */

import java.util.Scanner;

public class _1 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.printf("enter marks in physics: ");
    int physics = s.nextInt();
    System.out.printf("enter marks in chemistry: ");
    int chemistry = s.nextInt();
    System.out.printf("enter marks in maths: ");
    int maths = s.nextInt();
    s.close();
    int pc = (physics + chemistry + maths) / 3;
    // marks checking condition's
    if (pc >= 75) {
      System.out.println("distinction");
    } else if (pc >= 60 && pc < 75) {
      System.out.println("first class");
    } else if (pc >= 50 && pc < 60) {
      System.out.println("second class");
    } else if (pc >= 40 && pc < 50) {
      System.out.println("pass");
    } else if (pc < 40) {
      System.out.println("fail");
    }
  }
}
