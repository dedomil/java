/**
 * experiment 6 (a)
 * BubbleSort class
 * aditya yadav - cmpnb
 * adityadav1809@student.sfit.ac.in
 */

import java.util.Scanner;

public class BubbleSort {
  public int array[] = new int[10];

  public void input() {
    Scanner s = new Scanner(System.in);
    for (int i = 0; i < array.length; i++) {
      System.out.printf("enter %d element: ", i + 1);
      array[i] = s.nextInt();
    }
    s.close();
  }

  public void display() {
    for (int i = 0; i < array.length; i++) {
      System.out.printf("%d  ", array[i]);
    }
    System.out.println();
  }

  // overloaded display function to display passed arrays
  public void display(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.printf("%d  ", array[i]);
    }
    System.out.println();
  }

  // passing array because java needs reference object to change values
  private void swap(int[] array, int i1, int i2) {
    int temp = array[i1];
    array[i1] = array[i2];
    array[i2] = temp;
  }

  public int[] sortAsc() {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length - 1; j++) {
        if (array[j] > array[j + 1]) {
          swap(array, j, j + 1);
        }
      }
    }
    return array;
  }

  public int[] sortDesc() {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length - 1; j++) {
        if (array[j] < array[j + 1]) {
          swap(array, j, j + 1);
        }
      }
    }
    return array;
  }
}
