package in.aryancoding.challenge77.utils;

import in.aryancoding.challenge77.geometry.circle;
import in.aryancoding.challenge77.geometry.rectangle;

public class calculateArea {

    public static void main(String[] args) {

        circle cir = new circle(6);

        rectangle rec = new rectangle(6,4);

        double areaOfCircle = Math.PI * Math.pow(cir.radius, 2);
        double areaOfRectangle = rec.length * rec.breadth;

        System.out.printf("Area of Circle is: %f and Area of Rectangle is: %f",areaOfCircle,areaOfRectangle);
    }


}
