package com.codedifferently.part02;


import com.sun.jdi.IntegerType;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TooHighTooLow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Guess this number! Enter a number between 1 - 20:  ");
        Integer userGuess;
        Integer winningNumber = 15;
        ArrayList<Integer> guessAttempts = new ArrayList<>();
        int count = guessAttempts.size();

        do {
            userGuess = scanner.nextInt();
            guessAttempts.add(userGuess);

            System.out.println("Looks like you entered:  " + userGuess);

            if (userGuess > winningNumber) {
                System.out.println("Number is too high, please try again");
                count++;
            } else if (userGuess < winningNumber) {
                System.out.println("Number is too low, please try again");
                count++;
            }
        } while (userGuess != winningNumber);
        {
            System.out.println("Congratulations! It took you " + count + " attempts to guess correctly");
        }
    }
}



/*System.out.println(" Welcome to Guess this number! Enter a number between 1 - 20:  ");
            if(userGuess > winningNumber)length++);{
            System.out.printf("Number is too high,please try again");

            if (userGuess < winningNumber){
            System.out.printf("Number is too low, please try again")length++);

            else if (userGuess = winningNumber);
            String userGuess = scanner.readLine("Please enter a number from 1-20 "
                    System.out.println("Total number of attempts: " +.length);
*/





