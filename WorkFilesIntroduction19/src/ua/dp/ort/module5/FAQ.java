package ua.dp.ort.module5;

import java.util.Scanner;

public class FAQ {

    public static void main(String[] args) {

//        int [] a = {2, 3,4 };
        
        Scanner [] b = new Scanner[20];
        
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        b[0] = scanner1;
        b[1] = scanner2;
//        b[0] = 55;
        
        System.out.println(b);
        System.out.println(b.hashCode());
        
    }

}
