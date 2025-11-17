package com.practice_set_day_4.ch4ifelse;
import java.util.Scanner;
public class Which_angled_triangle {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int max = Math.max(A, Math.max(B, C));

        int sumSquare = A * A + B * B + C * C;
        int twicemaxsquare = 2 * (max * max);
        if (twicemaxsquare < sumSquare) {
            System.out.println(1);
        } else if (twicemaxsquare == sumSquare) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }

}

