package com.practice_set_day_4.ch4ifelse;

import java.util.Scanner;

public class water_bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int liters = sc.nextInt();
        int totalbill = 0;
        if (liters <= 100) {
            totalbill = liters * 15;
        } else if (liters <= 200) {
            totalbill = 100 * 15 + (liters - 100) * 14;
        } else {
            totalbill = 100 * 15 + 100 * 14 + (liters - 200) * 12;

        }
        System.out.println(totalbill);
    }
}
