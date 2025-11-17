package com;

import java.sql.SQLOutput;

public class name {
    public static void main(String[] args) {
        f(3);
    }
    public static void f(int n){
        if(n < 1){
            return;
        }
        System.out.println(n);
        f(n - 1);
    }
}
