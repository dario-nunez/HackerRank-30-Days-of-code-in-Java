package com.company;

import javafx.util.Pair;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Day28_RegExPatternsAndIntroToDatabases {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        LinkedList<Pair<String, String>> dir = new LinkedList<>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];

            dir.add(new Pair<>(firstName, emailID));
        }

        scanner.close();

        // Stream solution
        dir.stream().sorted(Comparator.comparing(Pair::getKey)).filter(e -> e.getValue().matches("(.*@gmail.com)")).forEach(o -> System.out.println(o.getKey()));

        /** LinkedList solution
         *  dir.sort(Comparator.comparing(o -> o.getKey()));
         *  for (Pair<String, String> e : dir) {
         *      if (e.getValue().matches("([a-z]*@gmail.com)")) {
         *          System.out.println(e.getKey());
         *      }
         *  }
         */
    }
}
