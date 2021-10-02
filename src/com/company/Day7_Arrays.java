package com.company;

import java.util.Scanner;

public class Day7_Arrays {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        scanner.close();

        StringBuilder reversedArray = new StringBuilder();

        for (int i = arr.length - 1; i > -1; i--) {
            reversedArray.append(arr[i]).append(" ");
        }

        reversedArray.deleteCharAt(reversedArray.length() - 1);

        System.out.println(reversedArray);
    }
}
