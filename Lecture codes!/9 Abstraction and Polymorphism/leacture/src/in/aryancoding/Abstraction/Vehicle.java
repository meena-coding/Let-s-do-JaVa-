package in.aryancoding.Abstraction;

public abstract class Vehicle implements Transport {

    public int noOfTyres;

    public Vehicle(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public int getNoOfTyres() {
        return noOfTyres;
    }

    public void setNoOfTyres(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    @Override
    public void getSetGo() {
        System.out.println("Going to a place..");
    }

    //we can also make abstract method, but we must implement it in the child class.

    public abstract void makeStartSound();

    public void commute(){
        System.out.println("going...");
    }
}
