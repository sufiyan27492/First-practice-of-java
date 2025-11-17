package com.practicesetday2.ch1intro.ch1intro;
import java.util.Scanner;
public class kmphtomiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter KMPH to convert in MPH: ");
        float kmph = sc.nextFloat();
        float miles = kmph *  0.621371f;
        System.out.printf("the speed in miles is: %.2f\n " ,miles);
        sc.close();
    }
}
