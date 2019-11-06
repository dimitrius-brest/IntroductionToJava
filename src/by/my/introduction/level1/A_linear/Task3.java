package by.my.introduction.level1.A_linear;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Float x, y;
        Double z;

        System.out.print("Введите x: ");
        x = in.nextFloat();
        System.out.print("Введите y: ");
        y = in.nextFloat();

        z = (Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
        System.out.println("z = " + z);
    }
}
