package ua.dp.ort.module6;

import java.util.Arrays;

public class ParamsAndMethod {
    
    public static int method (int qqqqqa, int qqqqqb) {
//        System.out.println(qqqqqa);
//        System.out.println(qqqqqb);
        
        return qqqqqa + 1;
    }
    
    public static void method1 (int []a , int[] b) {
        
        a[0] = 99999;
        
        a = b;
        System.out.println();
        
    }

    public static void main(String[] args) {

        int a [] = {1,1,1,1,1,};
        
        int b[] = a;
        int c[] = a;
        int d[] = a;
        
        b[0] = 10;
        c[0] = 20;
        d[0] = 30;
        
        
        System.out.println(Arrays.toString(a));
    }

}
