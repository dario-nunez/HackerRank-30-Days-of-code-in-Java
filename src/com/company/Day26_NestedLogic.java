package com.company;

import java.util.Scanner;

public class Day26_NestedLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] returned = scanner.nextLine().split(" ");
        String[] expected = scanner.nextLine().split(" ");

        // Years
        if (Integer.parseInt(returned[2]) > Integer.parseInt(expected[2])) {
            System.out.println("10000");
        } else if (Integer.parseInt(returned[2]) == Integer.parseInt(expected[2])) {
            // Months
            if (Integer.parseInt(expected[1]) < Integer.parseInt(returned[1])) {
                System.out.println(500 * Math.abs(Integer.parseInt(returned[1]) - Integer.parseInt(expected[1])));
            } else if (Integer.parseInt(expected[1]) == Integer.parseInt(returned[1])) {
                // Days
                if (Integer.parseInt(returned[0]) > Integer.parseInt(expected[0])) {
                    System.out.println(15 * Math.abs(Integer.parseInt(returned[0]) - Integer.parseInt(expected[0])));
                } else {
                    System.out.println("0");
                }
            } else {
                System.out.println("0");
            }
        } else {
            System.out.println("0");
        }
    }
}
