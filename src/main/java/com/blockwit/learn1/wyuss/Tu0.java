package com.blockwit.learn1.wyuss;
public class Tu0 {
    public static void main(String[] arg) {
        /* Задан массив чисел 12,7,89,-4,8,9. Необходимо:
         1. Распечатать его.
         2. Отсортировать его.
         3. Распечатать еще раз.*/
        int [] array = {12, 7, 89, -4, 8, 9};
        System.out.print("Исходные числа: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
            System.out.println();
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
            System.out.print("Числа в порядке возрастания: ");
            for (int i : array) {
                System.out.print( i + " ");
            }
    }
}
