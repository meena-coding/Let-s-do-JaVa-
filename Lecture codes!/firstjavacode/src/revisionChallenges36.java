import java.util.*;
public class revisionChallenges36 {
    public static void main(String[] args) {

        //---> Create A program to print fibonacci series till the entered number.

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci series Printer.\n");
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Fibonacci Series till "+ num + " is ");
        printFibonacci(num);

    }

    public static void printFibonacci(int num){

        if(num < 0) return;
        System.out.print("0 ");
        if (num == 0) return;
        System.out.print("1 ");

        int first = 0, second = 1;

        while(first + second <= num){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }


    }

}
