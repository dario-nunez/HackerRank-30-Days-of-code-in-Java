package com.company;

import java.util.Scanner;

public class Day6_LetsReview {
    private static void solve(String input) {
        StringBuilder evenChars = new StringBuilder();
        StringBuilder oddChars = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                evenChars.append(input.charAt(i));
            } else {
                oddChars.append(input.charAt(i));
            }
        }

        System.out.println(String.format("%s %s", evenChars.toString(), oddChars.toString()));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStrings = scanner.nextInt();

        for (int i = 0; i < numberOfStrings; i++) {
            String inputString = scanner.next();
            solve(inputString);
        }
    }
}
