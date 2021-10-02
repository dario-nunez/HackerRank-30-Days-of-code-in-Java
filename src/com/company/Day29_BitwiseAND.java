package com.company;

import java.util.Scanner;

public class Day29_BitwiseAND {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            solve(n, k);
        }

        scanner.close();
    }

    private static void solve(int N, int K){
        int maxAnded = 0;

        for (int i = 1; i < N; i++) {
            for (int k = i + 1; k <= N; k++) {
                int anded = i & k;
                if (anded < K && maxAnded < anded) {
                    maxAnded = anded;
                }
            }
        }

        System.out.println(maxAnded);
    }
}
