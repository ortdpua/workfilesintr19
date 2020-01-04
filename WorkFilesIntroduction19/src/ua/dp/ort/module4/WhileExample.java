package ua.dp.ort.module4;

import java.util.Scanner;

public class WhileExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sideA = 0.0;
        double sideB = 0.0;
        String userInput;

        while (true) {
            System.out.print("Input value for side A :");
            userInput = scanner.nextLine();
            double unchekedSideAValue = Double.parseDouble(userInput);
            
            if (unchekedSideAValue <= 0) {
                System.out.println("Your input is not correct");
                continue;
            } else {
                sideA = unchekedSideAValue;
                break;
            }
        }
        
        while (true) {
            System.out.print("Input value for side B :");
            userInput = scanner.nextLine();
            double unchekedSideAValue = Double.parseDouble(userInput);
            
            if (unchekedSideAValue <= 0) {
                System.out.println("Your input is not correct");
                continue;
            } else {
                sideB = unchekedSideAValue;
                break;
            }
        }
        scanner.close();
        System.out.println("The area of rectangle is " + (sideA * sideB));
    }
}














