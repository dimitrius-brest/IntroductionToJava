package by.my.introduction.level1.C_cycles;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Float a, b, h;

        System.out.println("Задайте отрезок [a,b]");
        System.out.print("Введите a : ");
        a = in.nextFloat();
        System.out.print("Введите b : ");
        b = in.nextFloat();
        System.out.print("Введите шаг h : ");
        h = in.nextFloat();
        System.out.printf("%.2f %.2f %.2f\n", a, b, h);

        for(Float x = a; x <=b; x+=h){
            System.out.print( x>2 ? x + " " : -x + " ");
        }
    }
}
