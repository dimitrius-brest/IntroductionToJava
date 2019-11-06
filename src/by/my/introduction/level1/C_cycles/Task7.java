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
        } while (Integer.signum(m) != 1);

        do {
            System.out.print("Введите n : ");
            n = in.nextInt();
        } while (n <= m);

        System.out.println("m = " + m + ", n = " + n);
        // TODO доделать задание

    }
}
