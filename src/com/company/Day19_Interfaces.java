package com.company;

import java.util.Scanner;

public class Day19_Interfaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator19 = new Calculator19();
        int sum = myCalculator19.divisorSum(n);
        System.out.println("I implemented: " + myCalculator19.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}

interface AdvancedArithmetic{
    int divisorSum(int n);
}

class Calculator19 implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int runningSum = n;

        for (int i = 1; i < (n/2) + 1; i++) {
            if (n % i == 0) {
               runningSum = runningSum + i;
            }
        }

        return runningSum;
    }
}