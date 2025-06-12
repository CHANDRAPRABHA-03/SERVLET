package com.xworkz.excptn.exception;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbergenerator {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(10);
        System.out.println("Generated Random Number from 1 to 10");
        try{
            int userGuess = scanner.nextInt();  // May throw InputMismatchException

            if (userGuess == randomNumber) {
                System.out.println("Wow! Guessed the correct number.");
            } else
            {
                System.out.println("Wrong guess. The correct number was: " + randomNumber);
            }

        }
        catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid number.");
        }
        finally {
            System.out.println("Game over. Thanks for playing!");
            scanner.close();
        }
    }
}