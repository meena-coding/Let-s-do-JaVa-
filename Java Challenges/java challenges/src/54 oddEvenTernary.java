import java.util.Scanner;

class oddEvenTernary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to odd even ternary\n");
        System.out.print("Please Enter the Number : ");
        int num = sc.nextInt();

        String result = num % 2 == 0 ? "even" : "odd";
        System.out.println("Your number is "+ result);
    }

}
