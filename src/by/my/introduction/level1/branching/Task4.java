package by.my.introduction.level1.branching;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer a, b, x, y, z;
        Integer minHole, maxHole;
        Integer minBrick, maxBrick;

        System.out.print("Введите A : ");
        a = in.nextInt();
        System.out.print("Введите B : ");
        b = in.nextInt();
        System.out.print("Введите x : ");
        x = in.nextInt();
        System.out.print("Введите y : ");
        y = in.nextInt();
        System.out.print("Введите z : ");
        z = in.nextInt();

        if(a<=b) {
            minHole = a; maxHole = b;
        } else {
            minHole = b; maxHole = a;
        }

        if(x<=y) {
            minBrick = x; maxBrick = y;
        } else {
            minBrick = y; maxBrick = x;
        }

        if((z<maxBrick) && (z>minBrick)) maxBrick = z;

        if(z<minBrick) {
            maxBrick = minBrick;
            minBrick = z;
        }

        System.out.println(
                (maxBrick <= maxHole) && (minBrick <= minHole)
                ? "Кирпич проходит"
                : "Кирпич не проходит"
        );

    }
}
