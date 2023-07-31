/**
 * experiment 2 (d)
 * aditya yadav - cmpnb
 * adityadav1809@student.sfit.ac.in
 */

import java.util.Scanner;

public class _4 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.printf("enter number: ");
    int number = s.nextInt();
    s.close();
    for (int i = 1; i <= number; i++) {
      for (int j = i; j <= number; j++) {
        System.out.printf("%d ", number - j + 1);
      }
      System.out.printf("\n");
    }
  }
}
