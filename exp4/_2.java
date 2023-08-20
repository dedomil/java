/**
 * experiment 4 (b)
 * aditya yadav - cmpnb
 * adityadav1809@student.sfit.ac.in
 */

public class _2 {
  public static void show(Box b) {
    System.out.println(b.color);
  }

  public static void show(Mobile m) {
    System.out.println(m.brand);
  }

  public static void show(Table t) {
    System.out.println(t.weight);
  }

  public static void main(String[] args) {
    show((new Box("Blue")));
    show((new Mobile("Moto")));
    show((new Table(2.56)));
  }
}
