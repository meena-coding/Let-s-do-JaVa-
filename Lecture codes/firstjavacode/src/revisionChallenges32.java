import java.util.*;
public class revisionChallenges32 {
    public static void main(String[] args) {

        //Create a Program to get LCM of Two numbers.

        Scanner sc = new Scanner (System.in);
        System.out.println("Welcome to LCM of two numbers.\n");
        System.out.print("Please Enter the first Number : ");
        int first = sc.nextInt();
        System.out.print("Please Enter the Second Number : ");
        int second = sc.nextInt();
        int LCM = LCM(first,second);
        System.out.println("LCM of "+first+" and "+ second+" number = "+LCM);

    }

    public static int LCM(int first, int second){
        int i = 1;

        while (true){     // or instead we can put ' True ' coz it will always return in if
            if ((first * i) % second == 0){
                return (first * i);
            }
            i++;
        }
        //return 0; // unreachable --> if we put ' true ' in while then it won't reach here

        }


}

