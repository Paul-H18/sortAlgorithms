package de.bkukr.student.paul;

public class QuickSort {

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

        public void quicksort(int list[], int first, int last) {
            int index = divide(list, first, last);

            if(first < index - 1) {
                quicksort(list, first, index-1);
            }
            if(index < last) {
                quicksort(list, index, last);
            }

        }


}
