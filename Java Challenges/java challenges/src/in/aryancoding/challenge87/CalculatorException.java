package in.aryancoding.challenge87;

import java.util.Scanner;

public class CalculatorException {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to division Calculator\n");
            System.out.print("Please Enter the First number: ");
            int first = sc.nextInt();
            System.out.print("Please Enter the second number: ");
            int second = sc.nextInt();
            int result = first/second;
            System.out.printf("%d/%d = %d",first,second,result);
        }catch (ArithmeticException exp){
            System.out.print("This Division is not possible because ");
            System.out.println(exp.getMessage());
        }

    }
}
