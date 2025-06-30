package in.MeenaCoding.filterAndReduce;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(2,3,4,2,4,5,6,4);

        int sum = 0;    //printing sum normally with for loop

        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);


        int newSum = numbers.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer + integer2;
                    }
                });

        System.out.printf("sum using reduce is %d", newSum);

        int newSum2 = numbers.stream()
                .reduce(0,(a, b) -> a + b);
        System.out.printf("\nsum using reduce with lambda is %d", newSum2);

        int max = numbers.stream()
                .reduce(Integer.MIN_VALUE,(a , b) -> a > b ? a : b);
        System.out.printf("\nMAX using reduce with lambda is %d", max);
    }
}
