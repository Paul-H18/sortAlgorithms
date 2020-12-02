package de.bkukr.student.paul.advanced.algorithms;

public class QuickSort {

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

        public int divide(int list[], int first, int last) {
            int pivot = list[(first + last) / 2];
            int posLeft = first;
            int posRight = last;

            while(posLeft <= posRight) {
                while(list[posLeft] < pivot) {
                    posLeft++;
                }

                while(list[posRight] > pivot) {
                    posRight--;
                }

                if(posLeft <= posRight) {
                    int tmp = list[posLeft];
                    list[posLeft] = list[posRight];
                    list[posRight] = tmp;
                    posLeft++;
                    posRight--;
                }
            }

            return posLeft;
        }

        public void sort(int list[], int first, int last) {
            int index = divide(list, first, last);

            if(first < index - 1) {
                sort(list, first, index-1);
            }
            if(index < last) {
                sort(list, index, last);
            }
        }
}
