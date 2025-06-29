import java.util.*;
public class revisionChallenges33 {
    public static void main(String[] args) {

        //Create a Program to get GCD of Two numbers.

        Scanner sc = new Scanner (System.in);
        System.out.println("Welcome to GCD of two numbers.\n");
        System.out.print("Please Enter the first Number : ");
        int first = sc.nextInt();
        System.out.print("Please Enter the Second Number : ");
        int second = sc.nextInt();
        int GCD = GCD(first,second);
        System.out.println("GCD of " + first +" and "+ second + " number = " + GCD);

    }

    public static int GCD(int first, int second){
        int gcd = 1;
        int i =2;
        int least = least(first , second);
        while (i <= least){
            if (first % i == 0 && second % i == 0){
                gcd = i;
            }
            i++;
        }

        return gcd;
    }

    public static int least(int num1, int num2){
        if (num1 < num2){
            return num1;
        }else
            return num2;

    }

}
