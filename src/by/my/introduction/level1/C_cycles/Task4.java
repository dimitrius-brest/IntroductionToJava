package by.my.introduction.level1.C_cycles;

public class Task4 {
    public static void main(String[] args) {
        int proizv = 1;

        for(int i=1; i<=200; i++){
            proizv *= Math.pow(i,2);
        }

        System.out.println("Произведение квадратов чисел от 1 до 200 равно : " + proizv);

    }
}
