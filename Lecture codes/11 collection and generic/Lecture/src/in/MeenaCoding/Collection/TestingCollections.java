package in.MeenaCoding.Collection;

import java.util.*;

public class TestingCollections {

    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>();

        numList.add(45);
        numList.add(3);
        numList.add(53);
        numList.add(-93);
        Utility.print(numList);

        Collections.sort(numList);
        Utility.print(numList);

        Collections.reverse(numList);
        Utility.print(numList);

        //we can also make the list unmodifiable

        List<Integer> unmodifiable = Collections.unmodifiableList(numList);

        unmodifiable.add(34);


    }
}
