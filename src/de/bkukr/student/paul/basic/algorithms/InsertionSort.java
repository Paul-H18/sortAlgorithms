package de.bkukr.student.paul.basic.algorithms;

public class InsertionSort {

    private int amountComparisions, amountSwitches;
    long startTime, endTime;

    public void reset() {
        amountComparisions = 0;
        amountSwitches = 0;
    }

    public int getAmountComparisions() {
        return amountComparisions;
    }

    public int getAmountSwitches() {
        return amountSwitches;
    }

    public long getNeededTime() {
        return endTime - startTime;
    }


    public void sort(int[] arr) {
        startTime = System.currentTimeMillis();
        int a, b ;

        for (int i = 0; i <= arr.length - 1; i++) {
            a = arr[i];
            b = i;
            amountComparisions++;
            while(b >= 1 && arr[b - 1] > a){
                amountComparisions++;
                amountSwitches++;
                arr[b] = arr[b-1];
                b--;
            }
            arr[b] = a;
        }
        endTime = System.currentTimeMillis();
    }


}
