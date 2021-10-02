package com.company;

import java.util.Scanner;

class Node22{
    Node22 left,right;
    int data;
    Node22(int data){
        this.data=data;
        left=right=null;
    }
}

public class Day22_BinarySearchTrees {
    private static int getHeight(Node22 root){
        if (root.right == null && root.left == null) {
            return 0;
        } else if (root.right != null && root.left == null) {
            return 1 + getHeight(root.right);
        } else if (root.right == null) {
            return 1 + getHeight(root.left);
        } else {
            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);

            if (leftHeight > rightHeight) {
                return 1 + leftHeight;
            } else {
                return 1 + rightHeight;
            }
        }
    }

    private static Node22 insert(Node22 root, int data){
        if(root==null){
            return new Node22(data);
        }
        else{
            Node22 cur;
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
        Node22 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
