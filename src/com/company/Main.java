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

        return userInt;
    }

    public double promptDouble(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        double userDouble = 0;
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

        return userDouble;
    }

    public double promptString(String message) {
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

        return userDouble;
    }

}




public class Main {
    public static void main(String[] args) {
        UserInput input = new UserInput();
        int aNumber = input.promptInt("Enter an integer.");
        System.out.println(aNumber + " is valid");

        double bNumber = input.promptDouble("Enter a double.");
        System.out.println(bNumber + " is valid");

    }
}
