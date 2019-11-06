package by.my.introduction.level1.A_linear;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer a, b, c, z;

        System.out.print("Введите a: ");
        a = in.nextInt();
        System.out.print("Введите b: ");
        b = in.nextInt();
        System.out.print("Введите c: ");
        c = in.nextInt();

        z = ((a - 3)* b / 2) + c;
        System.out.println("z = ((a - 3)* b / 2) + c    = " + z);
    }
}
