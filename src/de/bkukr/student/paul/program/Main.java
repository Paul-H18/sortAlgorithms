package de.bkukr.student.paul.program;
import de.bkukr.student.paul.advanced.algorithms.*;
import de.bkukr.student.paul.basic.algorithms.*;

import java.util.Random;
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



        int[] list2 = new int[x];
        int[] list3 = new int[x];
        int[] list4 = new int[x];
        int[] list5 = new int[x];

        int [] list = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        randArray(list, y);
        System.arraycopy(list, 0, list2, 0, x);
        System.arraycopy(list, 0, list3, 0, x);
        System.arraycopy(list, 0, list4, 0, x);
        System.arraycopy(list, 0, list5, 0, x);

        is.sort(list);
        System.out.println("Comparisions: "+ is.getAmountComparisions());
        System.out.println("Switches: " + is.getAmountSwitches());
        System.out.println("Zeit: "+ is.getNeededTime() + "ms");

    }



    public static void printArray(int[] arr) {
        for(int i = 0; i<= arr.length - 1; i++) {
            System.out.print(arr[i] + "; ");
        }
        System.out.print("\n\n");
    }


    public static void randArray(int[] arr, int max) {
        Random rand = new Random();

        for(int i = 0; i<= arr.length - 1; i++) {
            arr[i] = rand.nextInt(max);
        }


    }


}
