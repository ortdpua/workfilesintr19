package ua.dp.ort.module5;
import java.util.Arrays;

public class BubleSort {

    public static void main(String[] args) {
        int[] array = { 11, 3, 14, 16, 7, -9 };    //Length 6
                        //0 1  2   3   4   5
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
        //*  -
        //*  +
        //*
        //*
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            System.out.println("---------------");
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                    System.out.println(Arrays.toString(array));
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
