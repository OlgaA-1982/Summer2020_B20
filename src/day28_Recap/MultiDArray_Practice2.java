package day28_Recap;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
        task1:
        9 10 11 12 13
        4 5 6 7 8
        1 2 3
        task2:
        3 2 1
        4 5 6 7 8
        9 10, 11 12 13
        task3:
        13 12 11 10 9
        8 7 6 5 4
        3 2 1
*/
public class MultiDArray_Practice2 {
    public static void main(String[] args) {
     int arr2D[][] = {{1,2,3}, {4,5,6,7,8}, {9,10,11,12,13,}};

     /*
     task1:
        9 10 11 12 13
        4 5 6 7 8
        1 2 3
      */

       for (int i = arr2D.length-1; i >=0; i--) {
           int[] arr1D = arr2D[i];
           for (int j = 0; j<= arr1D.length-1; j++) {
               System.out.print(Arrays.toString(arr1D));
           }
           System.out.println();
       }
























































    }



}
