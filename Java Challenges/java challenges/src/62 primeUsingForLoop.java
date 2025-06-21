import java.util.Scanner;

class primeUsingForLoop {

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("welcome to prime number checker\n");
         System.out.print("please Enter the Number: ");
         int num = sc.nextInt();
         boolean prime = isPrime(num);

         if(prime){          //we can also use ternary operator here
             System.out.println(num +" is a prime number.");
         }else
             System.out.println(num +" is not a prime number.");

     }

     public static boolean isPrime(int num){

         for(int i = 2; i < num ; i++){
             if(num % i == 0)
                 return false;
         }
         return true;
     }
}
