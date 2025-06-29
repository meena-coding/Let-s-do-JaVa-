import java.util.*;
public class lec3 {
    public static void main(String[] args) {

//        System.out.println("If you Want to Apply for Credit card then\n\nEnter your age:- ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if (a>=18){
//            System.out.println("\nCongratulations!!! You're an ADULT\n Now You can apply for Credit Card");
//        }
//
//        else{
//            System.out.println("\nPehle bade ho jao beta aap!! Chalo bye bye.....");
//        }

//        System.out.println("Check Whether Number is odd or even...\nEnter no:-");
//        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        if(a%2==0){
//            System.out.println("Given no. is even!");
//        }
//        else{
//            System.out.println("Given No. is odd!");
//        }

        //Take 2 inputs a & b and check if it's a>b, a<b, a=b

//        System.out.println("Enter no. a:-");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println("Enter no. b:-");
//        int b = sc.nextInt();
//        if (a > b) {
//            System.out.println("HERE! a is greater than b.");
//        } else {
//            if (a < b) {
//                System.out.println("HERE! a is Smaller than b");
//            } else {
//                System.out.println("HERE! a & b, Both are Equal no.");
//            }
//
//        }

        // ---> Q:- 2 take entry of 1 or 2 or 3, if 1 print Hello and if 2 print namaste and if 3 print bonjour

//        System.out.println("ENTER NO. FROM 1 or 2 or 3:-");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if(a==1){
//            System.out.println("Hello!!");
//        }
//        else if(a==2){
//            System.out.println("NAMASTE!!");
//
//        }
//        else if(a==3){
//            System.out.println("Bonjour");
//        }else{
//            System.out.println("Entry is invalid!!");
//        }

//        here we can also use switch for this que, it's given below.

//        switch(a){
//            case 1:
//                System.out.println("Hello");
//                break;
//            case 2:
//                System.out.println("Namaste");
//                break;
//            case 3:
//                System.out.println("Bonjour");
//                break;
//            default:
//                System.out.println("given Entry is Invalid");
//        }

        //-----> Homework problem:- Make a calculator.

        System.out.println("Enter value a:-");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter value b;-");
        int b = sc.nextInt();

        System.out.println("Select operation:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");
        System.out.println("5: Modulo (%)");

        int Choose = sc.nextInt();
        int Result;

        switch(Choose){
            case 1:Result=a+b;
                System.out.println("a + b = "+Result);
                break;
            case 2: Result=a-b;
                 System.out.println("a - b = "+Result);
                break;
            case 3: Result=a*b;
                 System.out.println("a x b = "+Result);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("This division is invalid.");
                }else{
                    Result=a/b;
                    System.out.println("a / b = "+Result);
                }

                break;
            case 5:
                if (b == 0) {
                    System.out.println("This Division is Invalid.");
                }else{
                    Result=a%b;
                    System.out.println("a % b = "+Result);
                }
                break;
        }


        /*Q-2 Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

        System.out.println("Enter the number of the month:-");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1:
                System.out.println("It is the month of January");
                break;
            case 2:
                System.out.println("It is the month of February");
                break;
            case 3:
                System.out.println("It is the month of March");
                break;
            case 4:
                System.out.println("It is the month of April");
                break;
            case 5:
                System.out.println("It is the month of may");
                break;
            case 6:
                System.out.println("It is the month of june");
                break;
            case 7:
                System.out.println("It is the month of july");
                break;
            case 8:
                System.out.println("It is the month of august");
                break;
            case 9:
                System.out.println("It is the month of September");
                break;
            case 10:
                System.out.println("It is the month of october");
                break;
            case 11:
                System.out.println("It is the month of november");
                break;
            case 12:
                System.out.println("It is the month of december");
                break;
        }*/


        }
}