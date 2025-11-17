package com.practice_set_day_4.ch4ifelse;

import java.util.Scanner;

public class student_pass_or_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your sub 1 marks: ");
        int sub1 = sc.nextInt();
        System.out.println("enter your sub 2 marks: ");
        int sub2 = sc.nextInt();
        System.out.println("enter your sub 3 marks: ");
        int sub3 = sc.nextInt();
        int marks = sub1 + sub2 + sub3;
        float percentage = marks / 120f * 100;
        System.out.println("your percentage is: "+percentage);
        if (percentage >= 40 && sub1>=33 && sub2>=33 && sub3>=33) {
            System.out.println("you are pass congractulation:");
        }else {
            System.out.println("batter luck next time:");
        }
    }
}
