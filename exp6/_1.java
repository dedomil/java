/**
 * experiment 6 (a)
 * aditya yadav - cmpnb
 * adityadav1809@student.sfit.ac.in
 */

public class _1 {
  public static void main(String[] args) {
    BubbleSort b = new BubbleSort();
    b.input();
    b.display();
    System.out.println("ascending sorted array");
    b.display(b.sortAsc());
    System.out.println("descending sorted array");
    b.display(b.sortDesc());
  }
}
