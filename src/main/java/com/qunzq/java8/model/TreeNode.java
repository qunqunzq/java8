package com.qunzq.java8.model;

/**
 * Created by Qun on 2019-04-08.
 */
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public static void main(String[] args) {
        ;
        System.out.println(Math.max(3,2));
    }

    public static TreeNode ddd(TreeNode t1,TreeNode t2){
        if(t1 == null){
            return t2;
        }
        if(t2 == null){
            return t1;
        }
        t1.val  = t1.val+ t2.val;
        t1.left = ddd(t1.left,t2.left);
        t1.right = ddd(t1.right,t2.right);
        return t1;
    }
}

