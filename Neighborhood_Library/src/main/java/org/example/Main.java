package org.example;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    private static List<Book> library = new ArrayList<>();
    public static void main(String[] args) {
        library();
        displayHomeScreen();
    }
    private static void library() {
        library.add(new Book(1, "1-11", "My Way or the Highway or the Interstate", false, ""));
        library.add(new Book(2, "2-22", "Wives With Knives", false, ""));
        library.add(new Book(3, "3-33", "Death Spells: How to Deal With Annoying Siblings", false, ""));
        library.add(new Book(4, "4-44", "Gaslighting 101", false, ""));
        library.add(new Book(5, "5-55", "I'm Sorry You Feel That Way", false, ""));
        library.add(new Book(6, "6-66", "Diddy do it or Diddy not: Convicted Killer", false, ""));
        library.add(new Book(7, "7-77", "Eighth Wonder of the World", false, ""));
        library.add(new Book(8, "8-88", "Green Eggs and Ham: Vegan Addition", false, ""));
        library.add(new Book(9, "9-99", "Java for Dummies", false, ""));
        library.add(new Book(10, "10-10", "I Need A Nap And So Do You", false, ""));
        library.add(new Book(11, "11-11", "My Instructor is Scared of Bees", false, ""));
        library.add(new Book(12, "12-12", "The Rat in the Hat", false, ""));
        library.add(new Book(13, "13-13", "How to Become A Villian", true, "Megan"));
        library.add(new Book(14, "14-14", "Secret to Winning the Lottery", true, "Britt"));
        library.add(new Book(15, "15-15", "I Really Don't Like You", true, "Joe"));
        library.add(new Book(16, "16-16", "Wheel of Unfortune", true, "Terry"));
        library.add(new Book(17, "17-17", "Sugar, Spice, and Everything Nice", true, "Shawn"));
        library.add(new Book(18, "18-18", "American Nightmare", true, "Cara"));
        library.add(new Book(19, "19-19", "Newsflash Buddy!", true, "Davie"));
        library.add(new Book(20, "20-20", "Peter Pot", true, "Amanda"));
    }
    private static void displayHomeScreen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Neighborhood Library!");
        System.out.println("1) Show Available Books");
        System.out.println("2) Show Checked Out Books");
        System.out.println("3) Exit");
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1:
                showAvailableBooks();
                break;
            case 2:
                showCheckedOutBooks();
                break;
            case 3:
                System.out.println("Thank You For Using The Neighborhood Library App! Goodbye. ");
                System.exit(0);
                break;
            default:
                System.out.println("Sorry, that is not a valid response. Please try again. ");
                displayHomeScreen();
                break;
        }
    }

    public static void showAvailableBooks() {
        System.out.println("Books Available For Checkout: ");
        for (Book book : library) {
            if (!book.isCheckedOut()) {
                System.out.println("ID: " + book.getBookID() + ", ISBN" + book.getIsbn() + ", Title: " + book.getTitle());
            }
        }
        System.out.println("Enter the Book ID of the book you wish to checkout. Enter 00 to go back to the home screen: ");
        Scanner scanner = new Scanner(System.in);
        int bookId = scanner.nextInt();
        if (bookId == 00) {
            displayHomeScreen();
        }
        else {
            System.out.println("Enter your name to proceed. ");
            String name = scanner.next();
            for (Book book : library) {
                if (book.getBookID() == bookId) {

                    book.checkOut(name);
                    System.out.println("Press H to return to the home screen");
                    String userAnswer = scanner.next();
                    if (userAnswer.equalsIgnoreCase("H")){
                        displayHomeScreen();
                    }
                    else{
                        System.out.println("Sorry that is not a valid response. Try Again. ");
                    }
                    break;
                }
            }
        }
    }
            private static void showCheckedOutBooks(){
                System.out.println("Books Currently Checked Out: ");
                for (Book book : library) {
                    if (book.isCheckedOut()) {
                        System.out.println("ID: " + book.getBookID() + ", ISBN: " + book.getIsbn() + ", Title: " + book.getTitle() + ", Checked Out To: " + book.getCheckedOutTo());
                    }
                }
            System.out.println("Choose An Option: ");
            System.out.println("C) Check in a book ");
            System.out.println("X) Go Back to the Home Screen");
            Scanner scanner1 = new Scanner(System.in);
            String options = scanner1.next();
            switch (options.toUpperCase()){
                case "C":
                System.out.println("Enter the ID of the book you want to check in. ");
                int bookID = scanner1.nextInt();
                        for (Book book : library) {
                            if (book.getBookID() == bookID) {
                                book.checkIn();
                                System.out.println("Press H to return to the home screen");
                                String userAnswer = scanner1.next();
                                if (userAnswer.equalsIgnoreCase("H")) {
                                    displayHomeScreen();
                                }
                                break;
                            }
                        }

                        case "X":
                            displayHomeScreen();
                            break;
                default:
                                System.out.println("Sorry, that is not a valid response. Please try again. ");
                                showCheckedOutBooks();
                            }
                        }
                    }

