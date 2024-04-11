package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the basic calculator. Choose your first number. ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Your first number is " + firstNumber + ". Choose your second number.");
        int secondNumber = scanner.nextInt();
        System.out.println("Would you like to Add(a), Subtract(s), Multiply(m), or Divide(d) the two numbers? ");
        System.out.println("Choose a, s, m, or d. ");
        String letterChoice = scanner.next();

        if (letterChoice.equalsIgnoreCase("a")) {
            int sum = firstNumber + secondNumber;
            System.out.println(firstNumber + secondNumber);
            System.out.println("The result is: " + sum);
        }
        if (letterChoice.equalsIgnoreCase("s")) {
            int difference = firstNumber - secondNumber;
            System.out.println("The result is: " + difference);
        }
        else if(letterChoice.equalsIgnoreCase("m")){
            int product = firstNumber * secondNumber;
            System.out.println("The result is " + product);
        }
        else if(letterChoice.equalsIgnoreCase("d")){
            int quotient = firstNumber / secondNumber;
            System.out.println("The result is "+ quotient);
        }
    }
}