import java.util.Scanner;

class studentScoreTernary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Student Marks\n");
        System.out.print("Please Enter Your Marks : ");
        int marks = sc.nextInt();
        String category = marks > 80 ? "High" : (marks > 50 ? "moderate" : "low");

        System.out.println("Your Marks are "+ category);
    }
}
