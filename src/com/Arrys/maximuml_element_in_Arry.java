package com.Arrys;

public class maximuml_element_in_Arry {
    public static void main(String[] args) {
        int [] A = {1,3,4,56,67,989,7,66,7,6,5,45,5};
        int max = 0;
        for (int e: A){
            if(e > max){
                max = e;
            }

        }
        System.out.println(max);
    }
}
