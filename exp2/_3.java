/**
 * experiment 2 (c)
 * aditya yadav - cmpnb
 * adityadav1809@student.sfit.ac.in
 */

import java.util.Scanner;

public class _3 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.printf("enter number: ");
    int number = s.nextInt();
    int i = 1;
    s.close();
    while (i <= 20) {
      System.out.printf("%d * %d = %d\n", number, i, number * i);
      i++;
    }
  }
}
