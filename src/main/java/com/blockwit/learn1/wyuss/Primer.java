package com.blockwit.learn1.wyuss;

import com.sun.source.tree.IfTree;

import java.util.Random;
import java.util.Scanner;

public class Primer {

    public static void main(String[] arg) {

        int countOfSticks = 5;
        Random random = new Random();

        Scanner in = new Scanner(System.in);

        boolean isComputer = false;
        for (; countOfSticks > 0; ) {
            System.out.println("В игре " + countOfSticks + " палочек" );
            int dropSticks;
            int maxSticks = 3;
            if (countOfSticks < 3) {
                maxSticks = countOfSticks;
            }
            if (isComputer) {
                System.out.println("Ход компьютера");
                dropSticks = random.nextInt(maxSticks) + 1;
                System.out.println("Компьютер взял " + dropSticks + " палочки");
            } else {
                System.out.println("Ход пользователя");
                System.out.println("Введите кол-во палочек от 1 до " + maxSticks);
                dropSticks = in.nextInt();
                System.out.println("Пользователь взял " + dropSticks + " палочек");

            }
            countOfSticks = countOfSticks - dropSticks;
            isComputer = !isComputer;
        }

        if (isComputer) {
            System.out.println("Выиграл компьютер");
        } else {
            System.out.println("Выиграл пользователь");
        }

        in.close();

    }
}