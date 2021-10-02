package com.company;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Day15_LinkedList {
    private static Node insert(Node head,int data) {
        Node newNode = new Node(data);

        if (head == null) {
            //empty list
            return newNode;
        } else {
            //non-empty list
            Node tail = head;

            while (tail.next != null) {
                tail = tail.next;
            }

            tail.next = newNode;

            return head;
        }
    }

    private static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}