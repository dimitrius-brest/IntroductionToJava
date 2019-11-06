package by.my.introduction.level1.C_cycles;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double e;
        System.out.print("Введите e : ");
        e = in.nextDouble();

        double a, sum = 0;
        int i = 1;
        do {
            a = 1/Math.pow(2,i) + 1/Math.pow(3,i);
            if(Math.abs(a)>= e) {
                System.out.println("a[" + i + "] = " + a);
                i++;
                sum += a;
            }
        } while (Math.abs(a)>= e);

        System.out.println("Сумма : " + sum);
    }
}
