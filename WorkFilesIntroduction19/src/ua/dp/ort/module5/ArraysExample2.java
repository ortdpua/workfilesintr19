package ua.dp.ort.module5;

import java.util.Scanner;

public class ArraysExample2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] userNumbers = new int[10];

        int counter = 0;
        while (true) {
            
            if (counter >= userNumbers.length) {
                // create a new array
            }
            
            System.out.print("Please input " + (counter + 1) + "number > ");

            String userInput = scanner.nextLine();
            int userNumber = Integer.parseInt(userInput);
            
            if(userNumber == -1) {
                break;
            }

            userNumbers[counter] = userNumber;
            counter++;
        }
        scanner.close();
        
        int max = userNumbers[0];
        
        for (counter = 1 ; counter < userNumbers.length; counter++) {
            if (max < userNumbers[counter]) {
                max = userNumbers[counter];
            }
        }
        
        System.out.println("Min number is " + max);
    }
}