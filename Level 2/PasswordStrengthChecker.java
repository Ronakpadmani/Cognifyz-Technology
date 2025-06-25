package org.example;

import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        int strengthPoints = 0;

        // Criteria checks
        if (password.length() >= 8)
            strengthPoints++;

        if (password.matches(".*[A-Z].*"))
            strengthPoints++;

        if (password.matches(".*[a-z].*"))
            strengthPoints++;

        if (password.matches(".*[0-9].*"))
            strengthPoints++;

        if (password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*"))
            strengthPoints++;

        // Output based on score
        System.out.print("Password Strength: ");
        switch (strengthPoints) {
            case 5:
                System.out.println("✅ Strong");
                break;
            case 3, 4:
                System.out.println("⚠️  Moderate");
                break;
            default:
                System.out.println("❌ Weak");
                break;
        }

        // Detailed feedback
        System.out.println("Feedback:");
        if (password.length() < 8)
            System.out.println("- Should be at least 8 characters long.");
        if (!password.matches(".*[A-Z].*"))
            System.out.println("- Add at least one uppercase letter.");
        if (!password.matches(".*[a-z].*"))
            System.out.println("- Add at least one lowercase letter.");
        if (!password.matches(".*[0-9].*"))
            System.out.println("- Add at least one number.");
        if (!password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*"))
            System.out.println("- Add at least one special character.");

        scanner.close();
    }
}
