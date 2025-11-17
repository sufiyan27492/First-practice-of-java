package com.practice_set_day_4.ch4ifelse;

import java.util.Scanner;

public class area_parameter_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        float PI = 3.14f;
        float area = 3.14f * R * R;
        float Perameter = 2 * 3.14f * R;
        System.out.println((int) area);
        System.out.println((int) Perameter);
    }
}
