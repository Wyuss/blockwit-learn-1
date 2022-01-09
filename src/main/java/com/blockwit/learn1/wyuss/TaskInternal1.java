package com.blockwit.learn1.wyuss;

import java.util.Scanner;

// В уборщики
public class TaskInternal1 {

    public static void main(String[] args) {
        JobChecker jobChecker = new JobChecker();
        int deathScore = jobChecker.deathCore();
        if (deathScore > 3) {
            System.out.println("Мы вынуждены Вам отказать!");
        } else {
            System.out.println("Мы приняты!");
        }

    }

}
