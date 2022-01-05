package com.blockwit.learn1.wyuss;

import java.util.Scanner;

public class S4t4 {

    public static void main(String[] arg) {
//        // 1. спросить сколько у вас друзей.
//        // 2. спросить имена этих друзей.
//        // 3. вывести имена друзей в обратном порядке.
        Scanner console = new Scanner(System.in);

        System.out.println("Cколько у вас друзей?");
        int size = console.nextInt();
        console.nextLine();
        String [] friends = new String[size];
        System.out.println("Напишите имена ваших друзей");

            for (int i = 0; i < friends.length; i++) {
                friends[i] = console.nextLine();
            }
                System.out.print ("Ваши друзья: ");
                for (int i = friends.length-1; i >= 0; i--) {
                    System.out.print ("\n" + friends[i]);
                }


        console.close();

    }
}

