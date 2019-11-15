package by.my.introduction.level2.A_one_dimensional_arrays;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float z;
        int n = 20;
        float[] a = new float[n];
        int numberOfReplacements = 0;

        for (int i = 0; i < n; i++) {
            a[i] = (float)(Math.random()*100);
        }
        System.out.println("Исходный массив :");
        for(float ai : a){
            System.out.print(String.format(Locale.US, "%.2f ", ai));
        }

        System.out.print("\nВведите Z : ");
        z = in.nextFloat();

        for (int i = 0; i < n; i++) {
            if(a[i] > z) {
                a[i] = z;
                numberOfReplacements++;
            }
        }
        System.out.println("\nИтоговый массив :");
        for(float ai : a){
            System.out.print(String.format(Locale.US, "%.2f ", ai));
        }
        System.out.println("\nКоличество замен = " + numberOfReplacements);

    }
}
