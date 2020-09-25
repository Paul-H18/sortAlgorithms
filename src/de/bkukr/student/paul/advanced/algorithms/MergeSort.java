package de.bkukr.student.paul.advanced.algorithms;

public class MergeSort {

    private int amountSwitches, amountComparisions;
    long startTime, endTime;

    public int getAmountSwitches() {
        return amountSwitches;
    }

    public int getAmountComparisions() {
        return amountComparisions;
    }

    public long getNeededTime() {
        return endTime - startTime;
    }

    public void printStats() {
        System.out.println("Comparisions: "+ this.getAmountComparisions());
        System.out.println("Switches: " + this.getAmountSwitches());
        System.out.println("Zeit: "+ this.getNeededTime() + "ms");
    }

    public int[] sort(int[] arr) {

        if(arr.length > 1) {
            int center = arr.length / 2;
            int[] left = new int[center];

            for (int i = 0; i <= center - 1; i++) {
                left[i] = arr[i];
            }

            int[] right = new int[arr.length - center];
            for (int j = center; j <= arr.length - 1; j++) {
                right[j - center] = arr[j];
            }

            left = sort(left);
            right = sort(right);

            return merge(left, right);

        } else {
            return arr;
        }
    }


    public int[] merge(int[]left, int[] right) {

        int[] newArray = new int[left.length + right.length];

        //i == index
        int iLeft = 0, iRight = 0, iNew = 0;

        while(iLeft < left.length && iRight < right.length){
            if(left[iLeft] < right[iRight]) {
                newArray[iNew] = left[iLeft];
                iLeft++;
            } else {
                newArray[iNew] = right[iRight];
                iRight++;
            }
            iNew++;
        }

        while(iLeft < left.length ) {
            newArray[iNew] = left[iLeft];
            iLeft++;
            iNew++;
        }

        while(iRight < right.length) {
            newArray[iNew] = right[iRight];
            iRight++;
            iNew++;
        }

        return newArray;
    }



}
