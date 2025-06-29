import java.util.Scanner;

public class dowhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // how we do in while loop
        /* System.out.print("Please Enter Your Age: ");
        int age = sc.nextInt();

        while (age < 0 || age > 100){
            System.out.print("Please Enter Your Age: ");
            age = sc.nextInt();
        }
        System.out.println("your age is: "+ age); */


        // now in do-while loop.

        int age;

        do{
            System.out.print("Please Enter your age: ");
            age = sc.nextInt();
        }while(age < 0 || age > 100);
        System.out.print("Your age is: " + age);
    }
}
