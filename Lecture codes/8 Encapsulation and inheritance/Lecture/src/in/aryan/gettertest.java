package in.aryan;
import in.gettersetter.car;


public class gettertest {

    public static void main(String[] args) {

        car Car = new car("red","maruti",15, 98000);

        System.out.printf("%s %s", Car.getColor(),Car.getModel());

    }


}
