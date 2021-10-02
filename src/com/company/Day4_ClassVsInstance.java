package com.company;

import java.util.Scanner;

public class Day4_ClassVsInstance {
    private int age;

    private Day4_ClassVsInstance(int initialAge) {
        if (initialAge >=0) {
            age = initialAge;
        } else {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    private void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else {
            if (age < 18) {
                System.out.println("You are a teenager.");
            } else {
                System.out.println("You are old.");
            }
        }
    }

    private void yearPasses() {
        age = age + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Day4_ClassVsInstance p = new Day4_ClassVsInstance(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
