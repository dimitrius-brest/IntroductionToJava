package by.my.introduction.level1.linear;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y;
        System.out.print("Введите х : ");
        x = in.nextInt();
        System.out.print("Введите y : ");
        y = in.nextInt();
        if(y > 4 || y < -3 || x > 4 || x < -4){
            System.out.println("false");
            return;        }
        System.out.println("true");
    }
}
