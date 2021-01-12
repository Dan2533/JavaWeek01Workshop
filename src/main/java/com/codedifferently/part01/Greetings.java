package com.codedifferently.part01;
import java.util.Scanner;


public class Greetings {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter your name");

         String firstName = scanner.nextLine();
         if (firstName.equals("Hakim") || firstName.equals("Rasheeda")) {
             System.out.printf("Hello %s!", firstName);
         } else {
             System.out.printf("Sorry you are not permitted to access these files.");
         }
     }
    }
