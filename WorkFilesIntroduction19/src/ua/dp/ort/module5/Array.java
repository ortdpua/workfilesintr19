package ua.dp.ort.module5;

public class Array {

    public static void main(String[] args) {

        // array init 0 1 2 3 4 5 error
        int[] arrayTest1 = { 111, 222, 333, 4444, 897687 };
//        System.out.println(arrayTest1[0]);
//        System.out.println(arrayTest1[1]);
//        System.out.println(arrayTest1[2]);

//        int sum = 0;
//        for(int counter = 0; counter < arrayTest1.length; counter++) {
//            sum+=arrayTest1[counter];
//        }
//        System.out.println(sum / arrayTest1.length);

        int size = 100;
        
        int[] arrayTest = new int[size];
        arrayTest[0] = 1;
        arrayTest[4] = 10;
        arrayTest[4] = 5;
        
        System.out.println(arrayTest[0] + arrayTest[4]);

        for (int counter = 0; counter < arrayTest.length; counter++) {
//            System.out.println("[" + counter + "]" + arrayTest[counter]);
        }

    }

}
