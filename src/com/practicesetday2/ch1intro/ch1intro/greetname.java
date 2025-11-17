package com.practicesetday2.ch1intro.ch1intro;
import java.util.Scanner;
public class greetname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = sc.nextLine();
        System.out.println("hello "+ name + " have a nice day");
    }

}
