package by.my.introduction.level1.branching;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Float x;
        Double f;

        System.out.print("Введите x : ");
        x = in.nextFloat();

        if(x<=3) {
            f = Math.pow(x,2) - 3*x +9;
        } else {
            f = 1/(Math.pow(x,3) + 6);
        }
        System.out.println("F(x) = " + f);
    }
}
