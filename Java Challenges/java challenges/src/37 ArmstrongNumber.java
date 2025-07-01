import java.util.*;
class ArmstrongNumber {
    public static void main(String[] args) {

        //--> Check if the entered number is ARMSTRONG number
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Armstrong number Checker.\n");
        System.out.print("Please Enter the Number : ");
        int num = sc.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong){
            System.out.println(num + " is a Armstrong Number.");
        }
        else
            System.out.println(num + " is not a Armstrong Number.");

    }
    public static boolean isArmstrong(int num){
        int noOfdigits = noOfDigits(num);
        int numCopy = num;
        int finalNumber = 0;
        while (num > 0){
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit , noOfdigits);
        }

        return finalNumber == numCopy;
    }

    public static int pow(int num1, int num2){
        int result = num1;
        int i = 1;
        while(i < num2){
            result *= num1;
            i++;
        }
        return result;
    }

    public static int noOfDigits(int num){
        int digits = 0;
        while (num > 0){
            digits++;
            num /= 10;
        }
        return digits;
    }

}
