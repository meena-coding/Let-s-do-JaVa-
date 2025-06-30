package in.MeenaCoding.optional;

import java.util.List;
import java.util.Optional;

public class TestingOptional {

    public static void main(String[] args) {

        List<Integer> numbers = List.of();

        Optional<Integer> sum = numbers.stream()
                .reduce((a,b)-> a + b);
        if(sum.isPresent()){
            System.out.println(sum.get());
        }else{
            System.out.println("List is empty");
        }

    }
}
