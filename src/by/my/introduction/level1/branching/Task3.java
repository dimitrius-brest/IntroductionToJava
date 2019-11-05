package by.my.introduction.level1.branching;

import java.util.Locale;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Float x1, y1, x2, y2, x3, y3;

        System.out.print("Введите x1 : ");
        x1 = in.nextFloat();
        System.out.print("Введите y1 : ");
        y1 = in.nextFloat();
        System.out.print("Введите x2 : ");
        x2 = in.nextFloat();
        System.out.print("Введите y2 : ");
        y2 = in.nextFloat();
        System.out.print("Введите x3 : ");
        x3 = in.nextFloat();
        System.out.print("Введите y3 : ");
        y3 = in.nextFloat();
        System.out.printf(String.format(Locale.US, "A(%.2f,%.2f); B(%.2f,%.2f); C(%.2f,%.2f)\n", x1, y1, x2, y2, x3, y3));
        System.out.println(
                (x3-x1)/(x3-x2) == (y3-y1)/(y3-y2)
                ? "Точки лежат на одной прямой"
                : "Точки не лежат на одной прямой"
        );
    }
}
