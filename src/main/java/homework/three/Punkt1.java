package homework.three;

import java.util.Arrays;
import java.util.Random;

public class Punkt1 {

    public static void main(String[] args) {
        int[] numbers = new int[30];

        for (int i = 0; i < 30; i++) {
            if(Math.random() > 0.3) {
                numbers[i] = 5;
            } else {
                numbers[i] = Integer.MIN_VALUE;
            }
        }
        System.out.println("Filled array: " + Arrays.toString(numbers));

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != Integer.MIN_VALUE) {
                count = count + 1;
            }
        }

        System.out.println("Count of elements not equal Integer.MIN_VALUE: " + count);
    }

}
