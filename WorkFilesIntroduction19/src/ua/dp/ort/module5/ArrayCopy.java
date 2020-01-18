package ua.dp.ort.module5;

public class ArrayCopy {

    public static void main(String[] args) {

        int [] a = new int [2];
        a[0] = 5;
        a[1] = 10;
        
        int [] b = new int [a.length * 2];
        
        for (int counter = 0; counter < a.length; counter++) {
            b[counter] = a[counter];
        }
        a = b;
        System.out.println();
        
    }

}
