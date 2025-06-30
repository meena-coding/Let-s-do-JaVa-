package in.aryancoding.challenge108;

import java.util.List;

public class stringFilterAndConcatenate {

    public static void main(String[] args) {

        List<String> strs = List.of("Aryan Kankarwal", "is the best Student", "smart", "bright", "of IIT BHU", "Institute in varanasi");

        String result = strs.stream()
                .filter(str -> str.length() >= 10)
                .reduce("",(a,b)-> a +" "+ b);

        System.out.println(result);


    }
}
