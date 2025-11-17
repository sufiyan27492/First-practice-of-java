package com.practicesetday2.ch1intro.ch2opratorandprecedence;
import java.util.Scanner;
public class encrypt_decrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your grade: ");
        char grade = sc.next().charAt(0);
        // // Encrypt by adding 8, Decrypt by subtracting 8
        char encryptgrade = (char)(grade + 8);
        System.out.println("your encrypt grade is: "+encryptgrade);

        char decryptgrade = (char)(encryptgrade - 8);
        System.out.println("your orignal grade is: "+decryptgrade);

    }
}
