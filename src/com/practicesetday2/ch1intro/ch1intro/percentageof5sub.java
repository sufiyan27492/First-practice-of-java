package com.practicesetday2.ch1intro.ch1intro;
import java.util.Scanner;
public class percentageof5sub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sub 1 marks: ");
        float marks1 = sc.nextFloat();
        while (marks1 > 100 || marks1 < 0){
            System.out.println("you enter wrong marks: ");
             marks1 = sc.nextFloat();
        }
        System.out.println("enter sub 2 marks: ");
        float marks2 = sc.nextFloat();
        while (marks2 > 100 || marks2 < 0 ){
            System.out.println("you enter wrong marks: ");
            marks2 = sc.nextFloat();
        }
        System.out.println("enter sub 3 marks: ");
        float marks3 = sc.nextFloat();
        while (marks3 > 100 || marks3 < 0){
            System.out.println("you enter wrong marks: ");
            marks3 = sc.nextFloat();
        }
        System.out.println("enter sub 4 marks: ");
        float marks4 = sc.nextFloat();
        while (marks4 > 100 || marks4 < 0){
            System.out.println("you enter wrong marks: ");
            marks4 = sc.nextFloat();
        }
        System.out.println("enter sub 5 marks : ");
        float marks5 = sc.nextFloat();
        while (marks5 > 100 || marks5 < 0){
            System.out.println("you enter wrong marks: ");
            marks5 = sc.nextFloat();
        }
            float marks = marks1+marks2+marks3+marks4+marks5;
            float percentage = (marks/500) * 100;
        System.out.printf("your percentage is: %.2f%%\n",percentage);
        sc.close();

    }
}
