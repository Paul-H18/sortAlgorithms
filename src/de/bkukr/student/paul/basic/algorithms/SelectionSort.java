package de.bkukr.student.paul.basic.algorithms;

public class SelectionSort {

    private long amountComparisons, amountSwitches;
    private long startTime, endTime;

    public void reset() {
        amountComparisons = 0;
        amountSwitches = 0;
    }

    public long getAmountComparisons() {
        return amountComparisons;
    }

    public long getAmountSwitches() {
        return amountSwitches;
    }

    public long getNeededTime() {
        return endTime - startTime;
    }

    public void printStats() {
        System.out.println("\nSelectionSort:");
        System.out.println("Comparisons: "+ this.getAmountComparisons());
        System.out.println("Switches: " + this.getAmountSwitches());
        System.out.println("Zeit: "+ this.getNeededTime() + "ms");
    }

    public void sort(int[] arr) {
        int left = 0, n = arr.length, min, x;

        for(int j = 0; j < arr.length; j++) {
            min = j;
            for (int i = j+  1; i < arr.length; i++) {
                if(arr[i] < arr[min]) {
                    min = i;
                }
            }
            x = arr[min];
            arr[min] = arr[left];
            arr[left] = x;
            left++;
        }

    }


}
