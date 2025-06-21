package in.aryancoding.Abstraction;

public class car extends Vehicle{

    private int noOfDoors;

    public car() {
        super(4);
    }


    @Override
    public void makeStartSound() {
        System.out.println("Vroooom......vrooom...");
    }
}
