package com.company;

import java.util.Scanner;

class Difference {
    private int[] elements;
    int maximumDifference;

    Difference(int[] a) {
        elements = a;
    }

    void computeDifference() {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int e:elements) {
            if (e < smallest) {
                smallest = e;
            }

            if (e > largest) {
                largest = e;
            }
        }

        maximumDifference = Math.abs(largest - smallest);
    }
}

class Day14_Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}