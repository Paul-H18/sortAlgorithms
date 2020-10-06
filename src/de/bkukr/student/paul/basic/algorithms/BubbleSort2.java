package de.bkukr.student.paul.basic.algorithms;

public class BubbleSort2 {

    public static void sortieren(int[] arr) {
        int x;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    x = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1]= x;
                }
            }

        }

    }


}
