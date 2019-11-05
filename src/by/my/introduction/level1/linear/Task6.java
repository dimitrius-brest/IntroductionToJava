package by.my.introduction.level1.linear;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y;
        boolean inside;

        System.out.print("Введите х : ");
        x = in.nextInt();
        System.out.print("Введите y : ");
        y = in.nextInt();
        inside = (y>0 && y<=4 && x<=2 && x>=-2) ||
                 (y<=0 && y>=-3 && x<=4 && x>=-4) &&
                 !(x == 0 && y == -1)
                ? true : false;

        System.out.println(inside);
    }
}
