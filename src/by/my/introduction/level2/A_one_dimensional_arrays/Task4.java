package by.my.introduction.level2.A_one_dimensional_arrays;

import java.util.Locale;

public class Task4 {
    public static void main(String[] args) {
        int n = 20;  // размерность массива
        float diapazon = 100;  // диапазон значений элементов массива
        float minElement, maxElement;  // минимальный и максимальный элементы массива
        int minElementPos, maxElementPos;  // позиция в массиве минимального и максимального элементов

        // Генерируем массив
        float[] a = new float[n];
        for (int i = 0; i < n; i++) {
            a[i] = (float)(Math.random()*diapazon*2) - diapazon;
        }
        minElement = a[0];
        maxElement = a[0];
        minElementPos = 0;
        maxElementPos = 0;

        // Выводим массив на экран; вычисляем минимальный и максимальный элементы массива
        System.out.println("Сгенерированный массив :");
        for (int i = 0; i < n; i++) {
            System.out.print(String.format(Locale.US, "%.2f ", a[i]));
            if(a[i] < minElement){
                minElement = a[i];
                minElementPos = i;
            }
            if(a[i] > maxElement){
                maxElement = a[i];
                maxElementPos = i;
            }
        }

        System.out.println("\nМаксимальный элемент : " + maxElement);
        System.out.println("Минимальный элемент : " + minElement);

        // Меняем местами минимальный и максимальный элементы массива
        a[minElementPos] = maxElement;
        a[maxElementPos] = minElement;

        System.out.println("Меняем местами минимальный и максимальный элементы массива : ");
        for (float ai : a) {
            System.out.print(String.format(Locale.US, "%.2f ", ai));
        }
    }
}
