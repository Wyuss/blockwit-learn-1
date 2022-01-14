package com.blockwit.learn1.wyuss;
import java.util.Arrays;
public class Tu1 {
    public static void main(String[] arg) {
        /* Задан массив чисел 12,7,89,-4,8,9. Необходимо:
        1. Распечатать его.
        2. Отсортировать его.
        3. Распечатать еще раз. */
        int[] num = {12, 7, 89, -4, 8, 9};
        System.out.println("Исходные числа: " + Arrays.toString(num) + ".");
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("Числа в порядке возрастания: " + Arrays.toString(num) + ".");

    }
}
