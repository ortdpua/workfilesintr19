package ua.dp.ort.module5;

import java.util.Arrays;

public class TwoDimArray {

    public static void main(String[] args) {

//        int a [][] = new int [4][7];
//        
//        a[1][5] = 9;
//        System.out.println(a.length); // number of lines
//        System.out.println(a[1].length); // number of columns
//        
//        for (int i = 0 ; i < a.length; i++) { // lines
//            for (int j = 0; j < a[i].length; j ++) { // columns
//                System.out.print(a[i][j]);
//            }
//            System.out.println();
//        }
        
        
        int [][] b = {
                {1, 2, 4, 5 , 6},
                {7, 8, 9 , 0, 8, 55, 6, 6,  6, 6,6 ,6, 6,9},
                {11, 22, 33, 44, 55}
        };
        
        for (int i = 0; i < b.length; i++) { // lines
            for (int j = 0; j < b[i].length; j++) { // columns
                
                System.out.print(" " + b[i][j]);
            }
            System.out.println();
  }
//        System.out.println(Arrays.toString(b[1]));
        
        
        int [][] c = new int [4][4];
        
        c[1][3] = 7;


    }

}
