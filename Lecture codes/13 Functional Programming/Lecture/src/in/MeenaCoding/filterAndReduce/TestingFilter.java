package in.MeenaCoding.filterAndReduce;

import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {

    public static void main(String[] args) {

        List<String> fruits = List.of("Mango","banana","apple","cherry");

        System.out.println("printing fruits normally:\n");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nprinting fruits using stream:\n");

        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });

        //can also be written in this short way.

        System.out.println("\nPrinting fruits using Filter:\n");

        fruits.stream()
                .filter(fruit -> fruit.endsWith("e"))
                .forEach(fruit -> System.out.println(fruit));
    }

}
