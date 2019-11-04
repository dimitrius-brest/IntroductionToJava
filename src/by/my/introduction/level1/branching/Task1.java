package by.my.introduction.level1.branching;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a, b;
        System.out.print("Введите угол a : ");
        a = in.nextFloat();
        System.out.print("Введите угол b : ");
        b = in.nextFloat();
        if((180 - a - b) <= 0) {
            System.out.println("Треугольник не существует. Сумма углов > 180.");
        } else {
            System.out.print("Треугольник существует. ");
            if( a == 90 || b==90 || (a+b) == 90 ){
                System.out.println("Он прямоугольный.");
            } else {
                System.out.println("Он не прямоугольный.");
            }
        }
    }
}
