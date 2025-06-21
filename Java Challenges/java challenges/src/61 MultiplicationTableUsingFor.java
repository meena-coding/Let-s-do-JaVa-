import java.util.Scanner;

class MultiplicationTableUsingFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Multiplication Table\n");
        System.out.print("Enter the Number you want table of: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10 ; i++){
            System.out.println(num + " x "+ i + " = " + num * i);
        }
    }
}
