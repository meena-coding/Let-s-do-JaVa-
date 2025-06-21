import java.util.Scanner;

class passwordChecker {

     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.println("Welcome to Set your Password\n");
         String password;

         do{
             System.out.print("Please Enter Your Password: ");
             password = sc.next();
         }while(!isValidPassword(password));
         System.out.println("Thanks for Entering a Valid Password");
     }

     public static boolean isValidPassword(String password){

         return password.length() > 6;
     }
}
