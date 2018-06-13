package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);
        String favorite ="";
        String choice="";

        ArrayList<String> favoriteList = new ArrayList<>();

        do{
            System.out.println("enter your favorite book or movie");
            favorite = scan.nextLine();

            favoriteList.add(favorite);

            System.out.println("Do you want to continue y/n :");
            choice = scan.nextLine();
        }while(!choice.equalsIgnoreCase("n"));

        System.out.println("Your Favorite Book or movie are: ");
            for(String list: favoriteList){
                System.out.println(list);
            }
    }

}
