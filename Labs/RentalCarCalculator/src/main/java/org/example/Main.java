package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pickup date for your rental car. ");
        String pickupDate = scanner.nextLine();
        System.out.println("How many days will you be renting this vehicle? ");
        int nextInt = scanner.nextInt();
        System.out.println("Would you like an electronic toll tag for $3.95/day? Enter Yes or No. ");
        String nextLine = scanner.nextLine();
        System.out.println("Would you like GPS services for $2.95/day? Enter Yes or No. ");
        String gpsService = scanner.nextLine();
        System.out.println("Would you like to add roadside assistance? Enter Yes or No. ");
        String roadsideService = scanner.nextLine();
        System.out.println("Enter your current age. ");
        int age = scanner.nextInt();







    }
}