package in.aryancoding.challenge83;

public class Circle extends Shape{

    private final double radiusInCentimeter;

    public Circle(double radiusInCentimeter) {
        this.radiusInCentimeter = radiusInCentimeter;
    }

    public double getRadiusInCentimeter() {
        return radiusInCentimeter;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radiusInCentimeter,2);
    }
}
