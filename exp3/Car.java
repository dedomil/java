/**
 * experiment 3 (a)
 * Car class
 * aditya yadav - cmpnb
 * adityadav1809@student.sfit.ac.in
 */

import java.util.Scanner;

public class Car {
  public String brand;
  public String name;
  public double price;

  public void input() {
    Scanner s = new Scanner(System.in);
    System.out.printf("enter brand name: ");
    brand = s.nextLine();
    System.out.printf("enter car name: ");
    name = s.nextLine();
    System.out.printf("enter price of car: ");
    price = s.nextDouble();
    s.close();
  }

  public void display() {
    System.out.println("brand name: " + brand + "\ncar name: " + name + "\nprice: " + price);
  }
}
