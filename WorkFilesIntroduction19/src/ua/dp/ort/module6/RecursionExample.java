package ua.dp.ort.module6;

public class RecursionExample {

    static int findFactorial(int factorial) {
        if (factorial == 1) {
//            return 1;
        }
        return findFactorial(factorial - 1) * factorial;
    }

    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }
}
//FILO 