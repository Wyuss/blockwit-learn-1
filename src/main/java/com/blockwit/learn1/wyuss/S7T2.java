package com.blockwit.learn1.wyuss;

public class S7T2 {
    public static void main(String[] arg) {
        // Есть два массива.
        // Вывести их на экран.
        // Создать новый массив, при этом элементы из первого и второго массивов должны чередоваться в новом массиве.
        Helper s7t2 = new Helper();
        int[] a = {6,3,8,9};
        int[] b = {0,3,1,5};
        int[] sum = new int[a.length + b.length];

        System.out.print("Массив первый: ");
        s7t2.printIntArray(a);      //метод printIntArray принимает массив чисел и распечатывает их.
        System.out.print("Массив второй: ");
        s7t2.printIntArray(b);

        for (int i = 0; i < sum.length; i++) {
            if ((i+1) % 2 == 0) {
                sum[i] = b[i/2];
            } else {
                sum[i] = a[i/2];
            }
        }
        System.out.print("Массив с чередаванием элементов: ");
        s7t2.printIntArray(sum);
    }
}