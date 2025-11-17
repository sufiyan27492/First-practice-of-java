package com.practicesetday2.ch1intro.ch1intro;
import java.util.Scanner;
public class cgpaof5sub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter paper 1 mark: ");
        float marks1 = sc.nextFloat();
        while(marks1> 100 || marks1 < 0 ){
            System.out.println("you enter wrong marks enter again: ");
            marks1 = sc.nextFloat();
        }
        System.out.println("enter paper 2 marks: ");
        float marks2 = sc.nextFloat();

        while(marks2 > 100 || marks2 < 0 ){
            System.out.println("you enter wrong marks enter again: ");
            marks2 = sc.nextFloat();
        }
        System.out.println("enter paper 3 marks: ");
        float marks3 = sc.nextFloat();

        while(marks3 > 100 || marks3 < 0 ){
            System.out.println("you enter wrong marks enter again: ");
            marks3 = sc.nextFloat();
        }
        System.out.println("enter paper 4 marks: ");
        float marks4 = sc.nextFloat();

       while(marks4 > 100 || marks4 < 0 ){
            System.out.println("you enter wrong marks enter again: ");
            marks4 = sc.nextFloat();
        }
        System.out.println("enter paper 5 marks: ");
        float marks5 = sc.nextFloat();

        while(marks5 > 100 || marks5 < 0 ){
            System.out.println("you enter wrong marks enter again: ");
            marks5 = sc.nextFloat();
        }
        float sum = marks1+marks2+marks3+marks4+marks5;
        float percentage = (sum/500) * 100;
        float cgpa = percentage / 9.5f;

        System.out.printf("the cgpa is: %.2f\n ",cgpa);
        sc.close();
    }

    }



   /* package com.practicesetday2.ch1intro.ch1intro;
import java.util.Scanner;

public class cgpaof5sub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter paper 1 mark: ");
        while (!sc.hasNextFloat()) {
            System.out.println("❌ Invalid input. Enter a number: ");
            sc.next();
        }
        float marks1 = sc.nextFloat();
        while (marks1 > 100 || marks1 < 0) {
            System.out.println("you enter wrong marks enter again: ");
            while (!sc.hasNextFloat()) {
                System.out.println("❌ Invalid input. Enter a number: ");
                sc.next();
            }
            marks1 = sc.nextFloat();
        }

        System.out.println("enter paper 2 marks: ");
        while (!sc.hasNextFloat()) {
            System.out.println("❌ Invalid input. Enter a number: ");
            sc.next();
        }
        float marks2 = sc.nextFloat();
        while (marks2 > 100 || marks2 < 0) {
            System.out.println("you enter wrong marks enter again: ");
            while (!sc.hasNextFloat()) {
                System.out.println("❌ Invalid input. Enter a number: ");
                sc.next();
            }
            marks2 = sc.nextFloat();
        }

        System.out.println("enter paper 3 marks: ");
        while (!sc.hasNextFloat()) {
            System.out.println("❌ Invalid input. Enter a number: ");
            sc.next();
        }
        float marks3 = sc.nextFloat();
        while (marks3 > 100 || marks3 < 0) {
            System.out.println("you enter wrong marks enter again: ");
            while (!sc.hasNextFloat()) {
                System.out.println("❌ Invalid input. Enter a number: ");
                sc.next();
            }
            marks3 = sc.nextFloat();
        }

        System.out.println("enter paper 4 marks: ");
        while (!sc.hasNextFloat()) {
            System.out.println("❌ Invalid input. Enter a number: ");
            sc.next();
        }
        float marks4 = sc.nextFloat();
        while (marks4 > 100 || marks4 < 0) {
            System.out.println("you enter wrong marks enter again: ");
            while (!sc.hasNextFloat()) {
                System.out.println("❌ Invalid input. Enter a number: ");
                sc.next();
            }
            marks4 = sc.nextFloat();
        }

        System.out.println("enter paper 5 marks: ");
        while (!sc.hasNextFloat()) {
            System.out.println("❌ Invalid input. Enter a number: ");
            sc.next();
        }
        float marks5 = sc.nextFloat();
        while (marks5 > 100 || marks5 < 0) {
            System.out.println("you enter wrong marks enter again: ");
            while (!sc.hasNextFloat()) {
                System.out.println("❌ Invalid input. Enter a number: ");
                sc.next();
            }
            marks5 = sc.nextFloat();
        }

        float sum = marks1 + marks2 + marks3 + marks4 + marks5;
        float percentage = (sum / 500) * 100;
        float cgpa = percentage / 9.5f;

        System.out.printf("the cgpa is: %.2f\n", cgpa);
        sc.close();
    }
}
*/