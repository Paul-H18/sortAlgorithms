package de.bkukr.student.paul.basic.algorithms;

public class InsertSort2 {

    public static void sort(int[] arr) {
        int a, b;

        for (int i = 0; i <= arr.length - 1; i++) {
            a = arr[i];
            b = i;
            while(b >= 1 && arr[b - 1] > a) {
                arr[b] = arr[b -1];
                b--;
            }
            arr[b] = a;
        }
    }
}
