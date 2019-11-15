package by.my.introduction.level2.A_one_dimensional_arrays;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, k;
        int sumOfElements = 0;
        int[] a;

        System.out.print("Введите длину массива N : ");
        n = in.nextInt();
        System.out.print("Введите кратность K : ");
        k = in.nextInt();

        a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = (int)(Math.random()*100) + 1;  //  Заполняем массив случайными числами от 1 до 100
            if(a[i]%k == 0){
                sumOfElements += a[i];
            }
        }

        System.out.print("Массив чисел : ");
        for(int ai : a){
            System.out.print(ai + " ");
        }

        System.out.println("\nСумма элементов массива, кратных K = " + sumOfElements);

    }
}
