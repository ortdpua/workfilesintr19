package ua.dp.ort.module3;

import java.util.Scanner;

public class UserInputExample {
    public static final int MILLIONER = 1_000_000;
    public static final int OLD_PERSON = 65;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String userInput;
        System.out.println("Input your name -> ");
        userInput = scanner.nextLine();

        System.out.println("Input your age -> ");
        userInput = scanner.nextLine();
        int age = Integer.parseInt(userInput);

        System.out.println("Input how much money do you have? -> ");
        userInput = scanner.nextLine();
        int userMoney = Integer.parseInt(userInput);
        
        String userInfo = "Your age is " + age;
        
        if (userMoney >= MILLIONER) {
            userInfo = userInfo + " and you are rich!!!!";
        } else {
            userInfo = userInfo + "and you are not rich, go to work!!! right now, you need " + (MILLIONER - userMoney);
        }
        
        if (age >= OLD_PERSON) {
            userInfo = userInfo + " and you are an old person";
        }
        System.out.println(userInfo);
        scanner.close();
    }
}
