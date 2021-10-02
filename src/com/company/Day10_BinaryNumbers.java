package com.company;

import java.util.Scanner;

public class Day10_BinaryNumbers {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        System.out.println(solve(n));
    }

    private static int solve(int n) {
        int consecutiveOnes = 0;
        int maxConsecutiveOnes = 0;

        int exponent = (int) (Math.log(n) / Math.log(2));

        for (int i = exponent; i > -1; i--) {
            int powered = (int) Math.pow(2, i);

            if (n >= powered) {
                consecutiveOnes++;
                n = n - powered;
            } else {
                if (consecutiveOnes > maxConsecutiveOnes) {
                    maxConsecutiveOnes = consecutiveOnes;
                }

                consecutiveOnes = 0;
            }
        }

        if (consecutiveOnes > maxConsecutiveOnes) {
            maxConsecutiveOnes = consecutiveOnes;
        }

        return maxConsecutiveOnes;
    }
}
