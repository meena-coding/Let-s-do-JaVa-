import java.util.Scanner;

class PrimeNumberChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Welcome to Prime number Checker.\n");
        System.out.print("Please Enter the Number : ");
        int num = sc.nextInt();
        boolean result = isPrime(num);

        if(result){
            System.out.println(num + " is a prime number.");
        }
        else
            System.out.println(num +" is not a prime number.");

    }

    public static boolean isPrime(int num){

        int i = 2;
        while(i < num){
            if(num % i == 0){
                return false;
            }
            i++;
        }

        return true;
    }

}
