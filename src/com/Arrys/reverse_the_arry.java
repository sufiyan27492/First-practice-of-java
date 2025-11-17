package com.Arrys;

public class reverse_the_arry {
    public static void main(String[] args) {
       // int[] A = {33, 44, 55, 66, 24, 67, 78};
        /*for (int i = A.length-1; i >= 0; i-- ){
            System.out.println(A[i]);
            }
         */
        int [] A = {1,2,3,4,5,6};
            int l = A.length;
        int temp;
        int n = Math.floorDiv(A.length, 2);
        for (int i = 0; i<n; i++){
            //swap a[i] and a[l-1-i]
            //  I   j temp
            // |3| |4| ||
            temp = A[i];
            A[i] = A[l-i-1];
            A[l-i-1] = temp;

        }
        for (int element : A){
            System.out.print(element + " ");
        }
    }
}
