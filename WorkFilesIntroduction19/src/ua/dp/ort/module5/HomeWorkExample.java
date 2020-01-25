package ua.dp.ort.module5;

import java.util.Arrays;

public class HomeWorkExample {

    public static void main(String[] args) {
        int[] a = { 10, -7, -5, 9, 7, 6, 6, -7, -3, -5 };

        int[] negativeNumbers = new int[10];
        int negativeCounter = 0;

        int[] positiveNumbers = new int[10];
        int positiveCounter = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                negativeNumbers[negativeCounter++] = a[i];
            } else {
                positiveNumbers[positiveCounter++] = a[i];
            }
        }

        System.out.println(Arrays.toString(negativeNumbers));
        System.out.println(Arrays.toString(positiveNumbers));
    }
}
