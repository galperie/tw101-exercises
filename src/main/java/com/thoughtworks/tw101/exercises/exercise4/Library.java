package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public String printBooksContaining(String partialBookTitle) {
        String allBooks = "";

        for(String book : books) {
            if(book.toLowerCase().contains(partialBookTitle.toLowerCase())) {
                allBooks = allBooks + "     " + book;
            }
        }
        printStream.print(allBooks+"\n");
        return allBooks;
    }
}
