package in.aryancoding.challenge97;

public class TestingEnums {

    public static void main(String[] args) {

        System.out.println("Printing Days of the weeks:-\n");

        for (Day day : Day.values()) {
            System.out.printf("%s : %s\n", day , day.getType());
        }
    }


}
