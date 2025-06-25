package org.example;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Is the unit Celsius (C) or Fahrenheit (F)? Enter C or F: ");
        char unit = scanner.next().toUpperCase().charAt(0);

        double convertedTemp;
        if (unit == 'C') {

            convertedTemp = (temperature * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + convertedTemp + " °F");
        } else if (unit == 'F') {

            convertedTemp = (temperature - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + convertedTemp + " °C");
        } else {
            System.out.println("Invalid unit entered. Please enter 'C' or 'F'.");
        }

        scanner.close();
    }
}
