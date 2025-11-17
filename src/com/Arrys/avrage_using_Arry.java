package com.Arrys;

public class avrage_using_Arry {
    public static void main(String[] args) {
        float [] marks = {33.4f,55.5f,77.5f,69.5f,76,5f};
        float sum = 0;
        for (float element : marks){
            sum = sum + element;

        }
        System.out.println("the avragte is: "+ sum/marks.length);
    }
}
