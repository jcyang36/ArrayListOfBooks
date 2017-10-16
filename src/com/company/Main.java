package com.company;


import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        ArrayList<Book> books = new ArrayList<Book>();


        System.out.println("-----------------");
        String repeatSwitch="";
        Scanner scan = new Scanner(System.in);
        while (!repeatSwitch.equalsIgnoreCase("Quit")){


         //create a book from our object
            Book book1 = new Book();
            System.out.println("Enter the book title: ");
            book1.title=scan.nextLine();

            System.out.println("Enter the book author: ");
             book1.author=scan.nextLine();


            System.out.println("Enter the book description: ");
            book1.description=scan.nextLine();
            //creates a new book
            books.add(book1);

            System.out.println("Enter any key to continue or quit to exit: ");
            repeatSwitch = scan.nextLine();

        }
        System.out.println("All the books: ");
        for(Book book:books)
        {
            System.out.print(book.title);
            System.out.print(" ");
            System.out.print(book.author);
            System.out.print(" ");
            System.out.print(book.description);
            System.out.println();
        }




    }



}