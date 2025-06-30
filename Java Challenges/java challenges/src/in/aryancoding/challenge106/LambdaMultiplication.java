package in.aryancoding.challenge106;

import javax.swing.*;
import java.util.function.BinaryOperator;

public class LambdaMultiplication {

    public static void main(String[] args) {

        BinaryOperator<Integer> multi = (a, b) -> a * b;
        int result = multi.apply(3, 5);
        System.out.println(result);




    }
}
