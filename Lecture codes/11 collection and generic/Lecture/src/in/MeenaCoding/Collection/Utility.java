package in.MeenaCoding.Collection;

import java.util.Collection;

public class Utility {

    public static <E> void print(Collection<E> collection){

        // E is nothing but a parameter used to make it look good, otherwise it's a parent object.

        System.out.print("Collection is: ");

        for (E coll : collection) {
            System.out.printf("%s ",coll);

        }
        System.out.println();

    }
}
