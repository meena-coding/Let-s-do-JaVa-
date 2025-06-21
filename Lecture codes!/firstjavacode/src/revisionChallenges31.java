import java.util.*;
public class revisionChallenges31 {

    public static void main(String[] args) {

        //---> Write a Program that computes the sum of digits of an integer
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to digits addition! \n");
        System.out.print("Enter the Number of : ");
        int num = sc.nextInt();
        int sum = digitSum(num);
        System.out.println("Sum of Digits = "+sum);



    }

    public static int digitSum(int num){
        int sum = 0;

        while (num > 0 ){
            sum = sum + (num % 10);
            num = num / 10;

        }
        return sum;

    }
}
