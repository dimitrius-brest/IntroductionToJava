package by.my.learn;

import java.util.Arrays;

public class LearnMain {
    public static void main(String[] args) {
       int[] array = {21,22,23,24};
       int[] hold = {49,48,47,46,45,44,43,42};
       System.arraycopy(array, 0, hold, 2, array.length);
       System.out.println(Arrays.toString(hold));
    }
}
