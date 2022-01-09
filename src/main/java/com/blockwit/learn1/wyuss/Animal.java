package com.blockwit.learn1.wyuss;

public class Animal {

    private static int dateOfBirth;
    private static String color;
    private static String name;

        public static void main(String[] arg) {
            dateOfBirth = 2019;
            color = "black";
            name = "Derek dog";
            System.out.println(name + ", " + color + ": Year of birth - " + (2022 - dateOfBirth));

        }
}
