import java.util.*;
import java.math.BigInteger;
public class factorial {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter valur of n to get it's Factorial:- ");
    int n = sc.nextInt(); // the number to calculate the factorial of
    BigInteger factorial = BigInteger.ONE;

    for (int i = 1; i <= n; i++) {
        factorial = factorial.multiply(BigInteger.valueOf(i));
    }

    System.out.println("Factorial of " + n + " is: " + factorial);

        }
    }


