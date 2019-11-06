package by.my.introduction.level1.C_cycles;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer x, sum;

        do {
            System.out.print("Введите целое положительное число : ");
            x = in.nextInt();
        } while (Integer.signum(x) != 1);

        sum = 0;
        for(int i=1; i<=x; i++)
            sum += i;

        System.out.println("Сумма всех чисел от 1 до " + x + " равна : " + sum);
    }
}
