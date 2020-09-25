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
        System.out.println("Comparisions: "+ this.getAmountComparisions());
        System.out.println("Switches: " + this.getAmountSwitches());
        System.out.println("Zeit: "+ this.getNeededTime() + "ms");
    }

    public void sort(int[] arr) {
        startTime = System.currentTimeMillis();

        int b, c;
        for (int i = 0; i <= arr.length - 2; i++) {
            b = i+1;
            c = arr[b];
            amountComparisions++;
            while(b > 0 && c < arr[b - 1]){
                amountComparisions++;
                arr[b] = arr[b - 1];
                b--;

                amountSwitches++;
            }
            arr[b] = c;
        }

        endTime = System.currentTimeMillis();

    }


}
