package in.MeenaCoding.wrapper;

public class TestingWrapper {

    public static void main(String[] args) {
        Integer first = 4;   //or Integer first = Integer.valueOf(4); can be written.

        // autoboxing and boxing happens in this method. java automatically understand the type and box it accordingly.

        System.out.println(first);
        int second = first;
    }
}
