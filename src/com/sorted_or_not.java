package com;

public class sorted_or_not {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5,6,7};
        boolean issorted = true;
        for (int i = 0 ; i < A.length-1; i++){
            if(A [i] > A [i+1]) {
                issorted = false;
                break;
            }
        }
        if (issorted){
            System.out.println("the arry is sorted");
        }else {
            System.out.println("the arry is not sorted");
        }
    }
}
