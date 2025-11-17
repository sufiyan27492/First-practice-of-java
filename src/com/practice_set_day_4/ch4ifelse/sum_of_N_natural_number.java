package com.practice_set_day_4.ch4ifelse;
import java.util.Scanner;
public class sum_of_N_natural_number {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            long N = sc.nextLong();

            long sum = N * (N + 1) / 2;

            System.out.println(sum);
        }
    }
