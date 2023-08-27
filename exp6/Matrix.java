/**
 * experiment 6 (b)
 * Matrix class
 * aditya yadav - cmpnb
 * adityadav1809@student.sfit.ac.in
 */

import java.util.Scanner;

public class Matrix {
  public int array[][], order;

  public void input() {
    Scanner s = new Scanner(System.in);
    System.out.printf("enter order of matrix: ");
    order = s.nextInt();
    array = new int[order][order];
    for (int i = 0; i < order; i++) {
      for (int j = 0; j < order; j++) {
        System.out.printf("enter matrix[%d][%d] element: ", i + 1, j + 1);
        array[i][j] = s.nextInt();
      }
    }
    s.close();
  }

  public void display() {
    for (int i = 0; i < order; i++) {
      for (int j = 0; j < order; j++) {
        System.out.printf("matrix[%d][%d]: %d\n", i + 1, j + 1, array[i][j]);
      }
    }
  }

  public boolean isSymmetric() {
    boolean flag = true;
    for (int i = 0; i < order; i++) {
      for (int j = 0; j < order; j++) {
        if (array[i][j] != array[j][i]) {
          flag = false;
          break;
        }
      }
    }
    return flag;
  }
}
