package com.Arrys;

public class arrys_1 {
    public static void main(String[] args) {
        float [] A  = {35.2f,65.4f,74.44f,8.8f,93.33f};

        //first easy way
        //float sum = 35.2f+65.4f+74.44f+8.8f+93.33f;
        //System.out.println(sum);

        //second way
        float sum = 0;
        for (float element:A){
            sum = sum + element;
        }
        System.out.println("the value of sum is " +sum);
    }
}
