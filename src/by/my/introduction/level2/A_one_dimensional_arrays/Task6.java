package by.my.introduction.level2.A_one_dimensional_arrays;

import java.util.Locale;

public class Task6 {
    public static void main(String[] args) {
        int n = 20;  // размерность массива
        float diapazon = 10;  // диапазон значений элементов массива
        float sum = 0;  // сумма элементов массива

        // Генерируем массив
        float[] a = new float[n];
        for (int i = 0; i < n; i++) {
            a[i] = (float)(Math.random()*diapazon);
        }

        for (float ai: a) {
            System.out.print(String.format(Locale.US, "%.2f ", ai));
        }
        System.out.println();

        // Массив, указывающий на то, является ли индекс простым числом
        boolean[] iIsSimple = new boolean[n];
        iIsSimple[0] = true;

        for (int i = 2; i < n; i++) {
            iIsSimple[i-1] = true;
            for (int j = 2; j <= i/j; j++) {
                if(i%j == 0) iIsSimple[i-1] = false;  // если число делится без остатка, значит оно не простое
            }
        }

        System.out.println("Index is simple?");
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ":" + iIsSimple[i] + " ");
            if(iIsSimple[i]) {
                sum += a[i];
            }
        }

        System.out.println("\nSum of elements with simple indexes = " + String.format(Locale.US, "%.2f ", sum));

    }
}
