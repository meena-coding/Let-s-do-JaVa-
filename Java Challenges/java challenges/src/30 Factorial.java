import java.util.*;
class Factorial {
    public static void main(String[] args) {

        //---> Write a function that calculates the Factorial of a Given Number
        Scanner sc = new Scanner (System.in);

        System.out.println("Welcome to Factorial Calculator!\n");
        System.out.print("Enter Your Number here : ");
        int num = sc.nextInt();
        long fac = factorial(num);
        System.out.println("Factorial of "+ num + " = "+fac);
    }

    public static long factorial(int num){

        if(num < 2){
            return 1;
    }

        long fact = 1;
        int i = 2;

        while(i <= num) {
            fact = fact * i;

            i++;
        }
        return fact;
        }

}
