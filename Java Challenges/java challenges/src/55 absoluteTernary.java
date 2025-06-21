import java.util.Scanner;

class absoluteTernary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Absolute Value\n");
        System.out.print("Please Enter the Number : ");
        int num = sc.nextInt();
        int result = num > 0 ? num : -num;
        System.out.println("Absolute value is : "+ result);
    }
}
