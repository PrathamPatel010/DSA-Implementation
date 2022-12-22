package com.pratham.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {12,65,23,76,32,98,87};
        System.out.println("Array elements");
        System.out.println(Arrays.toString(arr));
        selection(arr);
        System.out.println("Array after sorting: ");
        System.out.println(Arrays.toString(arr));
    }

    // In selection sort, We search for the largest element in range & put it at the right most index
//    Time Complexity = O(N^2) because two loops : One for finding the largest element, one for swapping it at right index
    static void selection(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            // find index of largest element
            int end = arr.length-1-i;
            int max = findMaxIndex(arr,0,end);

            // swap that number with right most position
            swap(arr,max,arr.length-1-i);
        }
    }

    // method to find index of the largest element
    static int findMaxIndex(int[] arr, int start, int end){
        int largest = 0;
        for (int i=start;i<=end;i++){
            if (arr[i]>arr[largest]){
                largest = i;
            }
        }
        return largest;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
