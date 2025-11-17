package com.practicesetday1;
import java.util.Scanner;
public class factorilaofN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num : ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1 ; i<=n ; i++){
            fact = fact * i;
        }
        System.out.println( "factorial of " + n + " is : "+ fact);

        sc.close();
    }


}
