package com.blockwit.learn1.wyuss;
import java.util.Arrays;
public class Tu0 {
    public static void main(String[] arg) {
        /* Задан массив чисел 12,7,89,-4,8,9. Необходимо:
         1. Распечатать его.
         2. Отсортировать его.
         3. Распечатать еще раз.*/
        int [] num = {12, 7, 89, -4, 8, 9};
        System.out.print("Исходные числа: ");
        for (int i = 0; i < num.length - 1; i++) {
            System.out.print(num[i] + ", ");
        }
            System.out.println( num[num.length - 1] + ".");

        Arrays.sort(num);
        System.out.println( "Числа в порядке возрастания: " + Arrays.toString(num) + ".");
    }
}
