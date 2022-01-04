package com.blockwit.learn1.wyuss;

import java.util.Scanner;

public class S4t2 {

    public static void main(String[] arg) {
//        // 1. спросить 5 имен
//        // 2. вывести пять имен
        Scanner console = new Scanner(System.in);
        String[] names = new String[5];
        System.out.println("Введите имена");
        for (int i = 0; i < 5; i++) {
            names[i] = console.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }

        console.close();

    }
}

