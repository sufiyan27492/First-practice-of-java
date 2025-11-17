package com;

public class minimum_element_in_Arry {
    public static void main(String[] args) {
        int [] A = {1,23,54,56,6,7,878,7876,5,76,7,54,-88,-646,-9898,9988};
        int min = 0;
        for (int e:A){
            if(e < min){
            min = e;
            }
        }
        System.out.println(min);
    }
}
