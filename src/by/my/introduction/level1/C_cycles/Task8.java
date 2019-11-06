package by.my.introduction.level1.C_cycles;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;

        System.out.print("Введите число a : ");
        a = in.nextInt();
        System.out.print("Введите число b : ");
        b = in.nextInt();

        boolean[] aDigits = new boolean[10];    // цифры в числе a
        boolean[] bDigits = new boolean[10];    // цифры в числе b
        Arrays.fill(aDigits, false);
        Arrays.fill(bDigits, false);

        while (a > 0) {         // Перебираем все цифры в числе a
            aDigits[a % 10] = true;   //  остаток от деления на 10 - цифра, присутствующая в числе
            a = a/10;
        }

        while (b > 0) {          // Перебираем все цифры в числе b
            bDigits[b % 10] = true;  //  остаток от деления на 10 - цифра, присутствующая в числе
            b = b/10;
        }

        System.out.println("Цифры, входящие как в a, так и в b:");
        for(int i=0; i<=9; i++){
            if(aDigits[i] && bDigits[i]) {
                System.out.print(i + " ");
            }
        }

    }
}
