package in.aryancoding.challenge111;

import java.util.stream.IntStream;

public class TestingFactorial {

    public static void main(String[] args) {
        System.out.println("Factorial using two ways:");

        int num = 9;
        System.out.println(factorial(num));

        IntStream.rangeClosed(2,num)
                .reduce((a,b)-> a * b)
                .ifPresent(System.out::println);

    }

    public static long factorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }

        int fact = 1;
        for (int i = 2; i <= num ; i++) {
            fact *= i;
        }
        return fact;
    }
}
