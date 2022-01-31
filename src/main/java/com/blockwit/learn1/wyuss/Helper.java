package com.blockwit.learn1.wyuss;

public class Helper {
    /* Tu1
       1. Сделать класс Helper.
       2. Внутри него метод printIntArray, который принимает массив чисел и распечатывает их.
       3. Переписать предыдущую задачу, так чтобы она использовала метод printIntArray.*/

    public void printIntArray (int [] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
