package de.bkukr.student.paul;

public class QuickSort {

    public void quickSortArray(int arr[], int left, int right) {
        int i = part(arr, left, right);

        if (i < right) {
            quickSortArray(arr, i, right);
        } else if(left < i - 1){
            quickSortArray(arr, left, i - 1);
        }

    }




    private int part(int arr[], int left, int right) {
        int pivot = arr[(left  + right) / 2];

        int l = left, r = right;

        while(l <= r) {
            while(arr[r] > pivot) {
                r--;
            }
            while(arr[l] < pivot) {
                l++;
            }

            if(l <= r) {
                int i = arr[l];
                arr[l] = arr[r];
                arr[r] = i;

                r--;
                l++;
            }

        }

        return l;
    }


}
