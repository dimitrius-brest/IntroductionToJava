package by.my.introduction.level2.A_one_dimensional_arrays;

import java.util.Locale;

public class Task7 {
    public static void main(String[] args) {
        int n = 20;  // размерность массива
        float diapazon = 10;  // диапазон значений элементов массива
        float max;

        // Генерируем массив
        float[] a = new float[n*2];
        for (int i = 0; i < n*2; i++) {
            a[i] = (float)(Math.random()*diapazon);
        }

        // Выводим содержимое массива на экран
        System.out.println("n = " + n);
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + (i+1) + "]=" + String.format(Locale.US, "%.2f ", a[i]));
        }
        System.out.println();
        for (int i = n; i < n*2; i++) {
            System.out.print("a[" + (i+1) + "]=" + String.format(Locale.US, "%.2f ", a[i]));
        }

        // Вычисляем max
        max = a[0] + a[(n*2)-1];
        for (int i = 1; i < n; i++) {
            float sum = a[i] + a[(n*2)-1-i];
            if (sum > max) {
                max = sum;
            }
        }

        System.out.println("\nmax(a[1]+a[2n], a[2]+a[2n-1], ..., a[n]+a[n+1]) = " + max);
    }
}
