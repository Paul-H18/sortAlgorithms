package de.bkukr.student.paul;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Main {


    public static void main(String[] args) {

        /*Frame frame = new Frame();
        frame.setUp();*/


        //For Console usage:
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

        randArray(list, y);
        System.arraycopy(list, 0, list2, 0, x);
        System.arraycopy(list, 0, list3, 0, x);
        System.arraycopy(list, 0, list4, 0, x);
        System.arraycopy(list, 0, list5, 0, x);

        long startTime = System.currentTimeMillis();
        ms.sort(list);
        long endTime = System.currentTimeMillis();
        long mergeTime = endTime - startTime;

        long startTimeQ = System.currentTimeMillis();
        qs.quicksort(list2, 0, list.length - 1);
        long endTimeQ = System.currentTimeMillis();
        long quickTime = endTimeQ - startTimeQ;

        long startTimeB = System.currentTimeMillis();
        bs.sort(list3);
        long endTimeB = System.currentTimeMillis();
        long bubbleTime = endTimeB - startTimeB;

        long startTimeS = System.currentTimeMillis();
        ss.sort(list4);
        long endTimeS = System.currentTimeMillis();
        long selectionTime = endTimeS - startTimeS;

        long startTimeI = System.currentTimeMillis();
        is.sort(list5);
        long endTimeI = System.currentTimeMillis();
        long insertionTime = endTimeI - startTimeI;


        System.out.println("Der Mergesort benötigte: " + mergeTime+ " ms!");
        System.out.println("Der Quicksort benötigte: " + quickTime + " ms!");
        System.out.println("Der BubbleSort benötigte: " + bubbleTime+ " ms!");
        System.out.println("Der InsertionSort benötigte: " + insertionTime + " ms!");
        System.out.println("Der Selection benötigte: " + selectionTime + " ms!");

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
