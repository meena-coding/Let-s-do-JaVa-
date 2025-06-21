import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to number checker. \n");

        System.out.print("Please Enter the first Number: ");
        int num1 = sc.nextInt();
        System.out.print("Please Enter the second Number: ");
        int num2 = sc.nextInt();

        /* if(num1 > num2){
            System.out.println(num1 + " is the Greatest Number.");
        }
        else
            System.out.println(num2 + " is the Greatest Number."); */

        //Ternary operator is the Replacement of if/else

        int greaterNumber = num1 > num2 ? num1 : num2;
        System.out.println(greaterNumber + " is the greatest Number.");

    }

}
