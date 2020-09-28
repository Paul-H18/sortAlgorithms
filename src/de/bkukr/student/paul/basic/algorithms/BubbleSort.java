package de.bkukr.student.paul.basic.algorithms;

import static java.lang.System.currentTimeMillis;

public class BubbleSort {

    private long amountComparisions, amountSwitches;
    long endTime, startTime;


    public void reset() {
        amountComparisions = 0;
        amountSwitches = 0;
    }

    public long getAmountComparisions() {
        return amountComparisions;
    }

    public long getAmountSwitches() {
        return amountSwitches;
    }

    public long getNeededTime() {
        return endTime - startTime;
    }

    public void printStats() {
        System.out.println("\nBubbleSort:");
        System.out.println("Comparisions: "+ this.getAmountComparisions());
        System.out.println("Switches: " + this.getAmountSwitches());
        System.out.println("Zeit: "+ this.getNeededTime() + "ms");
    }



    public void sort(int[] arr) {
        startTime = System.currentTimeMillis();
        int a, b = arr.length;

        while(b > 0) {
            for(int i = 0; i<=arr.length - 2; i++) {
                amountComparisions++;
                if(arr[i] > arr[i+1]) {
                    a = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = a;
                    amountSwitches++;
                }
            }
            b--;
        }
        endTime = System.currentTimeMillis();
    }




}
