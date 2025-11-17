package com.practicesetday2.ch1intro.ch2opratorandprecedence;
import java.util.Scanner;
public class comparissionoptGorNOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        float num = sc.nextFloat();
        int N = 100;
        if (num == N) {
            System.out.println("number is exactly same: ");
        }else if (num < N) {
            System.out.println("number is less then exact number: ");
        }else {
            System.out.println("number is grater then exact number: ");
        }
        }
    }
