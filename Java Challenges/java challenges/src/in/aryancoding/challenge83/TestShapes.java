package in.aryancoding.challenge83;

public class TestShapes {

//    Shape shape = new Shape();   //cannot create because shape is abstract

    public static void main(String[] args) {

        //    Shape shape = new Shape();   //cannot create because shape is abstract

        Circle cir = new Circle(6);
        Shape sqr = new Square(4.5);

        System.out.printf("Area of circle is %f\n",cir.calculateArea());
        System.out.printf("Area of square is %f",sqr.calculateArea());


    }

}
