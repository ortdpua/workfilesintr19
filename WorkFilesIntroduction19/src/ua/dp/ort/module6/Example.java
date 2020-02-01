package ua.dp.ort.module6;

import java.util.Scanner;

public class Example {

    public static double getUserInput(Scanner scanner) {
        String userInput = scanner.nextLine();
        return Double.parseDouble(userInput);
    }

    public static double getResult(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number > ");
        double firstNumber = getUserInput(scanner);

        System.out.print("Input second number > ");
        double secondNumber = getUserInput(scanner);

        System.out.println("Sum is " + getResult(firstNumber, secondNumber));
        scanner.close();

    }

}
