package com.company;

import java.util.Scanner;

class UserInput {
    Scanner scanner = new Scanner(System.in);

    public int promptInt(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid integer. " + message);
                userInput = scanner.nextLine();
            }
        }

        System.out.println(userInt + " is a valid integer");
        return userInt;
        
    }

    public double promptDouble(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        double userDouble = 0.0;
        boolean isDouble = false;
        while (!isDouble) {
            try {
                userDouble = Double.parseDouble(userInput);
                isDouble = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid double. " + message);
                userInput = scanner.nextLine();
            }
        }

        System.out.println(userDouble + " is a valid double");
        return userDouble;
    }

    public String promptString(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();
        String userString = "";

        boolean isString = false;
        while (!isString) {
            try {
                double doubleNum = Double.parseDouble(userInput);
                
                System.out.println(doubleNum + " is not a valid string. " + message);
                isString = false;
                System.out.println("Please enter a string");
                userInput = scanner.nextLine();
            }
            catch (NumberFormatException e) {
                isString = true;
                break;
            }
        }

        System.out.println(userInput + " is a valid string");
        return userString;
    }

}




public class Main {
    public static void main(String[] args) {
        UserInput input = new UserInput();
        input.promptInt("Enter an integer.");
        
        input.promptDouble("Enter a double.");
        
        input.promptString("Enter a string.");

    }
}
