package ua.dp.ort.module5;

import java.util.Scanner;

public class ArraysExample1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] userNumbers = new int[10];

        for (int counter = 0; counter < 10; counter++) {
            System.out.print("Please input " + (counter + 1) + "number > ");

            String userInput = scanner.nextLine();
            int userNumber = Integer.parseInt(userInput);

            userNumbers[counter] = userNumber;
        }
        scanner.close();
        
        int max = userNumbers[0];
        
        for (int counter = 1 ; counter < userNumbers.length; counter++) {
            if (max < userNumbers[counter]) {
                max = userNumbers[counter];
            }
        }
        
        System.out.println("Min number is " + max);
    }
}
