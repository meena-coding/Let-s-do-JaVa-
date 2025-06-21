import java.util.Scanner;

class switchCalculator {

     public static void main(String[] args) {

         Scanner sc = new Scanner (System.in);
         System.out.println("Welcome to the calculator\n");
         System.out.print("Please Enter the first Number : ");
         int num1 = sc.nextInt();
         System.out.print("Please Enter the second Number : ");
         int num2 = sc.nextInt();
         System.out.print("Enter the operator : ");
         String operator = sc.next();

         int result = switch (operator){
             case "+" -> num1 + num2;
             case "-" -> num1 - num2;
             case "x" -> num1 * num2;
             case "/" -> num1 / num2;
             case "%" -> num1 % num2;
             default -> -1;
         };

         System.out.println("Your Answer is: " + result );

     }
}
