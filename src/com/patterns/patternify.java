package com.patterns;
import java.util.Scanner;
public class patternify {

    public static void main(String[] args) throws Throwable {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String ans[] = Solution.printPatt(n);
            for(int i=0;i<n;i++) {
                System.out.println(ans[i]);
            }
        }
    }

    class Solution {
        static String[] printPatt(int N) {
            String[] result = new String[N];

            for (int i = 0; i < N; i++) {
                StringBuilder sb = new StringBuilder();

                for (int j = 0; j < N - i; j++) {
                    sb.append("*");
                }

                result[i] = sb.toString();
            }

            return result;
        }
    }


