package com.company;

import java.util.Scanner;

public class Day25_RunningTimeAndComplexity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long T = scanner.nextInt();

        // This is a while T > 0 and it adds an automatic decrement of T after each loop
        while (T-- > 0) {
            long n = scanner.nextLong();
            System.out.println(checkPrimality(n));
        }
    }

    public static String checkPrimality(long n) {
        if (n < 2) {
            return "Not prime";
        }

        long squareRoot = (long) Math.pow(n, 1/2f);

        for (long i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return "Not prime";
            }
        }

        return "Prime";
    }
}
