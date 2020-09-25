package de.bkukr.student.paul.basic.algorithms;

public class InsertionSort {

    private  long amountComparisions, amountSwitches;
    long startTime, endTime;

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
        System.out.println("\nInsertionSort:");
        System.out.println("Comparisions: "+ this.getAmountComparisions());
        System.out.println("Switches: " + this.getAmountSwitches());
        System.out.println("Zeit: "+ this.getNeededTime() + "ms");
    }


    public void sort(int[] arr) {
        startTime = System.currentTimeMillis();
        int a, b ;

        for (int i = 0; i <= arr.length - 1; i++) {
            a = arr[i];
            b = i;
            amountComparisions++;
            while(b >= 1 && arr[b - 1] > a){
                arr[b] = arr[b-1];
                b--;

                amountSwitches++;
            }
            arr[b] = a;
        }
        endTime = System.currentTimeMillis();
    }
}
