package in.gettersetter;

public class car {

    public String color;
    public String model;

    private double fuelLevel;
    private double costOfPurchase;

    public car(String color, String model, double fuelLevel, double costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    public String getColor(){
        return color;
    }

    public void setColor(){
        if(color.equals("yellow")){
            System.out.println("Pagal hai kya bhai");
        }else
            this.color = color;
    }

    public String getModel(){
        return model;
    }
}
