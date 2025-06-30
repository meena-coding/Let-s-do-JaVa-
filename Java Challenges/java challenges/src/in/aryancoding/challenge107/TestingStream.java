package in.aryancoding.challenge107;

import java.util.List;

public class TestingStream {

    public static void main(String[] args) {

        List<String> names = List.of("Aryan", "Bharat","Swati","Mayank");

        names.stream()
                .forEach(name -> System.out.println(name));

}
}
