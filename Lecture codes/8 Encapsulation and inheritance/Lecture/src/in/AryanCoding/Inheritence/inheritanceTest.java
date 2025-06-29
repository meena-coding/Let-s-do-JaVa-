package in.AryanCoding.Inheritence;

public class inheritanceTest {

    public static void main(String[] args) {

        vehicle Vehicle = new vehicle();
        Vehicle.commute();

        twoWheeler two = new twoWheeler();
        two.commute();

        MotorCycle motor = new MotorCycle();
        motor.commute();
        motor.start();

    }
}
