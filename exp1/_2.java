import java.util.Scanner;

public class _2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("enter your name: ");
    String name = sc.nextLine();
    sc.close();
    System.out.println("your name is " + name);
  }
}
