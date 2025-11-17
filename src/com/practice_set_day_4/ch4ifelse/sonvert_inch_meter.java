package com.practice_set_day_4.ch4ifelse;

import java.util.Scanner;

public class sonvert_inch_meter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float inch = sc.nextFloat();
        float meter = inch * 0.0254f;
        System.out.printf("%.3f",meter);

    }
}
