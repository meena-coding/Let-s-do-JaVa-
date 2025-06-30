package in.MeenaCoding.MethodReferences;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingMethodInterface {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(2, 3, 4, 2, 4, 5, 6, 7);

        numbers.stream()
                .filter(num -> num % 2 == 1)
                .forEach(num -> System.out.println(num));

        numbers.stream()
                .filter(num -> num % 2 == 1)
                .forEach(System.out::println);  //we can also use directly like this using method references

    }
}


