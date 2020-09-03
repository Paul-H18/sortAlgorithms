package de.bkukr.student.paul;

public class SelectionSort {

    public void sort(int[] arr) {
        int b, c;
        for (int i = 0; i <= arr.length - 2; i++) {
            b = i+1;
            c = arr[b];
            while(b > 0 && c < arr[b - 1]){
                arr[b] = arr[b - 1];
                b--;
            }
            arr[b] = c;
        }

    }


}
