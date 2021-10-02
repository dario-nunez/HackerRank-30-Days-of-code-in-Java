package com.company;

import java.util.Scanner;

public class Day16_ExceptionsStringToInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        solve(S);
    }

    private static void solve(String S) {
        try {
            int parsedInt = Integer.parseInt(S);
            System.out.println(parsedInt);
        } catch (Exception e) {
            System.out.println("Bad String");
        }
    }
}
