package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day23_BSTLevelOrderTraversal {
    private static void levelOrder(Node23 root){
        StringBuilder traversedNodes = new StringBuilder();
        Queue<Node23> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node23 removedNode = queue.remove();
            traversedNodes.append(removedNode.data).append(" ");

            if (removedNode.left != null) {
                queue.add(removedNode.left);
            }

            if (removedNode.right != null) {
                queue.add(removedNode.right);
            }
        }

        System.out.println(traversedNodes.deleteCharAt(traversedNodes.length()-1));
    }

    private static Node23 insert(Node23 root, int data){
        if(root==null){
            return new Node23(data);
        }
        else{
            Node23 cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node23 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}

class Node23{
    Node23 left,right;
    int data;
    Node23(int data){
        this.data=data;
        left=right=null;
    }
}