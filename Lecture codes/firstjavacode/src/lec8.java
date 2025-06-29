import java.util.*;

import static javafx.scene.input.KeyCode.R;

//Lec 8 only had practice questions. doc link:- https://docs.google.com/document/d/1eEv8JMCr_ZBoE5JSsZxdT5Zq53vq388-EIbE_mi7QME/edit?usp=sharing

public class lec8 {

    //---> Q.1 Enter 3 numbers from the user & make a function to print their average.

    /*public static double average(double a, double b , double c){
        double number = (a+b+c)/3;
        return number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to print their Average:-");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The Average of " + a + ", " + b + " and " + c + " is : " + average(a, b, c));
    } // solved. */


    //----> Q.2 Write a function to print the sum of all odd numbers from 1 to n.

    /*public static int sumOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%2==1 || i%2==1){
                sum += i;

            }
        }
        return sum;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. to get sum of all odd number till n:-");
        int n = sc.nextInt();
        System.out.println("The sum of all odd no. from 1 to "+n+" is : "+sumOdd(n));

    }*/  //Solved.


    //---> Q.3 Write a function which takes in 2 numbers and returns the greater of those two.

    /*public static void greaterNumber(int a, int b){
        if(a>b){
            System.out.println("A is greater than b");
        }else if(b>a){
            System.out.println("B is greater than a");
        }else{
            System.out.println("Both are equal.");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:-");
        int a = sc.nextInt();
        System.out.println("Enter value of b:-");
        int b = sc.nextInt();
        greaterNumber(a,b);
    }*/    //Solved.


    //----> Q.4 Write a function that takes in the radius as input and returns the circumference of a circle.

    /*public static double circumferenceOfCircle(double Radius){

        return 2 * Math.PI * Radius;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of circle: ");
        double Radius = sc.nextDouble();
        double circumference= circumferenceOfCircle(Radius);
        System.out.println("The circumference of circle is : "+circumference);

      } */    // Solved.


    //---> Q.5 Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

    /*public static void voteEligibility(int age){
        if(age>=18){
            System.out.println("You are eligible for voting.");
        }else{
            System.out.println("You are below eligibility age.");

        }


    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your Age:");
        int age = sc.nextInt();
        voteEligibility(age);
    } */  // Solved


    //---->> Q.6 Write an infinite loop using do while condition.

    /*public static void infiniteLoop(int n){
        do{
            System.out.println(n);
        }
        while(n>0 || n<0 || n==0);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to create a infinite loop:- ");
        int n = sc.nextInt();
        infiniteLoop(n);
    } */  // Solved.

    //---->> Q.7 Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

        /*public static void countNumbers() {
            Scanner sc = new Scanner(System.in);
            int positiveCount = 0;
            int negativeCount = 0;
            int zeroCount = 0;
            char choice;

            do {
                System.out.print("Enter a number: ");
                int number = sc.nextInt();

                if (number > 0) {
                    positiveCount++;
                } else if (number < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }

                System.out.print("Do you want to continue (y/n)? ");
                choice = sc.next().charAt(0);
            } while (choice == 'y' || choice == 'Y');

            sc.close();

            // Display counts
            System.out.println("Count of positive numbers: " + positiveCount);
            System.out.println("Count of negative numbers: " + negativeCount);
            System.out.println("Count of zeros: " + zeroCount);
        }

        public static void main(String[] args) {
            countNumbers();
        }*/

    //----->> Q.8 Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.

    /*public static double raiseToFunction(double x, double n){
        double power= Math.pow(x,n);
        System.out.println(x+" Raise to "+n+" is "+power);
        return power;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter x as base : ");
        double x = sc.nextDouble();
        System.out.println("Enter n as exponent : ");
        double n = sc.nextDouble();
        raiseToFunction(x,n);

    } */   // Solved.


    //------> Q.9 Write a function that calculates the Greatest Common Divisor of 2 numbers.

    /*public static int calculateGCD(int a, int b){
        while (b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.println("The Greatest common divisor of a & b = "+calculateGCD(a,b));
    }*/   // Solved


    //-----> Q.10 Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 21 ..... In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

    public static void fibonacciSeries(int n){
        int a = 0, b = 1;
        System.out.print("Fibonacci series : "+a);
        if(n>1){
            System.out.print(" , "+b);

        }
        for(int i=3;i<=n;i++){
            int sum = a+b;
            System.out.print(" , "+sum);
            a=b;
            b=sum;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of term n : ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Please enter a positive integer.");
        } else{
            fibonacciSeries(n);
        }

    }   // Solved



    }


