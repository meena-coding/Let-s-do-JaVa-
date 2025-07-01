import java.util.*;
class ReverseNumber{
    public static void main(String[] args) {

        //---> Create a Program that reverse the Number.  345--> 543

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to reverse the Number.\n");
        System.out.print("Enter the Number here : ");
        int num = sc.nextInt();
        int reverse = reverseNum(num);
        System.out.println("Reverse of " + num + " is " + reverse);

    }

    public static int reverseNum(int num){
        int newNum = 0;
        while(num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }

        return newNum;

    }


}