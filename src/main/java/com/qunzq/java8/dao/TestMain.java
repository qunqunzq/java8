package com.qunzq.java8.dao;

import com.qunzq.java8.model.*;
import com.qunzq.java8.model.Stack;

import java.io.*;
import java.util.*;

/**
 * Created by Qun on 2019-03-04.2147483647
 */
public class TestMain {
    public enum Fue {
        APPLE("苹果"),PEND("不知道"),HAVEING("有没有");
        private String description;
        private Fue(String value) {
            this.description = value;
        }
        public String getDescription(){
            return this.description;
        }
    }
    public static void main(String[] args) {
        System.out.println(null instanceof String);


    }
    public static void sendser(){
        Apple apple = new Apple.Builder().addColor("红色").addSize(20).addSource("院子").addWeight(22L).builder();
        try {
            ObjectOutputStream objectOutputStream =new ObjectOutputStream(new FileOutputStream(new File("D:/Apple.txt")));
            objectOutputStream.writeObject(apple);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void inser(){
        try {
            ObjectInputStream objectInputStream =new ObjectInputStream(new FileInputStream(new File("D:/Apple.txt")));
            Apple o =(Apple)objectInputStream.readObject();
            System.out.println(o);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void enmuOut(){
        for(Fue f : Fue.values()){
            System.out.println(f + " ordinal: " + f.ordinal());
            System.out.println(f.compareTo(Fue.PEND));
            System.out.println(f.equals(Fue.PEND));
            System.out.println(f==Fue.PEND);
            System.out.println(f.getDeclaringClass());
            System.out.println(f.name());
            System.out.println(f.getDescription());
            System.out.println(f);
            System.out.println("==============================");
        }
    }

    public static int reverse(int x) {
        int result = 0;
        if (x >= 0) {
            String s = String.valueOf(x);
            StringBuilder sb = new StringBuilder(s);
            String afterreverse = sb.reverse().toString();
            try {
                result = Integer.parseInt(afterreverse);
            } catch (Exception a) {

            }
        } else {
            String s = String.valueOf(x);
            String substring = s.substring(1, s.length());
            StringBuilder sb = new StringBuilder(substring);
            String afterreverse = "-" + sb.reverse().toString();
            try {
                result = Integer.parseInt(afterreverse);
            } catch (Exception a) {

            }
        }
        return result;
    }

    public static int reverseO(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static boolean isPalindrome(int x){
        int y = x;
        int rev = 0;
        if (x >= 0){
            while (x != 0) {
                int prop = x % 10;
                x /= 10;
                rev = rev * 10 + prop;
            }
            if(y == rev){
                return true;
            }
        }else {
            return false;
        }
       return false;
    }
    public static  int numJewelsInStones(String J, String S){
        int p = 0;

     /* String[] split = J.split("");
        String[] bbs = S.split("");
        for(int i =0; i<bbs.length; i++){
            for(int j = 0;j<split.length;j++){
                if(bbs[i].equals(split[j])){
                    p++;
                }
            }
        }*/
        char[] chars = J.toCharArray();

        return p;
    }

    public int[] sortedSquares(int[] A) {
        int N = A.length;
        //
        int j = 0;
        while (j < N && A[j] < 0) {
            j++;
        }
        //负几个
        int i = j-1;

        int[] ans = new int[N];
        int t = 0;

        while (i >= 0 && j < N) {
            if (A[i] * A[i] < A[j] * A[j]) {
                ans[t++] = A[i] * A[i];
                i--;
            } else {
                ans[t++] = A[j] * A[j];
                j++;
            }
        }

        while (i >= 0) {
            ans[t++] = A[i] * A[i];
            i--;
        }
        while (j < N) {
            ans[t++] = A[j] * A[j];
            j++;
        }

        return ans;
    }
    public static int[] diStringMatch(String S) {
        String ss= "IDID";
        int max = ss.length();
        int i = 0;
        int[] re = new int[ss.length()+1];
        String[] split = ss.split("");
        for(int j = 0;j<ss.length();j++){
            if(split[j].equals("I")){
                re[j] = i++;
            }else{
                re[j] = max--;
            }
        }
        re[ss.length()] = i;
        System.out.println(Arrays.toString(re));
        return re;
    }

    public static void deleteNode() {
         ListNode l = new ListNode(2);
         l.next = new ListNode(3);
         l.next.next = new ListNode(4);
         l.next.next.next = new ListNode(5);
         de(l.next);
       // System.out.println(l.val+"+++"+l.next.val+"---"+l.next.next.val);
        while (l.next != null){
            System.out.println(l.val);
        }
    }
    public  static void de(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public static int[][] flipAndInvertImage() {
        int[][] re =  {{1,1,0},{98,0,1},{1,0,0,1}};
       // int[][] res = new int[A.length][];
        for(int[] s : re){
            for(int i = 0;i< s.length/2;i++){
                int tem = s[i];
                s[i] = s[s.length-i - 1] ;
                s[s.length-i - 1] = tem ;
            }
            for(int j = 0;j<s.length;j++){
                s[j] = s[j]==0?1:0;
            }
        }
        System.out.println(Arrays.toString(re[2]));
        return null;
    }
    public static int numUniqueEmails() {
        String[] emails ={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        Set<String> set = new HashSet<>();
        for(String a : emails){
            String[] split = a.split("@");
            String[] split1 = split[0].split("\\+");
            String replace = split1[0].replace(".", "");
            set.add(replace+"@"+split[1]);
        }
        return set.size();
    }
    public static int[] sortArrayByParity( ) {
        int[] A ={32,1,2,7,4};
        int l = A.length;
        int[] res = new int[l];
        int j =0;
        int p = 0;
        for(int i=0;i<A.length;i++){
            if((A[i] % 2)==0){
               res[j++] = A[i];
            }else {
                res[l-p-1] = A[i];
                p++;
            }
        }
        System.out.println(Arrays.toString(res));
        return null;
    }
    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        char[] chars = moves.toCharArray();
        for (char a : chars) {
            switch (a) {
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
            }

        }
        if (x == 0 && y == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean judgeCircl1e(String moves) {
        String d= "RLD";
        int[] temp = new int[86];
        char[] str = d.toCharArray();
        for(int i = 0; i < str.length; i++){
            temp[str[i]]++;
        }
        return temp[82] == temp[76] && temp[85] == temp[68];// 分别对应R  L   U   D


    }
    public static void input() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/apple"))) {
            String s = bufferedReader.readLine();
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("catch");

            System.out.println("finally");

        }
    }
}
