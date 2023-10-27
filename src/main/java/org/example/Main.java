package org.example;

import java.util.Scanner;
import java.lang.Math;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at 
//        System.out.println("Hello and welcome!");

        Scanner scanner = new Scanner(System.in);
//        boolean isRunning = true;

//        while (isRunning) {
            System.out.println("Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Logarithm (base 10)");
            System.out.println("6. Exponent (e)");
            System.out.println("0. Exit");
            System.out.print("Select an operation: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double num2 = scanner.nextDouble();
                    double ans = add(num1, num2);
                    System.out.println("Result: " + ans);
                    break;
                case 2:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    ans = sub(num1, num2);
                    System.out.println("Result: " + ans);
                    break;
                case 3:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    ans = mul(num1, num2);
                    System.out.println("Result: " + ans);
                    break;
                case 4:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Division by zero is not allowed.");
                        break;
                    } else {
                        ans = divide(num1, num2);
                        System.out.println("Result: " + ans);
                    }
                    break;
                case 5:
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    ans = log10(num1);
                    System.out.println("Result: " + ans);
                    break;
                case 6:
                    System.out.print("Enter the exponent: ");
                    num1 = scanner.nextDouble();
                    ans = exp(num1);
                    System.out.println("Result: " + ans);
                    break;
                case 0:
                    System.out.println("Calculator has been exited.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid operation.");
                    break;
            }
        scanner.close();
    }

    public static double add(double a, double b){
        return a+b;
    }

    public static double sub(double a, double b){
        return a-b;
    }

    public static double mul(double a, double b){
        return a*b;
    }

    public static double divide(double a, double b){
        return a/b;
    }

    public static double log10(double a){
        return Math.log10(a);
    }

    public static double exp(double a){
        return Math.exp(a);
    }
}