package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Day1_DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int myInt = Integer.parseInt(scan.nextLine());
        double myDouble = Double.parseDouble(scan.nextLine());

        String myString = scan.nextLine();

        DecimalFormat formatter = new DecimalFormat("0.0");

        System.out.println(myInt + i);
        System.out.println(formatter.format(myDouble + d));
        System.out.println(s + myString);
    }
}
