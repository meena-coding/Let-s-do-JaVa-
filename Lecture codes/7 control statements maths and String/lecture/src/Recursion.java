import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Factorial Generator\n");
        System.out.print("Please Enter Your Number: ");
        int num = sc.nextInt();

        long fac = factorial(num);
        long fac1 = FactorialWithLoop(num);
        System.out.println("Factorial of your number is: "+ fac);
        System.out.print("Factorial of your number is: "+ fac1);


    }

    //let's create this with Loop first

    public static long FactorialWithLoop(int num){

        int result = 1;
        for (int i = 1; i <= num ; i++){
            result *= i;;
        }
        return result;
    }

    //now with Recursion

    public static long factorial(int num){

        if(num == 1){
            return 1;
        }
        return num * factorial(num - 1);
    }
}
