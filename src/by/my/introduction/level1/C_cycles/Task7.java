package by.my.introduction.level1.C_cycles;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m, n;
        System.out.println("Задайте диапазон натуральных чисел от m до n");

        do {
            System.out.print("Введите m : ");
            m = in.nextInt();
        } while (Integer.signum(m) != 1);  // Проверить, что число натуральное

        do {
            System.out.print("Введите n : ");
            n = in.nextInt();
        } while (n <= m);             // n должно быть больше, чем m

        System.out.println("m = " + m + ", n = " + n);

        for(int i=m; i<=n; i++) {
            System.out.print("Число: " + i + ", делители: ");
            for(int delitel=2; delitel<i; delitel++){
                if(i % delitel == 0) {    // если остаток от деления равен 0, выводим делитель на экран
                    System.out.print(delitel + " ");
                }
            }
            System.out.println();
        }
    }
}
