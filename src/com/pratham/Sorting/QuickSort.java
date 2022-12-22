package com.pratham.Sorting;
import java.util.Arrays;
import static com.pratham.Sorting.SelectionSort.swap;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {12,65,23,76,32,98,87};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int lower, int upper){
        if(lower>=upper){
            return;
        }
        int start = lower;
        int end = upper;
        int mid = start + (end-start)/2;
        int pivot = arr[mid];

        while (start<=end){
            while (arr[start]<pivot){
                start++;
            }
            while (arr[end]>pivot){
                end--;
            }
            if(start<=end){
                swap(arr, start, end);
                start++;
                end--;
            }
        }

        // now, pivot element is at correct index,sort 2 halves of array
        quickSort(arr,lower,end);
        quickSort(arr,start,upper);
    }


}
