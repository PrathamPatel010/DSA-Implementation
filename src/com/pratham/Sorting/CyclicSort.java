package com.pratham.Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {9,6,3,8,1,4,7,2,5,0};
        System.out.println("Array elements");
        System.out.println(Arrays.toString(arr));
        insertion(arr);
        System.out.println("Array after sorting: ");
        System.out.println(Arrays.toString(arr));
    }


    // this method can only work when array elements are in range
    // either 0 to N range
    // OR 1 to N range
    // In this method we find correct index of element & put it in correct index

    // In this method, Consider 0 to N range
    static void insertion(int[] arr){
        int index = 0;
        while(index<arr.length){
            int correctIndex = arr[index];
            // if range is 1 to N, correctIndex = arr[index]-1, everything else remains same
            if (arr[index]!=arr[correctIndex]){
                swap(arr,index,correctIndex);
            } else{
                index++;
            }
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
