package com.practicesetday2.ch1intro.ch1intro;
import java.util.Scanner;
public class INTorNOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        boolean a = sc.hasNextInt();
        if (a) {
            System.out.println("it is integer: " + a);
        } else {
            System.out.println("not a  integer: " + a);
        }
    }
}
