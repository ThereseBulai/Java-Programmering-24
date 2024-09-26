package Codingplayground.MathE4;

import java.util.Scanner;

public class MyMathMethods {

    /*
     * // Skapa första metoden Factorial
     * public static int calculateFactorial(int number) {
     * int factorial = 1;
     * 
     * if (number < 0) {
     * System.out.println("Write a positive number instead");
     * return 0;
     * }
     * 
     * if (number == 0) {
     * factorial = 1;
     * return factorial;
     * 
     * }
     * 
     * for (int i = 1; i <= number; i++) {
     * factorial = factorial * i;
     * }
     * 
     * return factorial;
     * 
     * }
     * 
     * 
     * // här böjar fibonacci
     * 
     * public static int calculateFibonacci(int number) {
     * 
     * if (number <= 0) {
     * throw new IllegalArgumentException("Position must be a positivt integer");
     * }
     * 
     * if (number == 1 || number == 2) {
     * return number - 1;
     * }
     * 
     * int previous = 0;
     * int current = 1;
     * int fibonacci = 0;
     * 
     * {
     * for (int i = 3; i <= number; i++) {
     * 
     * fibonacci = previous + current;
     * previous = current;
     * current = fibonacci;
     * 
     * }
     * }
     * 
     * return fibonacci;
     * }
     */

    // här börjar Prime checker
    public static boolean isPrime(int number) {
        boolean isPrime = true;

        if (number == 1) {
            return false;
        }

        for (int i = 2; i <= number-1; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        return isPrime;
    }



    // här börjar din main metod

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * System.out.println("Factorial: write any positive number");
         * int factInput = scanner.nextInt();
         * int factResult = calculateFactorial(factInput);
         * System.out.println("The factorial of " + factInput + " is " + factResult);
         * 
         * 
         * 
         * System.out.println("Fibonacci: write a number");
         * int fiboInput = scanner.nextInt();
         * int fiboResult = calculateFibonacci(fiboInput);
         * System.out.println("The fibonacci is " + fiboInput + " is " + fiboResult);
         * 
         */


         System.out.println("Prime: write a number");
         int primeInput = scanner.nextInt();
         boolean primeResult = isPrime(primeInput);
         if(primeResult == true){
            System.out.println(primeInput + " is a prime number!");
         } else {
            System.out.println(primeInput + "is not a prime number!");
         }

        scanner.close();

    }
}
