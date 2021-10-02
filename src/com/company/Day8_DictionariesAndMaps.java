package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Day8_DictionariesAndMaps {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();

        // entry lines
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }

        // query lines
        while(in.hasNext()){
            String s = in.next();

            if (phoneBook.containsKey(s)) {
                System.out.println(String.format("%s=%s", s, phoneBook.get(s)));
            } else {
                System.out.println("Not found");
            }
        }

        in.close();
    }
}
