package com.blockwit.learn1.wyuss;

import java.util.Scanner;

public class S4t6 {

    public static void main(String[] arg) {
//        // 1. спросить у пользователя 4 чисел.
//        // 2. поменять местами первое и последнее число, если последнее больше первого.
//        // 3. вывести все числа.
        Scanner console = new Scanner(System.in);
        int [] numbers = new int [4];
        System.out.println("Назовите 4 числа");

            for (int i=0; i<4; i++) {
                numbers[i] = console.nextInt();
                console.nextLine();
            }

            int f = numbers [0];
            int l = numbers[3];
                if (numbers[3] > numbers[0]) {
                    numbers [0] = l ;
                    numbers[3] = f;
                }
                for (int i=0; i<4; i++) {

                System.out.println("Вы ввели числа: " + numbers[i]);
                }


        console.close();

    }
}

