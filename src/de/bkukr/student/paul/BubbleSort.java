package de.bkukr.student.paul;

public class BubbleSort {

    public void sort(int[] arr) {
        int a, b = arr.length;

        while(b > 0) {
            for(int i = 0; i<=arr.length - 2; i++) {
                if(arr[i] > arr[i+1]) {
                    a = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = a;
                }
            }
            b--;
        }

    }


}
