import java.util.*;
public class lec4 {
    public static void main(String[] args){

        //For Loop.

//        int counter;
//        for(counter=0;counter<100;counter=counter+1){
//            System.out.println("My name is aryan");
//        }

//        for(int counter=0;counter<11;counter++){           //Here Counter = counter + 1 instead we can write counter ++
//            System.out.println(counter+".Hey");
//        }

        //similarly we can use WHILE loop.
        /*int i=-34;
        while(i<11){
            System.out.println(i);
            i = i+1; // or i++;
        }*/

        // similarly Do While Loop.
        /*int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<11);*/

        //----> Q:- Print the sum of first n natural numbers. n=4

        /*int sum=0;
        System.out.println("Enter value of 'n' to get sum of first n natural no's. :-");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

        for(int i=0;i<=n;i++){
            sum= sum+i;
        }
        System.out.println(sum);*/

        //---> print table of a number input by user.

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n to print table of n.");
        int n = sc.nextInt();
        for(int i=1;i<11;i++){

            System.out.println(n+" x "+i+" = "+ i*n);
        }*/

        //---> Home work Q.1- Print all Even no. till n.

        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i=i+2){
            System.out.println(i);
        }*/

        /*-----> Q.2:-Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
        If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).
        If they enter 0 then stop.
        If he/ she scores :
        Marks >=90 -> print “This is Good”
        89 >= Marks >= 60 -> print “This is also Good”
        59 >= Marks >= 0 -> print “This is Good as well”
        	Because marks don’t matter but our effort does.
        (Hint : use do-while loop but think & understand why)*/

        /*System.out.println("Enter 0 or 1 below:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1){
            System.out.println("Now Enter your marks out of 100 below:-");
            int marks = sc.nextInt();
            if(marks>=90){
                System.out.println("This is good marks.");
            }
            else if(marks<=89 && marks>=60){
                System.out.println("This is also good marks");
            }
            else if(marks<=59 && marks>=0){
                System.out.println("This is good as well.");
            }

            }
        else{
            System.out.println("Program is closed.");
        } */  //Program runs successfully....



        //----> Print if a number is prime or not (take input from user)
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        if(n%n!=0 || n%n!=0){
            System.out.println("IT is a Prime no.");
        }else {
            System.out.println("It is not a prime number.");
        }*/




    }
}
