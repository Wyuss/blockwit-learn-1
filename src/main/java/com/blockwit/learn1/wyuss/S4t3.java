package com.blockwit.learn1.wyuss;

import java.util.Scanner;

public class S4t3 {

    public static void main(String[] arg) {
//        // 1. спросить имена и годы рождения 4 людей
//        // 2. вывести имена и кол-во лет.
        Scanner console = new Scanner(System.in);
        String[] names = new String[5];
        int [] yearOfBirth = new int[5];

        for (int i = 1; i < 5; i++) {
            System.out.println("Назовите имя " + i);
            names[i] = console.nextLine();
            System.out.println("Назовите год роджения " + i);
            yearOfBirth[i] = console.nextInt();
            console.nextLine();
        }
        for (int i = 1; i < 5; i++) {

            System.out.println( names[i] + ", " + (2022-yearOfBirth[i]) + " лет");
        }

        console.close();

    }
}

