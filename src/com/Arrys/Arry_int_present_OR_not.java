package com.Arrys;

import java.util.Scanner;

public class Arry_int_present_OR_not {
    public static void main(String[] args) {
        int[] A = {22, 33, 44, 55, 66, 77, 88};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a integer: ");
        int B = sc.nextInt();
        boolean isinarry = false;
        for (int element : A) {
            if (B == element) {
                isinarry = true;
                break;

            }
        }
        if (isinarry) {
            System.out.println("the number is present in the arry");
        } else {
            System.out.println("the number is not present in the arry");
        }


    }
}