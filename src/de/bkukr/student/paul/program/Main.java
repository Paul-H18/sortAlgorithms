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


        BubbleSort bs = new BubbleSort();
        SelectionSort ss = new SelectionSort();
        InsertionSort is = new InsertionSort();

        StatHandler sh = new StatHandler(ss, is, bs);



        int[] list = new int[x];
        int[] list2 = new int[x];
        int[] list3 = new int[x];



        for (int i = 0; i < 10; i++) {
            ArrayOperations.randArray(list, y);
            ArrayOperations.copyArrays(list, list2, list3);

            is.sort(list);
            bs.sort(list2);
            ss.sort(list3);
            sh.refreshStats(i);
        }

    }



}
