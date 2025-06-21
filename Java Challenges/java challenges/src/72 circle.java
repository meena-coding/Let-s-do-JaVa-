import java.util.Scanner;

class circle {

    //calculate area and circumference of a circle using math.pi

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the radius of circle: ");
        double radius = sc.nextInt();

        double area = Math.PI * Math.pow(radius,2);
        double circumference = (2 * Math.PI * radius);

        System.out.printf("\nArea of circle = %f\n\ncircumference of Circle = %f \n", area,circumference);
    }


}
