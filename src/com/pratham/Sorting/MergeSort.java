package com.pratham.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12,65,23,76,32,98,87};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    // in this, new array is created. we are not modifying the original array
    static int[] mergeSort(int[] arr){
        // base condition
        if(arr.length==1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] first, int[] second){
        int[] ans = new int[first.length + second.length];
        int i=0;
        int j=0;
        int k=0;

        // look for smaller elements between 2 arrays while one of the array is not completed
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                ans[k] = first[i];
                i++;
            } else{
                ans[k] = second[j];
                j++;
            }
            k++;
        }

        // now, it might be possible that one of the array is not complete
        // copy the remaining elements
        while(i<first.length){
            ans[k] = first[i];
            i++;
            k++;
        }
        while(j<second.length){
            ans[k] = second[j];
            j++;
            k++;
        }
        return ans;
    }
}
