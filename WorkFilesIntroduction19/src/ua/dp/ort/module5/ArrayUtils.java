package ua.dp.ort.module5;

import java.util.Arrays;

public class ArrayUtils {

    public static void main(String[] args) {

        int[] a = { 2, 4, 5, 8, 1 };

        Arrays.sort(a);
        
        a = Arrays.copyOf(a, 20);

        System.out.println();
        
       System.out.println( Arrays.toString(a));
      int b[] = Arrays.copyOfRange(a, 2, 4);
      System.out.println( Arrays.toString(b));
      
      
      
    }

}
