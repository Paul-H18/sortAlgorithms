package de.bkukr.student.paul;
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

        int[] list = new int[x];

        randArray(list, y);
        printArray(list);

        //bubbleSortArray(list);

        //insertionSortArray(list);
        //selectionSortArray(list);

        printArray(list);
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
