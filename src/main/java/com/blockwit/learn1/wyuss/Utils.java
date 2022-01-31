package com.blockwit.learn1.wyuss;

public class Utils {
    /* Написать класс Utils.
    Внутри него метод sort.
    Метод sort должен принимать на вход массив чисел.
    Метод сортирует числа внутри массива в порядке возрастания.
     */
    public void sort (int [] array) {
        int temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i<array.length-1; i++){
                if (array[i] > array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1]= temp;
                    sorted = false;
                }
            }
        }
    }
}
