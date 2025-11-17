package com.practice_set_day_4.ch4ifelse;

import java.util.Scanner;

public class calculate_tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your income: ");
        float income = sc.nextFloat();
        double tax;
        if (income == 250000) {
            System.out.println("no tax applied on you");
        } else if (income <= 500000) {
            tax = 0.05 * (income - 250000);
            System.out.println("you are need to pay tax: "+tax);
        }
    }
}
