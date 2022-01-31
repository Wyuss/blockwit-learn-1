package com.blockwit.learn1.wyuss;

public class S7T1 {
    public static void main(String[] arg) {
        int[] a = {9, 1, 5, 6, 8};
        int[] b = {7, 3, 1};
        int[] sum = new int[8];

        for (int i = 0; i < a.length; i++) {
            sum[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            sum[i + 5] = a[i];
        }
        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i] + " ");
        }
    }
}