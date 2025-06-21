import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
public class javaRevise2 {
    public static void main(String[] args) {

        //----> learn how to use FUNCTIONS. for e.g.

//        myFirstPattern();
//        mySecondPattern();
//        myThirdPattern();


        greet();
        int first = readNumber();
        int second = readNumber();
        int sum = first + second;
        System.out.println("Sum of numbers is = "+ sum);


    }

    //Below are the 3 functions that I can use whenever I want in main method.

    public static void myFirstPattern(){
        //System.out.println("*\n"+"* *\n"+"* * *\n"+"* * * *\n"+"* * * * *\n\n");

        //I can also print this with use of while loop

        int row = 0;
        while(row < 10){
            System.out.print("*");
            int i = 0;
            while(i<row){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row++;
        }


    }

    public static void mySecondPattern(){
        System.out.println("* * * * *\n"+"* * * *\n"+"* * *\n"+"* * \n"+"* ");
    }

    public static void myThirdPattern(){
        System.out.println("        *\n"+"      * *\n"+"    * * *\n"+"  * * * *\n"+"* * * * *");
    }


    //--> now let's use the return function in sum of two numbers

    public static void greet(){
        System.out.println("Welcome to Calculator!!\n");
    }

    public static int readNumber(){

        //now creating a return function

        Scanner sc = new Scanner (System.in);
        System.out.print("Please Enter the Number : ");
        int number = sc.nextInt();
        return number;

    }

}
