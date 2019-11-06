package by.my.introduction.level1.A_linear;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t, h, m, s;
        System.out.print("Введите натуральное число T : ");
        t = in.nextInt();
        h = t / 3600;
        m = t/60 - h*60;
        s = t - h*3600 - m*60;
        System.out.printf("%02dч %02dмин %02dс", h, m, s);
    }
}
