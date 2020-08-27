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

        bubbleSortArray(list);

        //insertionSortArray(list);
        //selectionSortArray(list);

        printArray(list);
    }

    public static void selectionSortArray(int[] arr) {
        int b, c;
        for (int i = 0; i <= arr.length - 2; i++) {
            b = i+1;
            c = arr[b];
            while(b > 0 && c < arr[b - 1]){
                arr[b] = arr[b - 1];
                b--;
            }
            arr[b] = c;
        }

    }

    public static void insertionSortArray(int[] arr) {
        int a, b ;

        for (int i = 0; i <= arr.length - 1; i++) {
            a = arr[i];
            b = i;
            while(b >= 1 && arr[b - 1] > a){
                arr[b] = arr[b-1];
                b--;
            }
            arr[b] = a;
        }
    }

    public static void bubbleSortArray(int[] arr) {
        int a, b = arr.length;

        while(b > 0) {
            for(int i = 0; i<=arr.length - 2; i++) {
                if(arr[i] > arr[i+1]) {
                    a = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = a;
                }
            }
            b--;
        }

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
