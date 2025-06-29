package in.MeenaCoding.enums;

public class TestingEnums {

    public static void main(String[] args) {

        TrafficLight color = TrafficLight.RED;
        color = TrafficLight.YELLOW;
        color = TrafficLight.GREEN;

        Grade grade = Grade.F;

        for (TrafficLight value : color.values()) {
            System.out.println(value);
        }

    }
}
