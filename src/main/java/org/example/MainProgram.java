package org.example;

import java.util.Arrays;

public class MainProgram {
    public static int smallest(int[] array) {
        int smallestNumber = Integer.MAX_VALUE;
        for(int element: array) {
            if(element < smallestNumber) {
                smallestNumber = element;
            }
        }
        return smallestNumber;
    }
    public static int indexOfSmallest(int[] array) {
        int indexOfSmallestNumber = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < array[indexOfSmallestNumber]) {
                indexOfSmallestNumber = i;
            }
        }
        return indexOfSmallestNumber;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexOfSmallestNumber = startIndex;
        for(int i = startIndex; i < table.length; i++) {
            if(table[i] < table[indexOfSmallestNumber]) {
                indexOfSmallestNumber = i;
            }
        }
        return indexOfSmallestNumber;
    }
    public static  void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void selectioSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int smallestElementIndex = indexOfSmallestFrom(arr, i);
            swap(arr, i, smallestElementIndex);
            System.out.println(Arrays.toString(arr));
        }
    }
}
