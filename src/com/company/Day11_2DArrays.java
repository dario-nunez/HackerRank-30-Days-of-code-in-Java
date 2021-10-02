package com.company;

import java.util.Scanner;

public class Day11_2DArrays {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        int maxHourglass = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int hourglassValue = getHourglassValue(j,i,arr);

                if (hourglassValue > maxHourglass) {
                    maxHourglass = hourglassValue;
                }
            }
        }

        System.out.println(maxHourglass);
    }

    private static int getHourglassValue(int x, int y, int[][] arr) {
        int top = arr[x][y] + arr[x][y + 1] + arr[x][y + 2];
        int bottom = arr[x + 2][y] + arr[x + 2][y + 1] + arr[x + 2][y + 2];
        return arr[x + 1][y + 1] + top + bottom;
    }
}
