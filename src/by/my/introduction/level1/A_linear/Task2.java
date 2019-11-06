package by.my.introduction.level1.A_linear;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Float a, b, c;
        Double z;

        System.out.print("Введите a: ");
        a = in.nextFloat();
        System.out.print("Введите b: ");
        b = in.nextFloat();
        System.out.print("Введите c: ");
        c = in.nextFloat();

        z = (b + Math.sqrt(Math.pow(b,2) + 4*a*c))/(2*a) - Math.pow(a,3)*c + Math.pow(b,-2);
        System.out.println("z = " + z);
    }
}
