/**
 * experiment 4 (a)
 * Rectangle class
 * aditya yadav - cmpnb
 * adityadav1809@student.sfit.ac.in
 */

public class Rectangle {
  public double length, width;

  Rectangle() {
    length = 10;
    width = 5;
  }

  Rectangle(double l) {
    length = l;
    width = 5;
  }

  Rectangle(double l, double w) {
    length = l;
    width = w;
  }

  public double area() {
    return length * width;
  }
}
