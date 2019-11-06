package by.my.introduction.level1.B_branching;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, d;
        int min1, min2;

        System.out.print("Введите a : ");
        a = in.nextInt();
        System.out.print("Введите b : ");
        b = in.nextInt();
        System.out.print("Введите c : ");
        c = in.nextInt();
        System.out.print("Введите d : ");
        d = in.nextInt();

        min1 = a <= b ? a : b;
        min2 = c <= d ? c : d;
        System.out.println(min1 >= min2 ? min1 : min2);
    }
}
