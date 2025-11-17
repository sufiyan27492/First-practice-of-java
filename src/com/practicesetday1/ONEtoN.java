package com.practicesetday1;
import java.util.Scanner;
public class ONEtoN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = sc.nextInt();
        for(int i = 1; i<=num;i++){
           //System.out.println("number is : " + i);
           System.out.print(i+ " ");
        }
     }
}
