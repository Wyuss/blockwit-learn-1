package com.blockwit.learn1.wyuss;

import java.util.Scanner;

public class S4t3е {

    public static void main(String[] arg) {
//        // 1. спросить температуру за последние три дня.
//        // 2. вычислить среднюю температуру и вывести ее.
        Scanner console = new Scanner(System.in);
        int [] temperature = new int[4];

            for (int i = 1; i<4; i++) {
             System.out.println("День " + i + ":");
                temperature[i] = console.nextInt();
                console.nextLine();

             }
                int average = (temperature[1]+temperature[2]+temperature[3])/3;
                System.out.println("Cредняя температура: " + average);


        console.close();

    }
}

