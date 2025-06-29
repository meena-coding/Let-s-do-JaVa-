package in.MeenaCoding.Collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        System.out.println(names.add("Aryan"));
        System.out.println(names.add("bharat"));
        System.out.println(names.add("Muniraj"));

        Utility.print(names);

        System.out.println(names.add("Aryan"));
        Utility.print(names);
        System.out.println(names.remove("bharat"));
        System.out.println(names.size());

        Utility.print(names);


    }
}
