package com.smriti;
import java.util.Arrays;

public class Main {
    // Sorting in asencennding order
    public static void main(String[] args) {
        // write your code here
        int[] a = {10,5,6,9,4,52,13};
        System.out.println("Unsorted array");
        System.out.println(Arrays.toString(a));
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                } else {
                    // do nothing
                }
            }
        }
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(a));
    }
}