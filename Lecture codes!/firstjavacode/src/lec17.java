import java.util.*;
public class lec17 {

    public static void printSum(int i, int n, int sum) {
        /*if(n==0){
            return;
        }

        System.out.print(n+" ");
        printNumb(n-1);
    }*/

        //Q 1:- print number from 1 to 5 with recursion

        /*if (n == 6) {
            return;
        }
        System.out.println(n);
        printNumb(n + 1);*/


        //Q 2:- Print sum of n natural number using recursion

        if (i==n){
            sum+= i;
            System.out.println(sum);
            return;

        }

        sum += i;
        printSum(i+1, n, sum);

    }



    public static void main(String []args){

        //-----> Recursion.

        //---> it means the function that calls itself

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :- ");
        int n = sc.nextInt();
        printNumb(n); // n = enter the value*/


            //Q 1:- continue

            /*int n = 1;
            printNumb(n);*/


        //Q 2 : continue

        printSum(1,5,0);





    }

}
