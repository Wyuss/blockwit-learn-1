package com.blockwit.learn1.wyuss;

import java.util.Scanner;

public class JobChecker {

    public int deathCore() {
        Scanner console = new Scanner(System.in);

        int deathScore = 0;
        System.out.println("Ты мудак?");
        if (console.nextLine().equalsIgnoreCase("Да")) {
            deathScore = deathScore + 1;
        }
        System.out.println("Ты куришь?");
        if (console.nextLine().equalsIgnoreCase("Да")) {
            deathScore = deathScore + 1;
        }
        System.out.println("Ты пьешь?");
        if (console.nextLine().equalsIgnoreCase( "Да")) {
            deathScore = deathScore + 1;
        }
        System.out.println("Ты имеешь высшее образование?");
        if (console.nextLine().equalsIgnoreCase( "Нет")) {
            deathScore = deathScore + 1;
        }
        console.close();
        return deathScore;
    }

}
