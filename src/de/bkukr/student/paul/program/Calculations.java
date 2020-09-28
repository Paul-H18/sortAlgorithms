package de.bkukr.student.paul.program;

public class Calculations {

    public static long mean(long[] arr) {
        long n = 0;
        for (int i = 0; i < arr.length; i++) {
            n = n + arr[i];
        }
        return n/arr.length;
    }


}
