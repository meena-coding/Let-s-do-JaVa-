public class Driver {

    public static void main(String[] args) {

        //Whenever we call any object it will perform it's work.

        car myCar = new car();
        myCar.addFuel(5);
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.addFuel(6);
        myCar.drive();
        System.out.println(myCar.getCurrentFuelInLiters());


    }
}
