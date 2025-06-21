import java.util.Scanner;

public class revisionChallenges38 {
    public static void main(String[] args) {

        //---> Create a Program that verify if the number is palindrome

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Number Checker.\n");
        System.out.print("Enter the Number here : ");
        int num = sc.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome)
            System.out.println(num + " Is a Palindrome Number.");
        else
            System.out.println(num + " Is not a Palindrome Number.");

    }

    public static boolean isPalindrome(int num){
        int reverse = reverseNum(num);
        return num == reverse;
    }

    public static int reverseNum(int num){
        int newNum = 0;
        while ( num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }

}
