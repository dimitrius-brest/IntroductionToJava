package by.my.introduction.level1.C_cycles;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;

        System.out.print("Введите строку : ");
        str = in.nextLine();

        char[] charArray = str.toCharArray();
        for(char ch : charArray){
            System.out.println("Символ: " + ch + " - код: " + (int)ch);
        }
    }
}
