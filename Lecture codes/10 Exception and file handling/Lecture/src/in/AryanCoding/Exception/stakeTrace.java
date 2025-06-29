package in.AryanCoding.Exception;

import java.util.Scanner;

public class stakeTrace {
    public static void main(String[] args) {
        a();
    }

    private static void a(){
        b();
    }

    private static void b(){
        c();
    }

    private static void c(){
        d();
    }

    private static void d(){

        //let's learn try and catch to handle exceptions.

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator\n");
        System.out.print("Enter your Two numbers: ");

        int first = sc.nextInt();
        int second = sc.nextInt();

        try {
            int[] a = new int[5];
//            int result = first / second;
            System.out.printf("Your %d/%d is: %d",first,second, a[6]);
            a[6] = first / second;
            System.out.println(a[6]);
            System.out.printf("Your %d/%d is: %d",first,second, a[6]);
        }catch (ArithmeticException exception) {
            System.out.printf("%s, Enter Valid Value.", exception.getMessage() );
        } finally {
            System.out.println("I'm in finally"); //'finally' will always executive regardless of exception (try or catch). it will always run.
        }
    }
}
