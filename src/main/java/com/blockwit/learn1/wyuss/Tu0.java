package com.blockwit.learn1.wyuss;
public class Tu0 {
    public static void main(String[] arg) {
        /* Задан массив чисел 12,7,89,-4,8,9. Необходимо:
         1. Распечатать его.
         2. Отсортировать его.
         3. Распечатать еще раз.*/

        int [] array = {12, 7, 89, -4, 8, 9};

        Helper helper = new Helper();
        Utils utils = new Utils();

        System.out.print("Исходные числа: ");
        helper.printIntArray(array); //метод printIntArray принимает массив чисел и распечатывает их.
        utils.sort(array); // Метод sort принимает массив чисел и сортирует в порядке возрастания.

        System.out.print("Числа в порядке возрастания: ");
        helper.printIntArray(array); //метод printIntArray принимает массив чисел и распечатывает их.

    }
}
