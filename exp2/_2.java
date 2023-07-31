/**
 * experiment 1 (b)
 * aditya yadav - cmpnb
 * adityadav1809@student.sfit.ac.in
 */

import java.util.Scanner;

public class _2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.printf("enter number: ");
        int number = s.nextInt();
        s.close();
        int copy = number;
        int sum = 0;
        int rem;
        do {
            rem = number % 10;
            sum = sum + rem * rem * rem;
            number = number / 10;
        } while (number != 0);
        // check armstrong is not with copied number
        if (sum == copy) {
            System.out.printf(copy + " is armstrong");
        } else {
            System.out.printf(copy + " is not armstrong");
        }
    }
}
