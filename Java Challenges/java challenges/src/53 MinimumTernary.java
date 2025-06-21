import java.util.Scanner;

class MinimumTernary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to finding minimum in ternary operator\n");
        System.out.print("Please Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Please Enter the Second number : ");
        int num2 = sc.nextInt();

        int minimumNum = num1 < num2 ? num1:num2;
        System.out.println(minimumNum + " is the smaller number.");
    }
}
