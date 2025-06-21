package in.aryancoding.Polymorphism;

public class TestPolymorphism {

    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        Car c = new Car();
        Vehicle vCar = new Car();    //Up casting
        Plane p = new Plane();

        castTest(v);
        castTest(c);
        castTest(p);

        /* Car cVehicle = (Car) new Vehicle(); */   //it will throw error as vehicle cannot be cast in Car. this is called downcast which is not possible.
    }

    private static void castTest(Vehicle veh){
        veh.start();

    }
}
