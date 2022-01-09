package com.blockwit.learn1.wyuss;

import java.util.Scanner;

public class JRExample {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = console.nextInt();
        }

        boolean a = numbers[0] == numbers[1];
        boolean d = numbers[0] == numbers[2];
        boolean b = numbers[1] == numbers[2];

        if (a && d) {
            System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);
        } else {
            if (a) {
                System.out.println(numbers[0] + " " + numbers[1]);
            }
            if (d) {
                System.out.println(numbers[0] + " " + numbers[2]);
            }
            if (b) {
                System.out.println(numbers[1] + " " + numbers[2]);
            }
        }

    }


}
