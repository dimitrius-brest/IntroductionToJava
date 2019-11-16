package by.my.introduction.level2.A_one_dimensional_arrays;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int n = 20;  // размерность массива
        int diapazon = 10;  // диапазон значений элементов массива

        // Генерируем массив
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int)(Math.random()*diapazon);
        }

        // Выводим исходную последовательность на экран
        System.out.println("Исходная последовательность:");
        System.out.println(Arrays.toString(a));

        // Ищем и выводим на экран минимальное число
        int min = a[0];
        boolean[] mins = new boolean[n];
        for (int i = 1; i < n; i++) {
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.print("Min = " + min + ", ");

        // Подсчёт количества элементов = min
        int minsCount = 0;
        for (int i = 0; i < n; i++) {
            if(a[i] == min){
                minsCount++;
                mins[i] = true;
            }
        }
        System.out.println("Количество Min элементов: " + minsCount);

        // Создаём новый массив, без элементов min
        int[] b = new int[n - minsCount];
        int iShift = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != min){
                b[i-iShift] = a[i];
            } else {
                iShift++;
            }
        }

        // Выводим на экран новую последовательность
        System.out.println("Новая последовательность:");
        System.out.println(Arrays.toString(b));
    }
}
