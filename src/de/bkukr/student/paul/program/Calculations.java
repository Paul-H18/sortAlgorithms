package de.bkukr.student.paul.program;

public class Calculations {

    public static long mean(long[] arr) {
        long n = 0;
        for (int i = 0; i < arr.length; i++) {
            n = n + arr[i];
        }
        n = n/arr.length;
        return n;
    }

    public static long pow(int base, int exponent) {
        long result = base;
        for (int i = 1; i < exponent; i++) {
            result = result * base;
        }
        return result;
    }


}
