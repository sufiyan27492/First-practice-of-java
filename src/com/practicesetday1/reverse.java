package com.practicesetday1;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        int rev = 0;
        while(n != 0){
            int digit = n % 10;
            n = n / 10;
            rev = rev * 10 + digit;

        }
        System.out.println("Reversed number is: "+rev);
    }

}
