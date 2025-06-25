package org.example;

import java.util.Scanner;
import java.util.Random;

public class RandomPasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        String numbers = "0123456789";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialChars = "!@#$%^&*()-_+=<>?/{}[]|";


        StringBuilder characterPool = new StringBuilder();

        System.out.print("Enter desired password length: ");
        int length = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Include numbers? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            characterPool.append(numbers);
        }

        System.out.print("Include lowercase letters? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            characterPool.append(lowercase);
        }

        System.out.print("Include uppercase letters? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            characterPool.append(uppercase);
        }

        System.out.print("Include special characters? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            characterPool.append(specialChars);
        }

        if (characterPool.length() == 0) {
            System.out.println("You must select at least one character type.");
        } else {
            StringBuilder password = new StringBuilder();
            for (int i = 0; i < length; i++) {
                int index = random.nextInt(characterPool.length());
                password.append(characterPool.charAt(index));
            }

            System.out.println("Generated Password: " + password);
        }

        scanner.close();
    }
}

