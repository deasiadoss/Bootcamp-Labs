package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the basic calculator. Choose your first number. ");
        Scanner scanner = new scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Your first number is " + firstNumber + " Choose your second number." );
        int secondNumber = scanner.nextInt();
        System.out.println("Would you like to Add(a), Subtract(s), Multiply(m), or Divide(d) the two numbers? ");
        System.out.println("Choose a, s, m, or d. ");
        String letterChoice = scanner.nextLine();
        if (letterChoice.equalsIgnoreCase("a")) {

            System.out.println(firstNumber + secondNumber);
            System.out.println("The result is: " + sum);
        }
        if (letterChoice.equalsIgnoreCase("s")){
            int sum = addNumber(firstNumber, secondNumber);
            System.out.println("The answer is:" + sum);
        }





        public static float addNumber(int firstNumber, int secondNumber){
            int sum = firstNumber + secondNumber;
            return sum;
        }
        public static float subtractNumber(int firstNumber, int secondNumber){
            int difference = firstNumber - secondNumber;
            return difference;
        }
        public static float multiplyNumber(int firstNumber, int secondNumber){
            int product = firstNumber * secondNumber;
            return product;
        }
        public static float divideNumber(int firstNumber, int secondNumber){
            int quotient = firstNumber / secondNumber;
        }
//        System.out.println("Enter your first Number. ");
//        Scanner scanner = new Scanner(System.in);
//        int firstNumber = scanner.nextInt();
//        System.out.println("Enter your second number. ");
//        Scanner Scanner = new Scanner(System.in);
//        int secondNumber = scanner.nextInt();
//        System.out.println("Would you like to Add(A), Subtract (S), Multiply (M), or Divide(D) the First Number from the Second Number?  ");
//        System.out.println("Choose A, S, M, D ");
//        String result = scanner.nextLine();
//        if (result.equalsIgnoreCase("a")) {
//            System.out.println(firstNumber + secondNumber);   ;
//        }
//        else if(result.equalsIgnoreCase("s")) {
//            System.out.println(firstNumber - secondNumber);
//        }
//        else if(result.equalsIgnoreCase("m")){
//            System.out.println(firstNumber * secondNumber);}
//        else if (result.equalsIgnoreCase("d")){
//            System.out.println(firstNumber / secondNumber);}
        public static int checkNumber(int number){
            //Not all code paths return a value - missing the return for one of
            //your conditions
            if(number > 0){
                return 1;
            }
            else if(number <0);
            return -1;
        }
        else{
            return 0;
        }


    }

}


