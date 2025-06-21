
import java.sql.SQLOutput;
import java.util.*;
public class lec2 {
    public static void main(String[] args) {
        //input
        //Scanner sc = new Scanner(System.in);
        //String name = sc.nextLine();
        //here "next" will take only 1 word as input but "nextLine" will take whole line.
        //System.out.println(name);

        // Q:- Take 2 variable a and b and print their sum!!
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value a:-");
        int a = sc.nextInt();
        System.out.println("Enter value b:-");
        int b = sc.nextInt();
        System.out.println("The Result a+b is:- ");
        int Sum = a+b;
        System.out.println(Sum);

    }
}

