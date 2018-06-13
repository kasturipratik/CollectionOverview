package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);
        String movie ="";
        String book="";
        String choice ="";

        CollectionDisplay display = new CollectionDisplay();

        do{
            System.out.println("Enter your favorite movie: ");
            movie= scan.nextLine();
            System.out.println("Enter your favorite book: ");
            book = scan.nextLine();

            Collection collection = new Collection(movie,book);
            display.addCollection(collection);

            System.out.println("Do you want to continue y/n :");
            choice = scan.nextLine();
        }while(!choice.equalsIgnoreCase("n"));

        System.out.println("Your Favorite Book or movie are: \n"+ "Movie" +"\t\t\t"+ "Books");

        System.out.println(display.displayFavorite());
    }

}
