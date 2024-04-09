package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 12;
        System.out.println("Hi, The first number is 5. The second number is 12.");
        System.out.println("Would you like to Add(a), Subtract(s), Multiply(m), or Divide(d) the first number from the second number? \n");
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();

        if(result.equalsIgnoreCase("a")) {
            System.out.println(firstNumber + secondNumber);
        }
        else if(result.equalsIgnoreCase("s"))
            System.out.println(firstNumber - secondNumber);
        else if(result.equalsIgnoreCase("m"))
            System.out.println(firstNumber * secondNumber);
        else if (result.equalsIgnoreCase("d"))
            System.out.println(firstNumber / secondNumber);






        }

    }


