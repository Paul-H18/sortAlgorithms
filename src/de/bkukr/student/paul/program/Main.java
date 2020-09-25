package de.bkukr.student.paul.program;
import de.bkukr.student.paul.advanced.algorithms.*;
import de.bkukr.student.paul.basic.algorithms.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Wie viele Werte wollen Sie sortieren: ");
        int x = scan.nextInt();
        scan.reset();

        System.out.print("Wie hoch soll der maximale Wert sein: ");
        int y = scan.nextInt();
        scan.close();


        MergeSort ms = new MergeSort();
        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();
        SelectionSort ss = new SelectionSort();
        InsertionSort is = new InsertionSort();


        int[] list = new int[x];
        int[] list2 = new int[x];
        int[] list3 = new int[x];
        int[] list4 = new int[x];
        int[] list5 = new int[x];

        ArrayOperations.randArray(list, y);
        System.arraycopy(list, 0, list2, 0, x);
        System.arraycopy(list, 0, list3, 0, x);
        System.arraycopy(list, 0, list4, 0, x);
        System.arraycopy(list, 0, list5, 0, x);

        is.sort(list);
        is.printStats();

    }



}
