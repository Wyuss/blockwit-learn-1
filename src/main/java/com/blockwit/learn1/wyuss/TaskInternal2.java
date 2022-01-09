package com.blockwit.learn1.wyuss;

import java.util.Scanner;

// В юристы
public class TaskInternal2 {

    public static void main(String[] args) {
        JobChecker jobChecker = new JobChecker();
        int deathScore = jobChecker.deathCore();
        if (deathScore > 2) {
            System.out.println("Мы вынуждены Вам отказать!");
        } else {
            System.out.println("Мы приняты!");
        }


    }

}
