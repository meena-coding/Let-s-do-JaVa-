import java.math.BigInteger;
import java.util.*;
public class lec7 {
    //Q. to make function to add two numbers
//    public static int calculateSum(int a,int b){
//         int sum = a+b; //for multiply just change "+' with "*"
//         return sum;

         /*public static void printMyName(String name){
        System.out.println(name);
        return;*/

    //Q. to print factorial of a value n.

    /*public static void getFactorial(int n){
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        int factorial=1;

        for(int i=n;i>=1;i--){

            factorial = factorial*i;
        }
        System.out.println(factorial);
        return;
        }*/

    public static double average(double a, double b , double c){
        double number = (a+b+c)/3;
        return number;
    }


    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name, age and height:-");  //-----> comment out things are Solved Questions.
//        String name = sc.next();
//        printMyName(name); // call kiya function ko*/
//
////        int a = sc.nextInt();
////        int b = sc.nextInt();
////        int sum = calculateSum(a,b);
////        System.out.println("Sum of two number is: "+sum);
//        System.out.println("Enter value of n to get it's Factorial:-");
//        int n = sc.nextInt();
//        getFactorial(n);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to print their Average:-");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The Average of "+a+", "+b+" and "+c+" is : "+average(a,b,c));
//        average( a, b, c);


    }
}
