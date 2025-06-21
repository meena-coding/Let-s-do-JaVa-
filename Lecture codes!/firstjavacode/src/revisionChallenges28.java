import java.util.*;
public class revisionChallenges28 {
    public static void main(String[] args) {

        //----> develop a program that prints multiplication table for a given number

        Scanner sc = new Scanner(System.in);
        System.out.println(" Welcome to multiplication table calculator!\n");
        System.out.print("Enter The Number You want multiplication table of : ");

        int num = sc.nextInt();
        printMultiplicationTable(num);

    }

    public static void printMultiplicationTable(int num){

        int i = 1;

        while(i <= 10){
            System.out.println(num + " x "+ i + " = " + num * i);
            i++;

        }

    }


}
