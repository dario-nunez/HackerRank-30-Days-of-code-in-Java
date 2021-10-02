package com.company;

import java.util.Arrays;
import java.util.Scanner;

class Person {
    private String firstName;
    private String lastName;
    private int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print Person data
    void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }
}

class Student extends Person {
    private int[] testScores;

    Student(String firstName, String lastName, int id, int[] testScores){
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    char calculate() {
        int averageScore = (int) Arrays.stream(testScores).average().orElse(-1);

        if (averageScore < 40) {
            return 'T';
        } else if (averageScore < 55) {
            return 'D';
        } else if (averageScore < 70) {
            return 'P';
        } else if (averageScore < 80) {
            return 'A';
        } else if (averageScore < 90) {
            return 'E';
        } else if (averageScore <= 100) {
            return 'O';
        }

        return '-';
    }
}

class Day12_Inheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}