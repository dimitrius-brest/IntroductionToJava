package by.my.introduction.level2.A_one_dimensional_arrays;

public class Task5 {
    public static void main(String[] args) {
        int n = 20;  // размерность массива
        float diapazon = 20;  // диапазон значений элементов массива

        // Генерируем массив
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int)(Math.random()*diapazon*2 - diapazon);
        }

        System.out.println("Весь массив : ");
        for (int ai : a) {
            System.out.print(ai + " ");
        }

        System.out.println("\nТолько те элементы, в которых a[i] > i :");
        for (int i = 0; i < n; i++) {
            if(a[i] > i) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
