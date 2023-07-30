/**
 * experiment 1 (b)
 * aditya yadav - cmpnb
 * adityadav1809@student.sfit.ac.in
 */

import java.util.Scanner;

public class _2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("enter your name: ");
    String name = sc.nextLine();
    System.out.printf("enter your roll no: ");
    int rno = sc.nextInt();
    System.out.printf("enter your marks: ");
    float marks = sc.nextFloat();
    sc.close();
    System.out.println("name " + name + "\nroll no: " + rno + "\nmarks: " + marks);
  }
}
