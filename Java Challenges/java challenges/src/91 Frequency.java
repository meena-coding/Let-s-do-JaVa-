import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Frequency {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,3,4,5,2,2,3,3,4,2,56,78,45,4,4);
        System.out.println(Collections.frequency(list,2));
        System.out.println(Collections.frequency(list,4));
        System.out.println(Collections.frequency(list,9));
        System.out.println(Collections.frequency(list,3));
    }
}
