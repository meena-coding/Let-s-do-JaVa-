public class car {

    //These below are instance Variable or instance properties
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;



    //Constructor

    car(){
        color = "Black";
        maxSpeed = 350;
        currentFuelInLiters = 10;
        noOfSeats = 4;
        noOfWheels = 4;

    }


    //Below are Methods

    public void drive(){

        if(currentFuelInLiters == 0){
            System.out.println("Car is out of Fuel.");
        }
        else if (currentFuelInLiters < 5){
            System.out.println("Car is in reserved Mode. Please Refuel The Car.");
            currentFuelInLiters--;
        }
        else {
            System.out.println("Car is driving");
            currentFuelInLiters--;
        }
    }

    public void addFuel(float fuel){
        currentFuelInLiters += fuel;

    }

    public float getCurrentFuelInLiters(){
        return currentFuelInLiters;
    }
}
