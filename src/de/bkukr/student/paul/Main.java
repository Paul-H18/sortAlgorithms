package de.bkukr.student.paul;
import java.util.Random;

public class Main {

    public static int[] list = new int[16];
    int test;

    public static void main(String[] args) {
        randArray(list);
        printArray(list);
        bubbleSortArray(list);
        printArray(list);


    }

    public static void selectionSortArray(int[] arr){
        int a, b, c;

        for (int i = 0; i < arr.length - 1; i++) {
            a = arr[i];
            if(a > arr[i+1]) {
                a = arr[i + 1];
            }
        }



    }

    public static void insertionSortArray(int[] arr){
        int a, b;

        for (int i = 0; i < arr.length - 1; i++) {
            a = arr[i];
            b = i;
            while(b > 1 && arr[b-1] > a){
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


    public static void randArray(int[] arr) {
        Random rand = new Random();
        int j = 1000;

        for(int i = 0; i<= arr.length - 1; i++) {
            arr[i] = rand.nextInt(j);
        }


    }


}
