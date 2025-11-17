package com.practicesetday1;
import java.util.Scanner;
public class ODDorEVEN {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number: ");
    int i = sc.nextInt();
    if (i % 2 == 0) {
        System.out.println("the number is even: " + i);
    }
        else{
            System.out.println("the number is odd: "+ i);
        }
        sc.close();
    }
    }

