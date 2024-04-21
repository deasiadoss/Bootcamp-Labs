package org.example;

public class Book {
//Properties
//id: int
//isbn: String
//title: String
//isCheckedOut: boolean
//checkedOutTo: String
        private int bookID;
        private String isbn;
        private String title;
        private boolean isCheckedOut;
        private String checkedOutTo;

        public Book(int bookID, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
                this.bookID = bookID;
                this.isbn = isbn;
                this.title = title;
                this.isCheckedOut = isCheckedOut;
                this.checkedOutTo = checkedOutTo;
        }

        public int getBookID() {
                return bookID;
        }

        public void setBookID(int bookID) {
                this.bookID = bookID;
        }

        public String getIsbn() {
                return isbn;
        }

        public void setIsbn(String isbn) {
                this.isbn = isbn;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public boolean isCheckedOut() {
                return isCheckedOut;
        }

        public void setCheckedOut(boolean checkedOut) {
                isCheckedOut = checkedOut;
        }

        public String getCheckedOutTo() {
                return checkedOutTo;
        }

        public void setCheckedOutTo(String checkedOutTo) {
                this.checkedOutTo = checkedOutTo;
        }


        public void checkOut(String name) {
                if (!isCheckedOut) {
                        isCheckedOut = true;
                        checkedOutTo = name;
                        System.out.println("You have successfully checked out a book, " + name + "!");
                } else {
                        System.out.println("Sorry this book is already checked out! ");
                }
        }
                public void checkIn() {
                        if (isCheckedOut) {
                                isCheckedOut = false;
                                checkedOutTo = "";
                                System.out.println("This book has been successfully checked in.");
                        }
                        else {
                                System.out.println("Sorry, this book is already checked in. ");

                        }
                }
        }





