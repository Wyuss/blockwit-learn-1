package com.blockwit.learn1.wyuss;


import java.util.Scanner;

public class S4t1 {

    public static void main(String[] arg) {

        int yearOfBirth;
        String name;

        Scanner in = new Scanner(System.in);
        System.out.println("Ваш год роджения - ");
        yearOfBirth = in.nextInt();
        in.nextLine();
        System.out.println("Ваше имя - ");
        name = in.nextLine();

        int age = 2021 - yearOfBirth;
        System.out.println( name + ", вам " + age + " лет");

        in.close();
    }
}