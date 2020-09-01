package de.bkukr.student.paul;

public class InsertionSort {

    public void insertionSortArray(int[] arr) {
        int a, b ;

        for (int i = 0; i <= arr.length - 1; i++) {
            a = arr[i];
            b = i;
            while(b >= 1 && arr[b - 1] > a){
                arr[b] = arr[b-1];
                b--;
            }
            arr[b] = a;
        }
    }


}
