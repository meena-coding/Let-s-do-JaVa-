package in.AryanCoding.Exception;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        //let's learn try and catch to handle exceptions.

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator\n");
        System.out.print("Enter your Two numbers: ");
        int first = sc.nextInt();
        int second = sc.nextInt();

        try {
            int result = first / second;
            System.out.printf("Your %d/%d is: %d", first, second, result);
        }catch (ArithmeticException exception) {
            System.out.printf("%s, Enter Valid Value.", exception.getMessage() );
        }



        //catch is not universal and cannot handle all type of exception. we have to mention which type of exception can occur in "try" and then add types in catch accordingly. we can write many "catch" depending on the no. of exceptions and their types

        // if we want to print same result for two exceptions we can use ' | ' keyword in catch bracket
        // for e.g.--> catch(ArithmeticException | outOfBoundException)
        // "Throwable" keyword can be used if we want to catch any possible exception in the program. Throwable is the main parent keyword of "exception"

    }
}
