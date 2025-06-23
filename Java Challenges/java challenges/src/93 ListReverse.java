import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ListReverse {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,4,7,5,6,3,6);
        System.out.println("List = " + list);
//        Collections.reverse(list);
        reverse(list);
        System.out.println("Reversed list = " + list);
    }

    // or for reverse we can also use swapping method with for loop.

    public static void reverse(List<Integer> list){

        for (int i = 0; i < list.size() / 2; i++) {
            ListSwapping.swap(list, i , list.size() - i - 1);

        }

    }
}
