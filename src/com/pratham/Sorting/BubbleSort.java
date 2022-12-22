package com.pratham.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12,65,23,76,32,98,87};
        System.out.println(Arrays.toString(arr));
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    // this is the simplest sorting algo works by repeatedly swapping adjacent elements, if they are in wrong order.
    static void bubble(int[] arr){
        boolean swapped = false;
        // outer loop will run n-1 times(0 to (n-2) index)
        for(int i=0;i<arr.length-1;i++){
            // inner loop will run n-1-i times
            for(int j=0;j<= arr.length-1-i;j++){
                if(j!=arr.length-1 && arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    swapped = true;
                }
            }
            if(!swapped){
                return;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
