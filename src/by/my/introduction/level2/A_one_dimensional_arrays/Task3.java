package by.my.introduction.level2.A_one_dimensional_arrays;

import java.util.Locale;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.print("Введите размерность массива N : ");
        n = in.nextInt();

        // Генерируем массив
        float[] a = new float[n];
        for (int i = 0; i < n; i++) {
            a[i] = (float)(Math.random()*200) - 100;
        }

        // Добавим пару нулей в случайные элементы массива
        a[(int)(Math.random()*n)] = 0;
        a[(int)(Math.random()*n)] = 0;

        // Выводим массив на экран
        System.out.println("Сгенерированный массив :");
        for(float ai : a){
            System.out.print(String.format(Locale.US, "%.2f ", ai));
        }

        int positive = 0;
        int negative = 0;
        int zeros = 0;

        for (int i = 0; i < n; i++) {
            if(a[i] > 0){
                positive++;
            } else if(a[i] < 0) {
                negative++;
            } else {
                zeros++;
            }
        }

        System.out.println("\nПоложительных элементов : " + positive);
        System.out.println("Отрицательных элементов : " + negative);
        System.out.println("Нулевых элементов : " + zeros);
    }
}
