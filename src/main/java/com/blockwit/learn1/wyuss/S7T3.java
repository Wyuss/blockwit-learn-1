package com.blockwit.learn1.wyuss;

public class S7T3 {
    public static void main(String[] arg) {
        // Есть два массива.
        // Первый 7,4,2,8,6,7 и второй 6,2,9.
        // Вывести их на экран.
        // А затем создать такой массив, который вмещал бы первые два.
        // И скопировать в новый массив элементы первых двух массивов.
        // При этом элементы из первого и второго массивов должны чередоваться в новом массиве.
        // Если в какой-то момент из-за нехватки элементов в одном из массивов чередовать будет нельзя,
        // то копировать элементы из оставшегося массива.
        Helper s7t3 = new Helper();
        int[] a = {7, 4, 2, 8, 6, 7};
        int[] b = {6, 2, 9};
        int[] sum = new int[a.length + b.length];

        System.out.print("Массив первый: ");
        s7t3.printIntArray(a);      //метод printIntArray принимает массив чисел и распечатывает их.
        System.out.print("Массив второй: ");
        s7t3.printIntArray(b);

        // пока длина массива < 6.
        for (int i = 0; i < sum.length; i++) {
            if (i < 6) {
                if ((i + 1) % 2 == 0) {
                    sum[i] = b[i / 2];
                } else {
                    sum[i] = a[i / 2];
                }
            } else {
                sum[i] = a[i - 3];
            }
        }
        System.out.print("Массив с чередаванием элементов: ");
        s7t3.printIntArray(sum);
    }
}