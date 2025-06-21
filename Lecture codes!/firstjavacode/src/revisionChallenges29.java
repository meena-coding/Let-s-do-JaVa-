import java.util.*;
public class revisionChallenges29 {

    public static void main(String[] args) {

        //---> Create a program to sum all odd numbers from 1 to a specified number N
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Sum of all Odd number!\n");
        System.out.print("Please enter the Number : ");
        int num = sc.nextInt();
        int sum = sumOfOddNum(num);
        System.out.println("Sum of odd numbers till "+ num + " = "+ sum);

    }

    public static int sumOfOddNum(int num) {

        int i = 1;
        int sum = 0;
        while(i <= num){
            sum = sum + i;
            i = i + 2;
        }

        return sum;


    }

}
