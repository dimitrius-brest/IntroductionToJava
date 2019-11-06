package by.my.introduction.level1.A_linear;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a, a1;

        System.out.print("Введите a : ");
        a = in.nextFloat();
        int b = (int)a;                 // целая часть
        int c = (int)((a - b) * 1000);  // дробная часть

        a1 = c + (float)b/1000;
        System.out.println("Новое число = " + a1);
    }
}
