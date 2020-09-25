package de.bkukr.student.paul.basic.algorithms;

public class SelectionSort {

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

    public void printStats() {
        System.out.println("\nSelectionSort:");
        System.out.println("Comparisions: "+ this.getAmountComparisions());
        System.out.println("Switches: " + this.getAmountSwitches());
        System.out.println("Zeit: "+ this.getNeededTime() + "ms");
    }

    public void sort(int[] arr) {
        startTime = System.currentTimeMillis();

        
        int left = 0, n = arr.length, min, x;

        for(int j = 0; j < arr.length; j++) {
            min = j;
            for (int i = j+  1; i < arr.length; i++) {
                if(arr[i] < arr[min]) {
                    min = i;
                    amountComparisions++;
                }
            }
            x = arr[min];
            arr[min] = arr[left];
            arr[left] = x;
            amountSwitches++;
            left++;
        }

        endTime = System.currentTimeMillis();

    }


}
