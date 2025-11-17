package com.practicesetday2.ch1intro.ch2opratorandprecedence;
import java.util.Scanner;
public class numbgessinggame {
    public static void main(String[] args) {
        int target = 786;
        Scanner sc = new Scanner(System.in);
        boolean firsttry = true;
        while (true ) {
            if (firsttry) {
                System.out.println("enter your guess: ");
                firsttry = false;
            }else{
                System.out.println("opps! try again: ");
            }
            int guess = sc.nextInt();

        if (guess == target) {
            System.out.println("number is correct: ");
                break;
            }else if(guess < target){
                    System.out.println("number is less: ");
                }else {
            System.out.println("number is grater: ");
        }

        }sc.close();
    }

}


