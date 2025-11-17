package com.practice_set_day_4.ch4ifelse;

import java.util.Scanner;

public class GST_calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float purchase = sc.nextFloat();
        float amount;
        if (purchase <= 5000){
            amount = purchase * 0.18f;
            System.out.printf("%.3f" ,amount);
        }else if (purchase > 5000 && purchase <= 10000){
            amount = purchase * 0.20f;
            System.out.printf("%.3f" ,amount);
        }else if (purchase > 10000 && purchase <= 20000){
            amount = purchase * 0.25f;
            System.out.printf("%.3f" ,amount);
        }else if (purchase > 20000){
            amount = purchase * 0.28f;
            System.out.printf("%.3f" ,amount);
        }
    }
}
