package de.bkukr.student.paul.program;

import java.util.Random;

public class ArrayOperations {

    public static void printArray(int[] arr) {
        for(int i = 0; i<= arr.length - 1; i++) {
            System.out.print(arr[i] + "; ");
        }
        System.out.print("\n\n");
    }


    public static void randArray(int[] arr, int max) {
        Random rand = new Random();

        for(int i = 0; i<= arr.length - 1; i++) {
            arr[i] = rand.nextInt(max);
        }
    }

    public static void copyArrays(int[]startArr, int[] arr0, int[] arr1) {
        int x = startArr.length;

        System.arraycopy(startArr, 0, arr0, 0, x);
        System.arraycopy(startArr, 0, arr1, 0, x);
    }
}
